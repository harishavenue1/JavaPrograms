package examples;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadHTML_toExcel {

    public static void main(String[] args) {
        String htmlFilePath = "./newman_report.html"; // Path to your HTML file
        String excelFilePath = "./output.xlsx"; // Path to save the Excel file

        try {
            // Parse the HTML file
            Document doc = Jsoup.parse(new File(htmlFilePath), "UTF-8");
            Elements requestBlocks = doc.select("div.card-body");

            // Set up Excel workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("API Details");
            String[] columns = {"Endpoint", "Description", "Request Body", "Request Headers", "Response Headers", "Response Body"};

            // Create header row
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
            }

            // Populate Excel rows
            int rowNum = 1;
            for (Element block : requestBlocks) {
                Row row = sheet.createRow(rowNum++);

                // Extract and populate Endpoint
                Element endpointElement = block.selectFirst("strong:contains(Request URL:)");
                String endpoint = (endpointElement != null) ? endpointElement.nextElementSibling().text() : "";
                row.createCell(0).setCellValue(endpoint);

                // Extract and populate Description
                Element descriptionElement = block.selectFirst("h5.card-title");
                String description = (descriptionElement != null) ? descriptionElement.text() : "";
                row.createCell(1).setCellValue(description);

                // Extract and populate Request Headers
                Element reqHeaderElement = block.selectFirst("h5:contains(Request Headers) + .table-responsive table");
                String reqHeaders = (reqHeaderElement != null) ? reqHeaderElement.text() : "";
                row.createCell(3).setCellValue(reqHeaders);

                // Extract and populate Response Headers
                Element resHeaderElement = block.selectFirst("h5:contains(Response Headers) + .table-responsive table");
                String resHeaders = (resHeaderElement != null) ? resHeaderElement.text() : "";
                row.createCell(4).setCellValue(resHeaders);

                // Extract and populate Response Body
                Element responseBodyElement = block.selectFirst("h5:contains(Response Body) + .dyn-height code");
                String responseBody = (responseBodyElement != null) ? responseBodyElement.text() : "";
                row.createCell(5).setCellValue(responseBody);
                
                // Request body is added as a placeholder since it's not in the HTML structure
                row.createCell(2).setCellValue(""); // Placeholder for Request Body
            }

            // Auto-size columns for readability
            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Write output to Excel file
            FileOutputStream fileOut = new FileOutputStream(excelFilePath);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();

            System.out.println("Data extracted and saved to " + excelFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
