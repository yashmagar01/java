// Write a program to check multiple conditions using if statement along with logical 
operators. 
import java.util.Scanner;

class If
{
	public static void main(String[] args)
	{
		System.out.print("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if(age <= 12 && age > 1)
		{
			System.out.println("your are a Child..");
		}
		else if(age <= 1)
		{
			System.out.println("You are a Baby..");	
		}
		else if(age >= 13 && age <= 19)
		{
			System.out.println("You are a Teenager..");
		}
		else if(age >= 20 && age <= 64)
		{
			System.out.println("You are an Adult..");
		}
		else if(age > 64)
		{
			System.out.println("You are Senior citizen..");
		}
		else
			System.out.println("Enter your real age stupid....");
	}
}