package chap08;

public class Sample17 {

	public static void main(String[] args) {
		Student st = new Student("빵형",21,1);
		Student st2 = st;
		System.out.println(st.toString());
		System.out.println(st2);
		System.out.println(st.equals(st2));
		
	}

}

class Student{
	String name;
	int age;
	int grade;
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}
