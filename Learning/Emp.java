import java.util.Scanner;

class Data 
{
	//public:
		int empid;
		String name;
		float salary;
		
		Scanner input = new Scanner(System.in);

		void get_data()
		{
				System.out.print("Enter your Empid: ");
				empid = input.nextInt();

				System.out.print("Enter your Name: ");
				name = input.next();

				System.out.print("Enter your salary: ");
				salary = input.nextFloat();
		}
		
		void put_data()
		{
				System.out.println("Empid: " + empid);
				System.out.println("Name: " + name);
				System.out.println("Salary: " + salary);
		}
}

class Emp
{
	public static void main(String[] yash)
	{
		Data[] data = new Data[5];
	
		for(int i = 0; i < 5; i++)
		{
			System.out.println("\nEnter data of Emp.: " + (i + 1));
			data[i] = new Data();
			data[i].get_data();
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("\nData of Emp.: " + (i + 1));
			data[i].put_data();
		}
		
	}
}