import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// Imagine you have a special computer that loves math! 
		// Your job is to give it two numbers and perform math operations. 
		// The computer will do the math for you and show you the answer. 
		// You get to play with addition, subtraction, multiplication, and division

		Scanner name = new Scanner(System.in);
		int x = name.nextInt();
		int y = name.nextInt();
		
		int a = x+y;
		int b = x-y;
		int c = x*y;
		int d = x/y;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
