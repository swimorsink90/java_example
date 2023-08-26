package sort.bubble;

public class BubbleExample2 {
	
	public static void main(String [] args) {
		int [] item = new int[] {5,3,8,1,2,7};
		System.out.println("정렬 전 : ");
		
		BubbleSort bubble = new BubbleSort();
		bubble.printArray(item);
		
		bubble.bubbleSortByASC(item);		
		System.out.println("오름차순 정렬 후 : ");
		bubble.printArray(item);
		
		bubble.bubbleSortByDESC(item);		
		System.out.println("내림차순 정렬 후 : ");
		bubble.printArray(item);
	}

}
