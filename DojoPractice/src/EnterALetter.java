import java.util.Scanner;

public class EnterALetter {

	public static void main(String[] args) {
//		Let's learn how to make the computer listen to us and do something based on what we say. 
//		Imagine you have a magic box that can understand numbers. 
//		You're going to tell this magic box a number, and then it will show that number to you. 
//		Here's what you need to do step by step: Ask for a Number: First, you'll need to ask the person using the computer to type in a number. 
//		It could be any number they like! Remember the Number: After they type in the number, you're going to keep that number safe in a special box called a "variable". 
//		Think of the variable as a labeled container where you can store things. 
//		Show the Number: Once you've kept the number in the variable, you'll ask the computer to show it to you. 
//		The computer will use a special way to display the number on the screen. If you give 5 as input, then output should be : You entered: 5 To do all of this, you'll need to use a special language that the computer understands. 
//		Are you ready? Let's start by telling the computer to listen for a number, save it, and then show it back to us. 
//		You've got this! 🪄💻🔢
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		System.out.println("You entered: "+x);
	}

}
