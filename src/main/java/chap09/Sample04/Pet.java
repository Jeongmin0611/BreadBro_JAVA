package chap09.Sample04;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Pet {
	private boolean wing;
	@Getter
	private int legCount;
	
	public String isWing() {
		String str;
		if(this.wing) {
			str = "날수있다.";
		}else {
			str = "날수없다.";
		}
		return str;
	}
	
	public abstract void run(String name);
}
