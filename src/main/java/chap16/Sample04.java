package chap16;

import java.util.function.Function;

public class Sample04 {
	public static void main(String[] args) {
		Function<Integer, String> r = t -> {
			var result ="";
			for(int i = 0; i < t; i++) {
				result += "만세\n";
			}
			return result;	
		};
		System.out.println("==만세삼창==");
		System.out.print(r.apply(3));
	}
}

//interface Sample04Function{
//	public String apply(int t);
//}