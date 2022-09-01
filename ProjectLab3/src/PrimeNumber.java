//program to print prime number b/w 100 to 200 number range.

public class PrimeNumber {             //class Prime Number

	public static void main(String... args) {     //Main method
		// TODO Auto-generated method stub
		
      System.out.println("The prime b/w 100 to 200 number range is: ");
      prime();                                  //call the prime method                 
	}

	
	static void prime()                  //defining the method prime
	{
		 String prime_num="";
		   int flag=0 ,val=0;
		  
		   for(int i=100;i<=200;i++)         //loops b/w 100 to 200
		   {
			   flag=0;
			  for( val=i;val>=1;val--)
				  {
					  if((i%val)==0)
					  {
						  flag+=1;
						 
					  }
				  }
				  if(flag==2)
				  {
					  //value of prime number
					  prime_num=prime_num+i+" ";
					}
		   }
		   //print all value of prime number
		   System.out.print(prime_num+" ");
	   }
	
	
}
