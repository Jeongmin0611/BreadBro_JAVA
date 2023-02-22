package chap07;

public class Sample05 {
	public static void main(String[] args) {
		//switch(변수 or 연산식 or enum)
//		case 1 : asdfdsafdsaf
//				 break;
//	    case 2 : asdfdsafdsaf
//		default :dafsdfdas fsdaf
		
		int in = 5;
		switch(in) {
			case 10 : System.out.println(10);
					 break;
			case 9 : System.out.println(9);
						break;
			case 8 : System.out.println(8);
			break;
			case 7 : System.out.println(7);
			break;
			case 6 : System.out.println(6);
			break;
			case 5 : System.out.println(5);
			break;
			case 4 : System.out.println(4);
			break;
			case 3 : System.out.println(3);
			break;
			case 2 : System.out.println(2);
			break;
			case 1 : System.out.println(1);
			break;
			default :System.out.println("1부터 10까지의 숫자가 아닙니다.");
		}
	}
}
