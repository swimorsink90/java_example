package collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	
	//Arrays.asList(...) : 고정된 객체들로 구성된 리스트 생성
	public static void main(String [] args) {
		
		List<String> list1 = Arrays.asList("테스트1","테스트2","테스트3");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
