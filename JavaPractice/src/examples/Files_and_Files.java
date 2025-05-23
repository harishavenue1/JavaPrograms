// tip: each public class is put in its own file
package examples;

import java.io.File;
import java.io.*;
public class Files_and_Files
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        File f = null;
        try {
            f = new File("./src.txt");
            f.createNewFile();
        } catch(Exception e) {
            System.out.println("Failed to Create file");
        }

        // write
        try {
            PrintWriter fw = new PrintWriter(f);
            fw.println("Written By Harish using PrintWriter - Line1");
            fw.println("Written By Harish using PrintWriter - Line2");
            fw.flush();
            fw.close();
            
        } catch(Exception e) {
            System.out.println("Failed to write file");
        }

        // read
        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(f));
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Failed to read file");
        }
    }
}