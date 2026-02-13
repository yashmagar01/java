// Develop a program to find area of rectangle and circle using interfaces.

interface shpae
{
	void area();
}

class Rectangle
{
	int l = 10, b = 5;
	public void area()
	{
		System.out.println("Area of rectangle: " + l*b);
	}
}

class Circle
{
	double r = 7.13;
	public void area()
	{
		System.out.println("Area of circle: " + 3.14*r*r);
	}
}

class Demo_area
{
	public static void main(String yash[])
	{
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();

		r1.area();
		c1.area();
	}
}
