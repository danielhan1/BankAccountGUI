

public abstract class BankAcc

{

	//instance variables

	private String name;

	private static int nextacctNum;

	private int acctNum;

	private double balance;

	

	//constructors

	public BankAcc (String n)

	{

		this.name = n;

		acctNum = nextacctNum;

		acctNum++;

		balance = 0;

	}

	public BankAcc (String n, double b)

	{

		this.name = n;

		acctNum = nextacctNum;

		acctNum++;

		balance = b;

	}

	//methods

	public void deposit(double amt)

	{

		balance = balance + amt;

	}

	public void withdraw (double amt)

	{

		balance = balance - amt;

	}

	public String getName()

	{

		return name;

	}

	public double getBalance()

	{

		return balance;

	}

	public abstract void endOfMonthUpdate();

	

	public void transfer(BankAcc other, double amt)

	{

		withdraw(amt);

		other.deposit(amt);

	}

	public String toString()

	{

		return acctNum + "\t" + name + "\t" + "$" + balance;

	}

}















