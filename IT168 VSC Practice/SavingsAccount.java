

/**
 * A very simplified savings account class for object demonstration purposes
 * 
 * @author Mary Elaine Califf
 *
 */
public class SavingsAccount
{
	public static final double DEFAULT_INTEREST_RATE = 0.0125;
	private double balance;
	private double interestRate;
	
	/**
	 * Constructor that takes all values
	 * @param startBalance The starting balance for the account
	 * @param interestRate The annual interest rate for the account
	 */
	public SavingsAccount(double startBalance, double interestRate)
	{
		this.balance = startBalance;
		this.interestRate = interestRate;
	}
	
	/**
	 * Constructor that uses default interest rate
	 * @param startBalance The starting balance for the account
	 */
	public SavingsAccount(double startBalance)
	{
		this(startBalance,DEFAULT_INTEREST_RATE);
	}
	
	/**
	 * Default constructor
	 */
	public SavingsAccount()
	{
		this(0.0,DEFAULT_INTEREST_RATE);
	}
	
	/**
	 * Getter for savings account balance
	 * @return The balance in the account
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Withdraw funds from the savings account
	 * @param amountToWithdraw Amount of the withdrawal
	 */
	public void withdraw(double amountToWithdraw)
	{
		if (balance >= amountToWithdraw)
		{
			balance = balance - amountToWithdraw;
		}
		else
		{
			System.out.println("Insufficient funds. Withdrawal could not be completed");
		}
	}
	
	/**
	 * Deposit funds into the savings account
	 * @param amountToDeposit Amount of the deposit
	 */
	public void deposit(double amountToDeposit)
	{
		balance = balance + amountToDeposit;
	}
	
	/**
	 * Handle end of month processing. For a savings account, this consists of computing 
	 * the interest earned for the month and adding it to the balance.
	 */
	public void processEndOfMonth()
	{
		double monthlyInterest = balance * interestRate / 12;
		balance = balance + monthlyInterest;
	}
}
