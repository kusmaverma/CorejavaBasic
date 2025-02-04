package dataandvariable;

public class MethodOverloading {
	public static void display(int a) {
        System.out.println("Static method: the value is " + a);
    }

    public static void display(String msg) {
        System.out.println("Static method: Message is"+" " + msg );
    }

    // Non-static method 
    public void display(double number) {
        System.out.println("Non-static method: Double number is " + number);
    }

    public void display(char word) {
        System.out.println("Non-static method: the word is '" + word + "'");
    }

    public static void main(String[] args) {
        // Call overloaded static methods
        display(10); 
        display("Hello, World!"); 
        // Create an object to call overloaded non-static methods
        MethodOverloading obj = new MethodOverloading();
        obj.display(50.50); // Calls non-static method with double
        obj.display('A'); // Calls non-static method with char
    }
}


