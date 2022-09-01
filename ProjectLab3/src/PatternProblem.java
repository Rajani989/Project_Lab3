//program to print a pattern
/*
 *       *
 *       *
 *       *
 *       *
 *       * * * * *
 */


public class PatternProblem {           //class PatternProblem

	public static void main(String... args) {     // Main method
		// TODO Auto-generated method stub
       for(int i=0;i<5;i++)                 //loop to check i<5
       {
    	   for(int j=0;j<5;j++)             //loop to check j<5
    	   {
    		   if(j==0||(i==4 && j>0)) {      
    			   //check the condition of i and j and then print the star 
    			   System.out.print("*");     
    		   }
    		   else
    		   {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println("");
       }
	}

}
