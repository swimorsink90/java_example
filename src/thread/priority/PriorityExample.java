package thread.priority;

public class PriorityExample {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			Thread thread = new CalcThread("thread_"+i);
			if(i != 5){
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}

	}

}
