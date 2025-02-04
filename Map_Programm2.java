package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Programm2 {
public static void main(String[] args) {
	   Map map=new HashMap();
	   map.put(1,"Test1" );
	   map.put(11,"Rest" );
	   map.put(12,"mest" );
	   map.put(13,"Crest" );
	   System.out.println(map);//giving the output in map /Curly braces
	   Set set=map.entrySet();
	   System.out.println(set);//giving the output in Set /square braces
	   
	   System.out.println(map);//giving the output in map /Curly braces
	   Set set=map.keySet();
}
}
