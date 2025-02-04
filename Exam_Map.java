package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam_Map {
	//Write a program on Iteration methods in the Map Interface using For Each Loop Concept.
	//keySet().
	//2.values().
//	3.entrySet().
public static void main(String[] args) {
	java.util.Map mp= new HashMap();
	mp.put("Name", "Namya");
	mp.put("Age", 7);
	mp.put(102, "Roll No");
	   

	System.out.println(mp);
	System.out.println(mp.get(102));
	mp.clear();
	System.out.println(mp);
	mp.put("Name", "Namya");
	mp.put("Age", 7);
	mp.put(102, "Roll No");
	   
System.out.println(mp.containsValue("test"));
System.out.println(mp.entrySet());
System.out.println(mp.size());
//System.out.println(mp);
   Set set= mp.entrySet();
  Iterator itr=  set.iterator();
  while (itr.hasNext())
  {
	  Map.Entry entry= (Map.Entry)itr.next();
	 System.out.println(entry.getKey() +"->"+ entry.getValue());
	 Set sett= mp.entrySet();
	 Iterator it= sett.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(entry.getKey()+ entry.getValue())
	 }
	 
	 System.out.println();
  }
   
   
   
}
}
