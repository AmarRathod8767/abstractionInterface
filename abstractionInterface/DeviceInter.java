package abstractionInterface;

public abstract class DeviceInter implements Adevice,Bdevice{

	@Override
	public void i() {
		System.out.println("this is abstract Adevice method");
		
	}

	@Override
	public void j() {
		System.out.println("This is abstrac Bdevice Method");
		
	}

}
