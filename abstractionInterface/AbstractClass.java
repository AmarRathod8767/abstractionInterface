package abstractionInterface;

abstract class AbstractClass extends AbstractClass1{
  int a,b;
	int c;
	abstract void accept(int a,int b);
	abstract void add();
	abstract void mult();	
	abstract void div();	
	abstract void sub();
	void show(int x,int y)
	{
		a=x;
		b=y;
		
		
		//System.out.println(c);
	}
	void fun()
	{
		c=a+b;
		System.out.println(c);
	}
	abstract void display();

	
  
}
