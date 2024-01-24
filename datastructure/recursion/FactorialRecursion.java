package datastructure.recursion;

public class FactorialRecursion {
	
	public static void main(String[] args)
	{
		FactorialRecursion f = new FactorialRecursion();
		 
	        System.out.println("Factorial of 3 is "
	                           + f.fact(3));
	        System.out.println("Factorial of 4 is "
	                           + f.fact(4));
	        System.out.println("Factorial of 5 is "
	                           + f.fact(5));
		
	}
	
	int fact(int n)
	{
	    if (n <= 1) // base case
	        return 1;
	    else    
	        return n*fact(n-1);    
	}


}