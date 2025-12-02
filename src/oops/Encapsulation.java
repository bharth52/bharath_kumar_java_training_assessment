package oops;

 class BankAccount {
	private long accNo;
	private float balance;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

}
public class Encapsulation
{
	
	public static void main(String[] args)
	{
		BankAccount bank =  new BankAccount();
		bank.setAccNo(3456789);
		long accNo=bank.getAccNo();
		System.out.println("The account Number is : "+accNo);
	}

}
