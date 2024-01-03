package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		
//		1
//		121
//		12321
//		1234321

		//Needs twice Math.pow(((Math.pow(n,i)-1)/9),2)
		//ex:i=1 ---> 10^i - 1 = 9 / 9 = 1^2 = 1
		//ex:i=2 ---> 10^i - 1 = 99 / 9 = 11^2 = 121
		
		int lines=5;
		for (int i=1; i<=lines; i++) {
			System.out.println((int)Math.pow(((Math.pow(10, i) - 1)/9),2));  //ex:i=2 ---> 10^i - 1 = 99 / 9 = 11^2 = 121
		}

		System.out.println("-------");
//		1
//		22
//		333
//		4444
//		55555

		//Needs Single (Math.pow(n,i)-1)/9 * i
		//ex:i=1 ---> 10^i - 1 = 9 / 9 = 1*i = 1
		//ex:i=2 ---> 10^i - 1 = 99 / 9 = 11*i = 22
		
		for (int i=1; i<=lines; i++) {
			System.out.println((int) ((Math.pow(10, i) - 1)/9) * i);
		}
	}
}
