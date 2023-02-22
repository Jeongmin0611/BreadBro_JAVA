package chap09.Sample04;

public class Sample04 {
	public static void main(String[] args) {
		Pet cat = new Cat(false,4);
		cat.run(getPetName(cat));
		Pet parrot = new Parrot(true, 2);
		parrot.run(getPetName(parrot));
		
		Parrot pr = (Parrot)parrot;//상위 클래스를 하위클래스로 변환 할 때는 형변환 해줘야 함.
		pr.fly(getPetName(parrot));
		
		Pet pet = pr;//하위 클래스를 상위클래스로 변환 할 때는 형변환 필요없음.
		//pet.fly(getPetName(pet)); Pet에는 fly() 없음. 에러
		
	}
	
	public static String getPetName(Pet pet) {
		String str = "";
		if(pet instanceof Cat) { //자료형이 아닌 객체 자체를 가지고 비교
			str = "고양이";
		}else if(pet instanceof Parrot) {
			str = "앵무새";
		}
		return str;
	}
}
