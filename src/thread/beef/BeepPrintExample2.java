package thread.beef;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	
	public static void main(String [] args) {

/*
 		//Example 1.
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
*/

/*
		//Example 2.
		Thread thread = new Thread(new Runnable() {	
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		});
		thread.start();
*/
		//Example 3.
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("######### ding dong");
			try {Thread.sleep(500);}catch(Exception e) {} //0.5초간 정지
		}
	}

}
