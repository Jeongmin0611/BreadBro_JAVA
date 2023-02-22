package chap12;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Sample05 {
	public static void main(String[] args) {
		Flower flower = Flower.ROSE;
		System.out.println("꽃 이름은 " + flower);
	}
}

@RequiredArgsConstructor
@Getter
enum Flower{
	SUNFLOWER("sunFlower"), ROSE("rose");//생성자를 호출한다고 생각하면 편함.
	
	private final String flowerName;

//	private Flower(String flowerName) {
//		this.flowerName = flowerName;
//	}

//	public String getFlowerName() {
//		return flowerName;
//	}
	
}