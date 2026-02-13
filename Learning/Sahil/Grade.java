// Write a program to accept marks and find grade using if statement.

import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		Scanner per = new Scanner(System.in);
		System.out.println("Enter the no. for the Perecntage ");
		int divya = per.nextInt();
		if(divya>=75)
			System.out.println("Distintion");
		else if(divya>=60)
			System.out.println("First Class ");
 		else if(divya>=40)
			System.out.println("Second class");
		else
			System.out.println("FAILLL..");
	}
}		