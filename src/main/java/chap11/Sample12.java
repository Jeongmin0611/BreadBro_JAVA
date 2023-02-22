package chap11;

import java.util.HashMap;
import java.util.TreeMap;

public class Sample12 {
	public static void main(String[] args) {
		//학번 정보
		var hashMap = new HashMap<String, String>();
		hashMap.put("1902893", "선풍기");
		hashMap.put("1801438", "신문지");
		hashMap.put("1803962", "고무신");
		hashMap.put("1722761", "강속구");
		hashMap.put("1913449", "동백꽃");
		hashMap.put("1804367", "솔까말");
		System.out.println(hashMap);		
		
		System.out.println("\n");
		System.out.println("TreeMap은 정렬하며 key, value 형태로 저장됩니다.");
		
		var tm = new TreeMap<String,String>();
		tm.putAll(hashMap);
		System.out.println(tm);
		
		System.out.println("\n");
		System.out.println("학번이 1803959이거나 더 큰 값을 갖는 가장 가까운 학번 정보");
		System.out.println(tm.ceilingEntry("1803959"));
		System.out.println(tm.ceilingKey("1803959"));
		System.out.println(tm.get(tm.ceilingKey("1803959")));
	}
}
