package thread.beef;

import java.awt.Toolkit;

//0.5초 주기로 beep음을 발생시키면서 동시에 프린팅하는 작업
//비프음 발생과 프린팅은 서로 다른 작업이므로 메인스레드가 동시에 두가지 작업을 처리할 수 없음
//이 코드의 메인스레드는 비프음을 모두 발생시킨 다음, 프린팅 시작
public class BeefPrintExample1 {
	
	public static void main(String [] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {} //0.5초간 정지
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("######### ding dong");
			try {Thread.sleep(500);}catch(Exception e) {} //0.5초간 정지
		}
		
	}

}
