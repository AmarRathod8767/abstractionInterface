package abstractionInterface;

public interface Adevice {
	
	default void add()
	{
		System.out.println("Add is a defoult method");
	}
	static void sub()
	{
		System.out.println("Sub is a Static method");
	}
	
	void i();
    
}
