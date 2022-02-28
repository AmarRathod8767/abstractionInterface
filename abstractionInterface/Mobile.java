package abstractionInterface;

public class Mobile extends Device{

	
	
	
	void camera() {
        System.out.println("CAMERA");
		
	}

   
	void multimedia() {
		System.out.println("MULTIMEDIA");
		
	}
	void calling() {
		System.out.println("CALLING");
		
	}


	public static void main(String[] args) {
		Device obj=new Mobile();
		   obj.calling();
		   obj.camera();
		   obj.calling();

	}

}
