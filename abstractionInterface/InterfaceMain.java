package abstractionInterface;

public class InterfaceMain implements I,I1,InterfaceName{

	@Override
	public void fun() {
		System.out.println("This is Interfacname class method");
		
	}

	@Override
	public void fun2() {
		System.out.println("This is i1 class Method");
		
		
	}

	@Override
	public void fun1() {
		System.out.println("This is i class method");
		
	}
	public static void main(String[]args)
	{
		InterfaceMain obj=new InterfaceMain();
		obj.fun();
		obj.fun1();
		obj.fun2();
	
	}

}
