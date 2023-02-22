package chap09;

import java.util.UUID;
import java.util.stream.Stream;

public class Sample10 {
	public static void main(String[] args) {
		String legacyKey = LegacyUtil.getRandom();
		System.out.printf("레거시 시스템에서 처리될 키값은 %s입니다.\n\n",legacyKey);
		
		//5개의 키값(중복이 되면 안됨.)
		for(int i = 0; i < 5; i++) {
			String key = NewUtil.getRandom();
			System.out.printf("새로운 시스템에서 처리될 키값은 %s입니다.\n\n",key);
		}
		
		NewUtil.test();
		
		System.out.println("====================================================");
		Stream.generate(UUID::randomUUID)
		      .limit(5)
		      .forEach(System.out::println);
		System.out.println("====================================================");
		Stream.generate(UUID::randomUUID)
	      .limit(5)
	      .forEach(x -> System.out.printf("더 새로운 시스템에서 처리될 키값은 %s입니다.\n\n",x));
	}
}

class LegacyUtil {
	public static String getRandom() {
		return ""+(int)(Math.random()*10+1);
	}
	
	public static void test() {
		System.out.println("test");
	}
}

class NewUtil extends LegacyUtil{
	/* 기존 시스템(LegacyUtil 클래스)에 기능을 건들이지 않고 확장할 떄 extends를 사용하면 좋음. */
	public static String getRandom() {
		return ""+UUID.randomUUID();
	}
}