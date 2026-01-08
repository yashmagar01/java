// Write a program to display 1 to 20 numbers using for, while and do-while loop. 

class Loops
{
	public static void main(String[] yash)
	{
		int i = 1;
		System.out.println("By For Loop...");
		for(i = 1; i<=20;i++)
		{
			System.out.println(i);
		}
		
		int j = 1;
		System.out.println("By While Loop...");
		while(j<21)
		{
			System.out.println(j);
			j++;
		}

		System.out.println("By Do-While Loop...");
		int k = 1;
		do
		{
			System.out.println(k);
			k++;
		}while(k<21);
	}
}