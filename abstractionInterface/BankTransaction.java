package abstractionInterface;

public class BankTransaction extends Bank {
	private static  int balance=5000;
	void credit(int amt)
	{
		balance=balance+amt;
		System.out.println("Credit amount is "+amt);
	}
	void debit(int amt)
	
	{
		balance=balance-amt;
		System.out.println("Debit amt is "+amt);
	}
	void checkBalance()
	{
	   
		System.out.println("Your balance is "+balance);
	}
	
	public static void main(String[]args)
	{
		
		System.out.println("Your Balance is "+balance);
		//BankTransaction obj=new BankTransaction(); //ok
		Bank obj=new BankTransaction(); //ok
		//Bank obj=new Bank(); //not ok
		obj.credit(10000);
		obj.debit(3000);
		obj.checkBalance();
	}

}
