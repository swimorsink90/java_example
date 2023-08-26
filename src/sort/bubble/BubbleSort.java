package sort.bubble;

public class BubbleSort {
	
	public void printArray(int [] array) {
		for(int data : array) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public void bubbleSortByASC(int [] array) {
		System.out.println("##### array.length : "+ array.length);
		for(int i=0; i< array.length; i++) {
			System.out.println("##### i : "+i);
			System.out.println("##### 비교 수 : "+ (array.length-i-1));
			for(int j=0; j<array.length-i-1; j++) { 
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println();
		}
	}
	
	public void bubbleSortByDESC(int [] array) {
		System.out.println("##### array.length : "+ array.length);
		for(int i=0; i< array.length; i++) {
			System.out.println("##### i : "+i);
			System.out.println("##### 비교 수 : "+ (array.length-i-1));
			for(int j=0; j<array.length-i-1; j++) { 
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println();
		}
	}
	

}
