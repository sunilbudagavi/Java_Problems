// package July_Practice;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
//		Creating the Object for the taking user input
//		Scanner input system source
//		System.in = input stream
		Scanner scanner = new Scanner(System.in);
//		Asking question 
		System.out.println("What is your name buddy ");
//	    taking user input as String data type with variable_Name (name)
		String name = scanner.nextLine();
		System.out.printf("Hello welcome to Amazon MR. %s \n", name);
//		Asking the user to input their current state of mind
		System.out.println("What is your current status ");
		String status = scanner.nextLine();
		System.out.println("Oh Nice to hear that, What is your age: ");
		int Age = scanner.nextInt();
		System.out.println("Thanks for giving me your information ");
		
	}
}
