package dataandvariable;

public class Variables {
//WAP to declare and establish the use of global and local variables, and then the use of final variable
	
		// Static variables
		static int a;
		static byte b= 127;
		
		//Non Static variables
		String s="hi this is non ststic variables ";
		
		//final variables
		final double pi= 3.14;
	
public static void main(String[] args) {
	//intializing here in main method	
	a=20;
     
	//calling static variable 
	System.out.println("This is the static variable a's value ="+" "+ a);
	//calling non static variables 
     Variables v1= new Variables();
     System.out.println("This is the non ststic variables value ="+" "+v1.s);
   //calling final variables 
     Variables v2=new Variables();
     System.out.println("The final variable where calculating the value"+" "+v2.pi*a);
	}

}
