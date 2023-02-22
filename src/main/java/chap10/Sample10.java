package chap10;

class Student<G, C>{
	private G t;
	private C c;
	
	public void printInfo(String name) {
		System.out.printf("%s은(는) %d학년 %d반\n",name,t,c);
	}

	public Student(G t, C c) {
		this.t = t;
		this.c = c;
	}
	
}

public class Sample10 {
	public static void main(String[] args) {
		Student<String,Integer> younghee = new Student<>("1",4);
		younghee.printInfo("영희");
	}
}
