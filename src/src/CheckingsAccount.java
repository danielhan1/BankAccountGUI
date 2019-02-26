/**

 * 

 * @author Daniel Han

 * PD 7

 */

public class CheckingsAccount extends BankAcc

{

	final double OVER_DRAFT_FEE;

	final double TRANSACTION_FEE;

	final double FREE_TRANS;

	private int numTransactions; 



public CheckingsAccount(String n, double b, double odf, double tf, int freeTrans)

{

	super (n, b);

	OVER_DRAFT_FEE = odf;

	TRANSACTION_FEE = tf;

	FREE_TRANS = freeTrans;

}

public CheckingsAccount(String n, double odf, double tf, int freeTrans)

{

	super (n);

	OVER_DRAFT_FEE = odf;

	TRANSACTION_FEE = tf;

	FREE_TRANS = freeTrans;

}

public void deposit (double amt)

{

	if (amt < 0)

	{

		throw new IllegalArgumentException();

	}

	else

	{

		super.deposit(amt);

		numTransactions++;

		

		if (numTransactions > FREE_TRANS)

		{

			super.withdraw(TRANSACTION_FEE);

		}

	}

}



public void withdraw (double amt)

{

	if (amt < 0 || getBalance() < 0)

	{

		throw new IllegalArgumentException();

	}

	else

	{

		super.withdraw(amt);

		numTransactions++;

		

		if (numTransactions > FREE_TRANS)

		{

			super.withdraw(TRANSACTION_FEE);

		}

		if (getBalance() < 0)

		{

			super.withdraw(OVER_DRAFT_FEE);

		}

		

	}

}

public void transfer (BankAcc other, double amt)

{

	if (getName().equals(other.getName()) && getBalance() >= amt)

	{

		super.transfer(other,amt);

	}

	else

	{

		

		throw new IllegalArgumentException();

	}

}

public void endOfMonthUpdate()

{

	numTransactions = 0;

}

}