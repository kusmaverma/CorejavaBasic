package dataandvariable;

public class Constructor {

	
		public Constructor() {
			System.out.println("constructor1");
	
		}
		public Constructor(String Name) {
			System.out.println(Name);
		}
		public static void main(String[] args) {
			new Constructor();
			new Constructor("me Constructor");
	}

}
