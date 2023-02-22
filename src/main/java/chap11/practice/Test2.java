package chap11.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
    	//삽입 정렬(Insert sort) 방법을 이용해서 배열에 있는 [1, 3, 8, 2, 9, 7, 6, 5, 4]를 정렬하세요.
    	//삽입 정렬은 아직 정렬되지 않은 임의의 데이터를 이미 정렬된 부분의 적절한 위치에 삽입해 가며 정렬하는 방식이다.
    	//왼쪽은 정렬이 완료된 데이터가 자리하고 오른쪽은 정렬되지 않은 데이터가 자리한다.
    	//왼쪽 첫 번째 비교 대상이 없으므로 정렬된 자리로 시작한다. [1], [3, 8, 2, 9, 7, 6, 5, 4]
    	//두 번째 데이터와 정렬 완료된 데이터와 비교를 합니다. [1, 3], [8, 2, 9, 7, 6, 5, 4]
    	//세 번째 데이터 8과 정렬이 완료된 1, 3을 비교하여 정렬합니다. [1, 3, 8], [2, 9, 7, 6, 5, 4]
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(3);
    	list.add(8);
    	list.add(2);
    	list.add(9);
    	list.add(7);
    	list.add(6);
    	list.add(5);
    	list.add(4);
    	
    	List<Integer> sortedList = new ArrayList<>();
    	sortedList.add(list.get(0));
    	list.remove(0);
    	System.out.println("원래 list ==> "+list);
    	
    	for(int i = 0; i < list.size(); i++) {
    		for(int j = 0; j < sortedList.size(); j++) {
    			if(list.get(i) > sortedList.get(j)) {
    				sortedList.add(list.get(i));
    				System.out.println(sortedList);
    			}else {
    				
    			}
    		}
    		list.remove(i);
    	}
    }
}
