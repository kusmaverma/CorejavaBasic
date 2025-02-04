package dataandvariable;

public class Nonststic3Methodand_access {
	
 void person()// 1st non static method
 {
	 System.out.println("This is your Details");
	 
 }
	public void yourage(int birthyear)//2nd static method
	{
		int currentyear=2024;
		int age= currentyear- birthyear;
		System.out.println(age);
	}
	public void details(String oocupation)
	{
	System.out.println("QA Engineer");	
	}
	

	public static void main(String[] args) {
		Nonststic3Methodand_access v1= new Nonststic3Methodand_access();//creating obeject 
				v1.person();//calling via variable 
				
	    Nonststic3Methodand_access v2= new Nonststic3Methodand_access();
		v2.yourage(1993);
		
		Nonststic3Methodand_access v3= new Nonststic3Methodand_access();
		v3.details("engnieer");
	}

}
