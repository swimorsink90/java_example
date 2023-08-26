package wrapper;

public class Example1 {
	
	public static void main(String [] args) {
		
		Object [] theArray = new Object[100];
		
		//theArray[0] = new Integer(10); //java9 버전 이상에서 Integer 생성자는 deprecated됨
		theArray[0] = Integer.valueOf(10);

		Integer value = (Integer) theArray[0]; 
		//비록 실제로 theArray[0]에 Integer 타입이 저장되어있어도 이렇게 타입변환을 해주지 않으면, 컴파일 오류로 판정
		
		int a = value.intValue();
	}

}
