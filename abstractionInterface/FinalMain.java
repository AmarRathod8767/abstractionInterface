package abstractionInterface;


public class FinalMain extends Finala
{   
	
    void finalA()
    {
    	super.finalA();
    	System.out.println("Overriding");
    }
    public static void main(String[]args) {
    	
    	
    	
    	FinalMain ob=new FinalMain();
    	ob.finalA();
}}
