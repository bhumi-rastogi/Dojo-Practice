import java.util.Scanner;
public class DivisibleBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that checks whether a given number is divisible by both 3 and 5.
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		if ((x%3==0) && (x%5==0)) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divisible");
		}
	}

}
