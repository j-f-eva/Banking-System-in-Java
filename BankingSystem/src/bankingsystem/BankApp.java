package bankingsystem;
import java.util.Scanner ;
public class BankApp {
    static Scanner scan = new Scanner(System.in) ;
    public static void main(String[] args) {
        Bank bank = new Bank("Bangladesh Bank") ;
        while  (true)
        {
            int option = showmenu();
            switch(option)
            {
                //addAccount
             case 1 :
                System.out.println("please enter name and balance for adding new account..");
                String name = scan.next() ;
                double balance = scan.nextDouble() ;
                bank.addAccount(name, balance);
                break ;
                 //deposit
             case 2 :   
                 System.out.println("please enter account number and amount of money for Deposit..");
                 String accnum =scan.next() ;
                 double amount= scan.nextDouble() ;
                 bank.deposit(accnum, amount);
                 break;
                 //withdraw
             case 3 :
                 System.out.println("please enter an account number and amount of money for withdraw..");
                 String accNum = scan.next() ;
                 double Amount = scan.nextDouble();
                 bank.withdraw(accNum, Amount);
                 break ;
                  //display
             case 4:    
                 System.out.println("please enter the account number for displaying the Account Info");
                 String p = scan.next() ;
                 bank.display(p);
                 break ;
                 //display all
             case 5 : 
                 System.out.println(bank.bankName+" all Account INFO");
                 bank.display();
                 break ;
                 
                //Exit
             case 0:
                 System.exit(0);             
            }     
        }
            
    }

   public static int showmenu()
   {
        System.out.println("\n PLEASE press 1 For new Account \n Press 2 Deposit  \n Press 3 for withdraw \n Press 4 for Display Particular Account \n Press 5 For display all accounts \n Press 0 for Exit ..");
       
       int k = scan.nextInt() ;
       return k;
       
   }
}
