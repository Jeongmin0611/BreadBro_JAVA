package chap16;

import java.util.function.Supplier;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

public class Sample06 {
	public static void main(String[] args) {
		MessageCenter mc = new MessageCenter("Hello~ Lambda!");
//		Supplier<MessageCenter> param = ()-> mc;
//		MessageCenter main = getMsg(param);
//		위와 같은 거임. 변수명으로 넘기지 않아도 함수의 형태를 보고 Supplier라고 인식하는거임.
//						매개변수는 없고, 반환형이 있는 인터페이스
		MessageCenter main = getMsg(()-> mc);
		System.out.println(main);
	}
	
	public static MessageCenter getMsg(Supplier<MessageCenter> mc) {
		return mc.get();
	}
}

@RequiredArgsConstructor
@ToString
class MessageCenter{
	private final String msg;
}
