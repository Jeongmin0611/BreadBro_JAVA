package chap12;

import lombok.Getter;

public class Sample07 {
	public static void main(String[] args) {
		CITY city = CITY.valueOf(1);
		System.out.println(city.getDastination());
	}
}

@Getter
enum CITY{
	//순번 안매기고 시퀀스용 변수를 따로 만들어서 생성해주면 그 변수 기준으로도 enum을 가져오는 것도 가능.
	SEOUL("서울",0), DAEJEON("대전",1), DAEGU("대구",2), BUSAN("부산",3), JEJU("제주",4), GWANGJU("광주",5);
	
	private final String dastination;
	private final int req;

	private CITY(String cityName, int req) {
		this.dastination = cityName;
		this.req = req;
	}
	
	public static CITY valueOf(int req) {
		CITY cityName = null;
		for(CITY city : CITY.values()) {
			if(city.ordinal() == req) {//ordinal() enum들의 임의로 매긴 순번을 구해줌.(0부터 시작)
				cityName = city; 
				break;
			}
		}
		return cityName;
	}
	
}