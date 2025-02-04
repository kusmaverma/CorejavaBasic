package map;

import java.util.HashMap;
import java.util.Map;

public class Map_Programm {
public static void main(String[] args) {
	Map mp= new HashMap();
	mp.put("Name", "Namya");
	mp.put("Age", 7);
	mp.put(102, "Roll No");
	mp.put(103, "new");
	mp.put(103, "new value ");
	mp.put(null ,null);
	mp.put(1 ,null);
	mp.put(11 ,null);
	System.out.println(mp);
	//mp.clear();//delete inside the values methods and leave the map empty 
	System.out.println(mp);
boolean ans=mp.containsValue("Namya");
System.out.println(ans);
System.out.println( mp.containsKey(102));
mp.entrySet();
System.out.println(mp.get(102));
Map mp1= new HashMap();
mp1.put("Name", "rtttfg");
mp1.put("Ageaaaa", 17);
mp1.put("Name", "new value ");

//System.out.println(mp1);
mp1.putAll(mp);
System.out.println(mp1);
System.out.println(mp1.size());//will display the size of the map/how many values we have 

}

}
