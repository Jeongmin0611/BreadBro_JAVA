package chap02;

public class Sample03 {
	public static void main(String[] args) {
		//-1부터 -128 128개, 0부터 127 128개
		byte 	a1 = -128; //byte 최소값
		byte 	a2 = 127;//byte 최대값
		short 	b1 = -32768;//short 최소값
		short 	b2 = 32767;//short 최대값
		int 	c  = 10000;
		long 	d  = 10000l;//long형은 끝에 l자가 붙음.
		float 	e  = 10.1f;//f를 붙이지 않으면 double형으로 인식됨.
		double 	f  = 10.1;
		
		System.out.printf("byte : %d, \t\t short : %d%n",a1,b2);
		System.out.printf("int : %d, \t\t long : %d%n",c,d);
		System.out.printf("float : %f, \t double : %f%n",e,f);
	}
}
