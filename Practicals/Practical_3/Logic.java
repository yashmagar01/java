// Develop a program to use logical operators in do-while loop. 

import java.util.Scanner;

class Logic
{
	public static void main(String[] yash)
	{
		Scanner input = new Scanner(System.in);
		int choice;
		do{
			System.out.println("\n---Age Teller---\n1. Enter into the program,\n0.Exit\n ");
			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			if(choice == 1){
			System.out.print("\nEnter your age: ");
			int age = input.nextInt();

			if(age <= 12 && age > 1)
			{
				System.out.println("\nyour are a Child..");
			}
			else if(age <= 1)
			{
				System.out.println("\nYou are a Baby..");	
			}
			else if(age >= 13 && age <= 19)
			{
				System.out.println("\nYou are a Teenager..");
			}
			else if(age >= 20 && age <= 64)
			{
				System.out.println("\nYou are an Adult..");
			}
			else if(age > 64)
			{
				System.out.println("\nYou are Senior citizen..");
			}
			else{
				System.out.println("\nEnter your real age stupid....");
			}}
		
		}while(choice == 1);
	}
}