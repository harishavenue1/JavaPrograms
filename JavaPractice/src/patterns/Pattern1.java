package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		
//		1
//		121
//		12321
//		1234321
		
		int lines=5;
		for (int i=1; i<=lines; i++) {
			System.out.println((int)Math.pow(((Math.pow(10, i) - 1)/9),2));
		}

		System.out.println("-------");
//		1
//		22
//		333
//		4444
//		55555
		for (int i=1; i<=lines; i++) {
			System.out.println((int) ((Math.pow(10, i) - 1)/9) * i);
		}
	}
}
