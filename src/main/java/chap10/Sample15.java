package chap10;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Sample15 {
	public static void main(String[] args) {
		Group<Pet> petList = new Group<>();
		petList.add(new Pet("앵무새"));
		petList.add(new Pet("십자매"));
		
		Group<Wild> wildList = new Group<>();
		wildList.add(new Wild("비둘기"));
		wildList.add(new Wild("까치"));
		
		System.out.println("애완조--");
		getAnimalList(petList);
		System.out.println("--------");
		getPetList(petList);
		
		System.out.println("\n야생조--");
		getAnimalList(wildList);
		System.out.println("--------");
		//getPetList(wildList); <? super Pet> 로 제한해놨기 때문에 에러
	}
	
	public static void getAnimalList(Group <? extends Animal> group) {
		//Animal[] g = group.getGroup(); -> 와일드카드가 Animal로 extends를 받았기 때문에 이것도 가능
		Object[] g = group.getGroup();
		for(int i = 0; i < g.length; i++) {
			Animal animal = (Animal)g[i];
			System.out.println(animal.getName());
		}
	}
	
	public static void getPetList(Group <? super Pet> group) {
		Object[] g = group.getGroup();
		for(int i = 0; i < g.length; i++) {
			Pet pet = (Pet)g[i];
			System.out.println(pet.getName());
		}
	}
}

class Group<G> {
	private int listCount = 0;
	
	@Getter
	private G[] group = (G[])new Object[listCount];
	
	public void add (G element) {
		group = Arrays.copyOf(group, ++listCount);
		group[listCount-1] = element;
	}
	
}

@AllArgsConstructor
@Getter
class Animal{
	private String name;
}

class Pet extends Animal{
	public Pet(String name) {
		super(name);
	}
}

class Wild extends Animal{
	public Wild(String name) {
		super(name);
	}
}