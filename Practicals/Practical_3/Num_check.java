// Write a program to check no is even or odd.

import java.util.Scanner;

class Num_check
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		if(num % 2 == 0)
		{
			System.out.println(num + " is Even Number..");
		}
		else
			System.out.println(num + " is Odd number..");
	}
}