package chap08.Sample22;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor// NoArgsConstructor 랑 RequiredArgsConstructor를 같이 쓰고 싶으면 Required 변수를 다 @NonNull로 만든다.
@AllArgsConstructor
@RequiredArgsConstructor//final변수나 @nonnull 변수만 인자로 생성자를 만듬.
public class Car {
	@NonNull private String	color;			//차량색상
	
	@NonNull private int door;			//문 수
	
	private String	manufacturer;	//제조사	
	
	
}
