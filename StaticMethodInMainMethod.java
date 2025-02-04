package dataandvariable;

public class StaticMethodInMainMethod {
	
	public static void welcome() {
		System.out.println("Welcome to the world of coding");
	}
	public static void addition() {
System.out.println("This is the addition method will call under main method");
	}
	 static void add() 
	 {
		int a=300;
		int b =200;
		int sum = a+b;
		System.out.println(sum);
}
	 static void sub() {
	int a;
	 a=300;
	int b;
	 b = 200;
	 int sub=a-b;
	 System.out.println(sub);
	 }
	 static void multiply() 
	 {
		int a=300;
		int b =200;
		int multi = a*b;
		System.out.println(multi);
	 }
	 static void divd() 
	 {
		int a=300;
		int b =70;
		int div = a/b;
		System.out.println(div);
	 }
	 static void modul() 
	 {
		int a=300;
		int b =70;
		int mod = a%b;
		System.out.println(mod);
	 }
	public static void main(String[] args) {
		
		welcome();
		addition();
		add();
		sub();
		multiply();
		divd();
		modul();
	}

}
