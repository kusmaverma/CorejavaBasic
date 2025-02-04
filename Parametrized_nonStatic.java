package dataandvariable;

public class Parametrized_nonStatic {// Write a program to call a Non-Static Parametrized method 
	public void param(int a, String b) {
		System.out.println(b+ " "+a);
	}
	
	public void param1(String a, char b) {
		System.out.println(a+ " "+b);
	}
	public static void main(String[] args) {
			
		Parametrized_nonStatic refv1=new Parametrized_nonStatic();
		
		refv1.param1("Gender", 'F');
		refv1.param(100, "you");
		}
        
}
