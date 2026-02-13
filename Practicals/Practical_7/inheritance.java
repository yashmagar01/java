class base
{
	void display()
	{
		System.out.println("Base class");
	}	
}
class derived extends base
{
	void display1()
	{
		System.out.println("Derived base");
	}	
}


class inheritance
{
	public static void main(String[] args)
	{
		derived d1 = new derived();
		d1.display();
		d1.display1();		
		
	} 
}