package abstractionInterface;

public abstract class Bank {
	String s;
	void bank()
	{
		s="Bank of Baroda";
		System.out.println("Welcome to "+s);
	}
	abstract void credit(int amt);
	abstract void debit(int amt);
	abstract void checkBalance();

}
