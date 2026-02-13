/*Write a program to implement different types of constructors to perform addition of 
complex numbers?*/
class complex
{

	int real,img;
	complex()
	{
		real=20;
		img=10;
	}
	complex(int r,int i)
	{
		real = r;
		img = i;
	}	
	void add(complex c1,complex c2)
	{
		
	        real= c1.real +c2.real;
		img=c1.img+c2.img;
		System.out.println(real+"+"+img+"i");	

	}
	
}
class complexnum
{
	public static void main(String args[])
	{
		complex o1 = new complex();
		complex o2 = new complex(30,40);
		complex o3 = new complex();
		o3.add(o1,o2);
		o3.display();
		
	}


}