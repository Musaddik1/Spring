package business;

public class Bank {
	
	
	private String acno="sbi123";
	private int amount=5000;
	
	public int deposite(int amount,String acno)
	{
		if(this.acno.equals(acno))
		{
			System.out.println("In deposite method..");
			this.amount=this.amount+amount;
			return amount;
		}
		else
		{
			return 0;
		}
	}
	

}
