// Write a program to check switch-case using character datatype. 

import java.util.Scanner;

class Grade
{

	public static void main(String[] yash)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade(in Capital): ");
		char grade = input.next().charAt(0);
		
		switch(grade)
		{
			case 'A': 
				System.out.println("Exellent Performance!!");
				break;
			case 'B':
				System.out.println("Very Good!!");
				break;
			case 'C':
				System.out.println("Good!!");
				break;
			case 'D':
				System.out.println("Passed!!");
				break;
			case 'F':
				System.out.println("Failed");
			default:
				System.out.println("Enter a correct Grade..");
		}
		
	}
	
	
}