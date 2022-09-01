

import java.util.Scanner;

abstract class Account
{
   public abstract void getBalance();
   public abstract void depositeAmount();
   public abstract void withdrawAmount();
}

class CurrentAc extends Account
{
	int balance=1000,transFee=10;
	public void getBalance()
	{
		
	}
	public void depositeAmount(int amt)
	{
	balance=balance+amt-transFee;	
	}
	public void withdrawAmount(int amt)
	{
	balance=balance-amt-transFee;	
	}
}

class SavingAc extends Account
{
	int balance=1000;
	public void getBalance()
	{
		
	}
	public void depositeAmount(int amt)
	{
		balance=balance+amt;
	}
	public void withdrawAmount(int amt)
	{
		balance=balance-amt;	
	}
}

public class AccountProblem {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of Account: 1.Current Account/2.Saving Account");
		int type=sc.nextInt();
		System.out.println("Enter the Account number: ");
		int num=sc.nextInt();
        System.out.println("what you want 3.deposite/4.withdraw: ");
        int val=sc.nextInt();
        System.out.println("Enter the amount: ");
        int amt=sc.nextInt();
         System.out.println("Press number: 3.Deposite 4.Withdraw 5.GetBalance") 
        Account ca=new CurrentAc();
         Account sa=new SavingAc();
        
        switch(type)
        {
        case 1: 
        	    switch(val)
        	    {
        	    case 3: ca.depositeAmount(amt);
        	    break;
        	    case 4: ca.withdrawAmount(amt);
        	    break;
        	    case 5: ca.getBalance();
        	    
        	    }
        case 2:
        	 switch(val)
     	    {
     	    case 3: ca.depositeAmount(amt);
     	    break;
     	    case 4: ca.withdrawAmount(amt);
     	    break;
     	    case 5: ca.getBalance();
     	    }
        }
        
	}

}
