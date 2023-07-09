package Project;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) 
	{
		int balance=50000;
		int withdraw, deposit;
		Scanner sc=new Scanner(System.in);
		
		{
			System.out.println("Wlcome to ATM....");
			System.out.println("Enter 1 for Withdraw");
			System.out.println("Enter 2 for Deposit");
			System.out.println("Enter 3 for Check Balance");
			System.out.println("Enter 4 for Exit");
			System.out.println("Select the appropiate option you want to perform");
			int option=sc.nextInt();
			switch(option)
			{
			case 1: System.out.println("Enter the amount to be withdraw::");
			         withdraw=sc.nextInt();
			         withdraw(balance,withdraw);
			         break;
			case 2: System.out.println("Enter the amount to be deposit::");
			         deposit=sc.nextInt();
			         deposit(balance,deposit);
			         break;
			case 3:printBalance(balance);
	                 System.out.println(" ");
	                 break;        
			default: System.out.println("Sysyem exit...");
			}
			
		}
		
	}


        public static void printBalance(int balance)
        {
        	System.out.println("The current balance :"+balance);
        	System.out.println();
        }
        public static int withdraw(int balance, int withdrawAmount)
        {
        	System.out.println("Withdrawn Operation :");
        	System.out.println("The withdrawing Amount is ::" + withdrawAmount );
        	if (balance >= withdrawAmount)
        	{
        		balance = balance - withdrawAmount;
        		System.out.println( "Please collect your money and remove the card" );
        		printBalance( balance );
            }
        	else
        	{
        		System.out.println("Sorry ! the balance is unsufficent.");
        		System.out.println();
        	}
        	return balance;
      }
        public static int deposit(int balance, int depositAmount)
        {
        	System.out.println("Deposit Operation :");
        	System.out.println("The deposit amount is ::" + depositAmount);
        	balance = balance + depositAmount;
        	System.out.println("Your money is Succesfully Deposited");
        	printBalance(balance);
        	return balance;
        }

}
