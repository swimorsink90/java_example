package array.copy;

public class ArrayCopyExample {
	public static void main(String [] args) {
		
		String [] oldIntArray = {"java","array","copy"};
		String [] newIntArray = new String[5];
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		//참조타입 배열의 경우, 배열 복사가 되면 복사되는 값이 객체의 번지이므로, 새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println("newIntArray["+i+"] : "+newIntArray[i]);
		}		
		
		System.out.println();
		for(int i=0; i<oldIntArray.length; i++) {
			System.out.println("oldIntArray["+i+"] : "+oldIntArray[i]);
		}
	}

}
