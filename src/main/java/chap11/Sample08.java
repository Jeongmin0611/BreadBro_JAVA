package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class Sample08 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"김형"));
		list.add(new Employee(3,"손형"));
		list.add(new Employee(2,"박형"));
		list.add(new Employee(4,"빵형"));
		
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		
	}
}

@Data
@AllArgsConstructor
@ToString
class Employee implements Comparable<Employee>{
	private int sabun;
	private String name;
	@Override
	public int compareTo(Employee o) {
		//return this.sabun - o.sabun; 오름차순
		//return  o.sabun - this.sabun; 내림차순
		//return this.name.compareTo(o.name); 문자일 때 오름차순
		return o.name.compareTo(this.name);//문자일 떄 내림차순
	}
}