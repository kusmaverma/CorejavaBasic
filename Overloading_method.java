package dataandvariable;

public class Overloading_method {
int a;

//static method with same name
public static void me(int age,String name) {
	System.out.println(age +"  " + name);
}
//nonststic method
public void me(byte id,String name) {
	System.out.println(id +"  "+  name);
}
void man(int a ,int b,byte c,long d,float f,short s) {
	
}
public static void main(String args[]) {
	
	me(30,"kusm");
	Overloading_method refencev= new Overloading_method();
	refencev.me(1, "kuss");
}
}
