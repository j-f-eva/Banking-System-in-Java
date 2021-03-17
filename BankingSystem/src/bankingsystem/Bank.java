package bankingsystem;

import java.util.ArrayList;


//problem-2..


public class Bank {
	String bankName ;
	
	ArrayList<BankAccount> accounts =new ArrayList<>();
	
				///task-a.
	public Bank(String bankName) {
		super();
		this.bankName = bankName ;
	}
	
					///task-b
	private void addaccount(BankAccount acc) 
	{
		accounts.add(acc) ;
	}
	
				   ///task - c

	void addAccount(String name, double balance) 
	{
		BankAccount  ba= new BankAccount(name,balance) ; //creating object
		addaccount(ba) ;         //method
	}
	
				 ///task-d
	BankAccount findAccount(String accNum)
	{
		for(int i=0;i < accounts.size();i++)
		{
			BankAccount ba = accounts.get(i) ;
			if(ba.accNumber.equals(accNum))
			{
				return ba ;
			}
		}
                return null ;
	}
        
                                ///task-e
         void deposit(String accNum, double depAmount)
         {
             BankAccount ba = findAccount(accNum) ;
             if(ba!=null)
             {
                 ba.deposit(depAmount);
             }
             else
             {
                 System.out.println("Account is null..");
             }
         
         }
         
                            ///task-f
         void withdraw( String accNum,double withAmount)
         {
             BankAccount ba = findAccount(accNum) ;
             if(ba!=null)
             {
                 ba.deposit(withAmount);
             }
             else
             {
                 System.out.println("Account is null..");
             } 
         }
         
                            ///task-g
         void display(String accNum)
         {
              BankAccount ba = findAccount(accNum) ;
              if(ba!=null)
             {
                 ba.display();
             }
             else
             {
                 System.out.println("Account is null..");
             }
         }
         
                         ///task-h
         
         
         void display()
         {
             for (int i = 0; i < accounts.size(); i++) {
                 BankAccount ba = accounts.get(i) ;
                 ba.display();
                 
             }
         }       
}