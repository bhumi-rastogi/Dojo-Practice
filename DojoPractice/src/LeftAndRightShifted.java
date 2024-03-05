import java.util.Scanner;

public class LeftAndRightShifted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program that demonstrates the concept of bitwise shifting. Your program should take an integer input from the user, perform left shift and right shift operations, and display the results
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
	
	System.out.println("Left Shifted: "+(a<<1));
	System.out.println("Right Shifted: "+(a>>1));
	}

}
