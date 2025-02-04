package dataandvariable;

public class Four_If_false_Excustion {

	public static void main(String[] args) {
		 int a = 123;
		 
	        if (a > 200) // 1st condition: Check if 'a' is greater than 200
	        {
	            System.out.println("A is greater than 200");
	        }

	        
	        if (a % 2 == 0) // 2nd condition: Check if 'a' is divisible by 2
	        	{
	            System.out.println("A is divisible by 2");
	        }

	        
	        if (a < 20 && a == 100) // 3rd condition: Check if 'a' is less than 20 and equal to 100
	        {
	            System.out.println("A is less than 20 and equal to 100");
	        }

	       
	        if (a % 10 == 0 || a==200) // 4th condition: Check if 'a' is divisible10 or A is equal to 200
	        {
	            System.out.println("A is divisible by 10");
	        }
	    }
	}
