package dataandvariable;

public class Methods_Constructors_overloading {
//Write a program on method Overloading and consturctor overloading
	
	
	// 1st Constructor Overloading with int parameter
	public Methods_Constructors_overloading(int a) {
        System.out.println("Constructor with int: The value is " + a);
    }

   
	//2nd  Constructor Overloading with String parameter
    public Methods_Constructors_overloading(String msg) {
        System.out.println("Constructor with String: Message is " + msg);
    }

   
    // 1st Static method Overloading with double parameter
    public static void display(double number) {
        System.out.println("Static method: Double number is " + number);
    }

    //2nd  Non-static method Overloading with char parameter
    public void display(char word) {
        System.out.println("Non-static method: The word is '" + word + "'");
    }

    public static void main(String[] args) {
        // Call static method
        display(10.90); 

        // Create an object to call constructor with int parameter
        Methods_Constructors_overloading refv = new Methods_Constructors_overloading(10);

        // Create an object to call constructor with String parameter
        Methods_Constructors_overloading refv9 = new Methods_Constructors_overloading("Hello, this is constructor 2!");

        // Create an object to call overloaded non-static methods
        Methods_Constructors_overloading v = new Methods_Constructors_overloading('A');
/*        v.display('a');
        */
    }
}