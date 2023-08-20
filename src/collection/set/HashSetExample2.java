package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String [] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("테스트1", 30));
		set.add(new Member("테스트1", 30));
		
		System.out.println("총 객체 수 : "+set.size());
		
		
	}

}
