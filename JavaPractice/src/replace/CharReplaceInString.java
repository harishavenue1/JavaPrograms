package replace;

public class CharReplaceInString {

	
	public static void main(String[] args) {
		String s = "tomorrow";
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<s.toCharArray().length; i++) {
			if (s.charAt(i) == 'o') {
				for (int c=0; c<count; c++) {
					sb.append("$");
				}
				count++;
				s = s.substring(0,i) + sb.toString() + s.substring(i+1);
				sb = new StringBuilder();
			}
		}
		System.out.println(s);
	}
	
//	public static String returnConcatItem (int len) {
//		
//		StringBuilder sb = new StringBuilder();
//		for (int i=0; i<len; i++) {
//			sb.append("$");
//		}
//		
//		return sb.toString();
//	}
 }
