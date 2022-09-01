/*Define class Account and it has two subclass
CurrentAc and SavingsAc, Saving account and Current
 Account has three method getBalance , deposit Amount,
 Withdraw Amount(Abstract method implements by subclass), Savings account
  has no transaction fee but current Account has transaction Fee 10 rs per transaction in Bank. */

import java.util.Scanner;

abstract class Account                                //abstract class account
{
   public abstract void getBalance();
   public abstract void depositeAmount1(int amt);
   public abstract void withdrawAmount1(int amt);
}

class CurrentAc extends Account                          //current account extends account
{
	int balance=1000,transFee=10;
	public void getBalance()                               //getBalance method
	{
		System.out.println("Balance is: "+balance);
	}
	
	public void depositeAmount1(int amt)                       //depositeAccount method
	{ 
		balance=balance+amt-transFee;	
		System.out.println("Balance is: "+balance);
	}
	@Override
	public void withdrawAmount1(int amt)                          //withdrawAccount method
	{
		balance=balance-amt-transFee;	
		System.out.println("Balance is: "+balance);
	}
	
}

 class SavingAc extends Account                         //Saving Account extends Account
{
	int balance=1000;
	public void getBalance()                              //getBalance method
	{
		System.out.println("Balance is: "+balance);
	}
	
	public void depositeAmount1(int amt)                       //depositeAccount method
	{

		balance=balance+amt;
		System.out.println("Balance is: "+balance);
	}
	@Override
	public void withdrawAmount1(int amt)                            //withdrawAccount method
	{
		balance=balance-amt;
		System.out.println("Balance is: "+balance);
	}
	
}

public class AccountProblem1 {                                 //class AccountProblem

	public static void main(String... args) {                  //Main method
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);                      //Take input the details
		System.out.println("Enter the type of Account: 1.Current Account/2.Saving Account");
		int type=sc.nextInt();
		System.out.println("Enter the Account number: ");
		int num=sc.nextInt();
        System.out.println("what you want : ");
        System.out.println("Press number: 3.Deposite 4.Withdraw 5.GetBalance"); 
        int val=sc.nextInt();
        System.out.println("Enter the amount: ");
        int amt=sc.nextInt();
      
         
        Account ca=new CurrentAc();              //call the method
         Account sa=new SavingAc();              //call the method
        
        switch(type)                  //switch statements to call and print
        {
        case 1: 
        	    switch(val)
        	    {
        	    case 3: ca.depositeAmount1(amt);
        	    break;
        	    case 4: ca.withdrawAmount1(amt);
        	    break;
        	    case 5: ca.getBalance();
        	    break;
        	    
        	    }
        	    break;
        case 2:
        	 switch(val)
     	    {
     	    case 3: ca.depositeAmount1(amt);
     	    break;
     	    case 4: ca.withdrawAmount1(amt);
     	    break;
     	    case 5: ca.getBalance();
     	    break;
     	    }
        }
        
	}

}
