package dataandvariable;

public class StaticandNonStaticMethod_examples {
	
	public static void message ()//Static method 1
	{
		System.out.println("This is my first static method");
	}
	
	public static void addition()//Static method 2
	{
		int a= 300;
		int b = 400;
		int sum = a+b;
		System.out.println("This is the second static method and the out of 2 variables="+ sum);  
	}
	
    public static void details()//Static method 3
    {
    	String name="Kusma";
    	byte age=30;
    	String designation= "QA";
    	System.out.println("My details-  " +name+",  " +age+" ,  " +designation);    			
    }
    
    public void greetmessage()//NonStatic method 1
    {
    	System.out.println("This is 1st non static method");
    }
	
    public void address()//NonStatic method 2
    {
    	String add= "179061,Himachal Pradesh";
    	System.out.println("My address:"+add);
    }

	public static void main(String[] args) {
		//calling  static method 
		message();
		addition();
		details();
		
		//calling non static method 
		StaticandNonStaticMethod_examples s1=new StaticandNonStaticMethod_examples();
		s1.greetmessage();
		StaticandNonStaticMethod_examples s2=new StaticandNonStaticMethod_examples();
		s2.address();
	}

}
