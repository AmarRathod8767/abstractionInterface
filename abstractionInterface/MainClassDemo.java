package abstractionInterface;

public class MainClassDemo extends AbstractClassDemo  implements InterfaceDemo1{

	public static void main(String[] args) {
		//NormalClassDemo obj=new NormalClassDemo();
		MainClassDemo obj1=new MainClassDemo();
		obj1.a();
		obj1.abs();
		obj1.b();
	

	}

	@Override
	public void a() {
		System.out.println("This method is Interface");
		
	}

	@Override
	void abs() {
		System.out.println("This Method is Abstract class");
		
	}

	@Override
	public void b() {
		
		System.out.println("This Method is Interface Demo 1");
		
	}

}
