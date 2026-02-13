import java.util.Scanner;

	class Num
	{
		public static void main(String[] args)
		{
			Scanner num = new Scanner(System.in);
			System.out.println("Enter the no. :");
			int sum = num.nextInt();
			if(sum % 2 == 0)
			{
				System.out.println(num +" Number is the Even");
			}
			else
				System.out.println(num + "Number is the Odd");
		}
	}

			
