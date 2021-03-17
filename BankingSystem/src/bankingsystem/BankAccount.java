

            ///problem-1
package bankingsystem;
import java.util.Random;

public class BankAccount {
	String memberName, accNumber ;
	double accountBalance ;

	public BankAccount(String memeberName, double accountBalance) {
		super();
		this.memberName = memeberName;
		this.accountBalance = accountBalance;
		Random rand = new Random();
		accNumber = 10000 + rand.nextInt(89999) + "";
		

	}
	//task - a.
		void deposit(double depAmount)
		{
		accountBalance +=depAmount;
		}
	
	//task- b.
		
			void withdraw(double withAmount)
		{
			if(accountBalance >=withAmount)
			{
				accountBalance -=withAmount ;
			}
			else
			{
				System.out.println("insufficient balance");
			}
		}
			
	//task-c..
	String getAccNum()	
	{
		return accNumber ;
	}
	
   //task-d..
	double getBalance()
	{
		return accountBalance;
	}
	void display()
	{
		System.out.println("Name :" +memberName+" Account Number: " +accNumber+"Balance: "+accountBalance);
	}

}








