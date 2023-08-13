package thread.sync;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

/*
	//Example 1. ����ȭ �޼���
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2��
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ " : "+ this.memory);
	}
*/	
	
	//Example 2.����ȭ ���
	public void setMemory(int memory) {
		synchronized (this) { //this : ������ü�� Calculator�� ����(��ݴ��)
			this.memory = memory;
			try {
				Thread.sleep(2000); //2��
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+ " : "+ this.memory);
		}
	}
	

}
