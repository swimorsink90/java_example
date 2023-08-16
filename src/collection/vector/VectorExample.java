package collection.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String [] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����0","����0","�۾���0")); 
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2")); //���ŵ�
		list.add(new Board("����3","����3","�۾���3")); 
		list.add(new Board("����4","����4","�۾���4")); //���ŵ�
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject+" / "+board.content+" / "+board.writer);
		}
	}

}
