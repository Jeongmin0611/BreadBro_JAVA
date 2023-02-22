package chap12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Sample06 {
	public static void main(String[] args) {
		Bird bird = Bird.SPARROW;
		System.out.println("새 이름은 "+ bird.getBirdName());
		
		BIRD2 BIRD2 = new BIRD2("앵무새",29);
		System.out.println("새 이름은 "+ BIRD2.getBirdName());
		
		System.out.println("새 이름은 "+ BIRD3.SPARROW.getBirdname());
		
	}
}


@RequiredArgsConstructor
@Getter
enum Bird{
	SPARROW("참새",33), PARROT("앵무새",27);
	
	private final String birdName;
	private final int count;
}

@AllArgsConstructor
@Getter
class BIRD2 {
	private String birdName;
	private int count;
	
}

class BIRD3{
	static class SPARROW{//static 클래스라 생성자 필요 x
		private static final String birdName = "참새";
		private static final int count = 33;
		public static String getBirdname() {
			return birdName;
		}
		public static int getCount() {
			return count;
		}
	}
}