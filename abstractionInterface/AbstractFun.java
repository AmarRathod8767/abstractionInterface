package abstractionInterface;

public class AbstractFun extends AbstractClass {
	private int a,b,c;
	void accept(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void add()
	{
		c=a+b;
	}
	
	

	void div()
	{
		c=a/b;
	}
	
	
	void sub()
	{
		c=a-b;
	}
	 
	void mult()
	{
		c=a*b;
	}
	void areaOfTri()
	{
	c=(a*b)/2;
	}
	void display()
	{
		System.out.println(c);
	}
	/*void show()
	{
		
		System.out.println(a+","+b);
	}*/
	
}

