package thread.sync;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

/*
	//Example 1. 동기화 메서드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2초
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ " : "+ this.memory);
	}
*/	
	
	//Example 2.동기화 블록
	public void setMemory(int memory) {
		synchronized (this) { //this : 공유객체인 Calculator의 참조(잠금대상)
			this.memory = memory;
			try {
				Thread.sleep(2000); //2초
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+ " : "+ this.memory);
		}
	}
	

}
