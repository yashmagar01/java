import java.util.Scanner;

class If
{
	public static void main(String[] args)
	{
		System.out.print("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if(age >= 18)
		{
			System.out.println("Your are eligible for driving license!");
		}
		else
			System.out.println("Your are eligible for the driving license! try next year...");
	}
}