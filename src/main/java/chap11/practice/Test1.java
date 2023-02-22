package chap11.practice;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
    	//버블 정렬(Bubble sort) 방법을 이용해서 배열에 있는 [1, 3, 8, 2, 9, 7, 6, 5, 4]를 정렬하세요.
    	//서로 이웃한 데이터들을 비교하여 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식이다.
    	//[1, 3, 8, 2, 9, 7, 6, 5, 4] 에서 제일 앞에 있는 1과 3을 비교하여 큰 수를 오른쪽으로 이동한다.
    	//3이 크기 때문에 변화가 없다. [1, 3, 8, 2, 9, 7, 6, 5, 4]
    	//다음 8과 2를 비교하고 8이 크기 때문에 둘은 서로 자리가 바뀐다. [1, 3, 2, 8, 9, 7, 6, 5, 4]
    	//다음 8과 9를 비교하고 역시 이동이 없다. [1, 3, 2, 8, 9, 7, 6, 5, 4]
    	//9과 7을 비교하고 9가 크기 때문에 둘은 서로 자리가 바뀐다. [1, 3, 2, 8, 7, 9, 6, 5, 4]
    	//이렇게 첫 번째 부터 아홉번째 까지 모두 비교한다.
    	//다 끝났다면 첫 번째부터 다섯 번째까지 모두 비교하며 더 이상 비교할 수 없을 때까지
    	//마지막 번째를 하나씩 감소하면 비교한다.
    	
    	List<Integer> list = Arrays.asList(3, 1, 8, 2, 9, 7, 6, 5, 4);
    	for(int i = 0; i < list.size()-1; i++){
    		for(int j = 0; j < list.size()-1; j++){
    			if(list.get(j) > list.get(j+1)) {
    				var temp = 0;
    				temp = list.get(j+1);
    				list.set(j+1, list.get(j));
    				list.set(j, temp);
    			}
    		}
    	}
    	System.out.println(list);
    }
}


