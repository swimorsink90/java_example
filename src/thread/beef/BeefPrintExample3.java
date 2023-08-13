package thread.beef;

import java.awt.Toolkit;

public class BeefPrintExample3 {
	
	public static void main(String [] args) {

/*
		//Example 1.
		Thread thread = new BeepThread();
		thread.start();
*/
		
/*		
		//Example 2.
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		};
		thread.start();
*/
		
		for(int i=0; i<5; i++) {
			System.out.println("######### ding dong");
			try {Thread.sleep(500);}catch(Exception e) {} //0.5초간 정지
		}
	}

}
