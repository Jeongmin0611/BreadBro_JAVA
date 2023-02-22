package chap05;

import java.util.Arrays;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 구입할 물건의 목록과 구입한 물건의 목록이 보기와 같이 있을 떄 
		 * 구입하지 않을 물건을 출력하세요
		 * 구입할 물건 ["냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"]
		 * 구입한 물건 ["노트북", "TV", "에어컨"]
		 * == 구입하지 못한 물건==
		 * 냉장고
		 * 선풍기 
		 * 세탁기
		 * */
		String[] wishArr = new String[]{"냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"};
		String[] buyArr = new String[]{"노트북", "TV", "에어컨"};
		Arrays.sort(wishArr);
		Arrays.sort(buyArr);
		
		System.out.println("== 구입하지 못한 물건==");

		System.out.printf("%s",(Arrays.binarySearch(buyArr, wishArr[0]) < 0) ? wishArr[0] + "\n" : "");
		System.out.printf("%s",(Arrays.binarySearch(buyArr, wishArr[1]) < 0) ? wishArr[1] + "\n" : "");
		System.out.printf("%s",(Arrays.binarySearch(buyArr, wishArr[2]) < 0) ? wishArr[2] + "\n" : "");
		System.out.printf("%s",(Arrays.binarySearch(buyArr, wishArr[3]) < 0) ? wishArr[3] + "\n" : "");
		System.out.printf("%s",(Arrays.binarySearch(buyArr, wishArr[4]) < 0) ? wishArr[4] + "\n" : "");
		System.out.printf("%s",(Arrays.binarySearch(buyArr, wishArr[5]) < 0) ? wishArr[5] + "\n" : "");
	}
}
