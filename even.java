/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num;
    System.out.println("Enter an  number:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 2 == 0 )
    {
        System.out.println("even");
    }
    else if(num%2<0)
    {
    	System.out.println("invalid");
    }
        
       else
       {
     
        System.out.println("odd");
  }
}
}	
