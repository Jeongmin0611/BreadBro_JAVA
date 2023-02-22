package chap12;

public class Sample04 {
	public static void main(String[] args) {
		System.out.println("허수아비가 LARGE인 RED 옷을 입었습니다.");
		System.out.printf("허수아비가 %s 인 %s 옷을 입었습니다. \n",Size2.LARGE, Color2.RED);
	}
}

enum Color2{
	RED{
		@Override
		public String toString() {
			return "빨간색";
		}
	}, BLUE{
		@Override
		public String toString() {
			return "파란색";
		}
	}, ORANGE{
		@Override
		public String toString() {
			return "귤색";
		}
	};
}

enum Size2{
	SMALL{
		@Override
		public String toString() {
			return "작은 사이즈";
		}
	}, MIDIUM{
		@Override
		public String toString() {
			return "중간 사이즈";
		}
	}, LARGE{
		@Override
		public String toString() {
			return "가장 큰 사이즈";
		}
	};
}