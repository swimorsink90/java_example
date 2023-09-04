package lambda;

public class UsingThis {
	
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			//람다식
			//람다 실행블록에서 클래스 멤버인 필드와 메소드 사용가능
			//람다식에서 this는 내부적으로 생성되는 익명객체가 아니라 람다식을 실행한 객체의 참조 
			MyFunctionalInterface fi = () -> {
				//중첩객체 Inner에서 람다식을 실행했기 때문에 람다식 내부에서의 this는 중첩객체 Inner
				System.out.println("outterField : "+outterField);
				System.out.println("outterField : "+UsingThis.this.outterField + "\n");
				
				System.out.println("innerField : "+innerField);
				System.out.println("innerField : "+this.innerField + "\n");
			};
			
			fi.method();
		}
	}

}
