package abstractionInterface;

public class ImplDevice extends DeviceInter{
    void hi()
    {
    	System.out.println("HI");
    }
	public static void main(String[]args)
	{
		ImplDevice ob=new ImplDevice();
		DeviceInter o=new ImplDevice();
		o.add();
		o.i();
		o.j();
		Adevice.sub();
		Bdevice.demo();
		ob.hi();
	}
	
	
}
