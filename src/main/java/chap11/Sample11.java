package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample11 {
	public static void main(String[] args) {
		 var map = new HashMap<String, Integer>();
		 int idx = 0;
		 map.put("Java",++idx);
		 map.put("C",++idx);
		 map.put("C++",++idx);
		 map.put("C#",++idx);
		 map.put("Python",++idx);
		 map.put("Javascript",++idx);
		 map.put("PHP",++idx);
		 map.put("Visual Basic .NET",++idx);
		 map.put("Perl",++idx);
		 map.put("Delphi",++idx);
		 
		 Map beforeMap = (Map)map.clone();
		 Set<String> keys = map.keySet();
		 
		 System.out.printf("총 %d개의 entiry가 있습니다. \n",keys.size());
		 
		 if(keys.contains("Delphi")) keys.remove("Delphi");
		 map.put("Ruby",idx);
		 
		 for(String key : keys) {
			 System.out.println(key + " " + map.get(key));
		 }
//		 System.out.println("--------------------------------------------");
//		 keys.forEach(key -> System.out.println(key));
//		 System.out.println("--------------------------------------------");
//		 keys.forEach(System.out::println);
		 
		 System.out.println(map.containsKey("Delphy"));
	}
}
