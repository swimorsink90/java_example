package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String [] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaoTalk","홍두깨"));
		
		while(!messageQueue.isEmpty()) { //메세지큐가 비었는지 확인
			Message message = messageQueue.poll(); //메세지큐에서 한개의 메시지 꺼냄
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다");
					break;
				case "sendKakaoTalk":
					System.out.println(message.to + "님에게 KakaoTalk 보냅니다");
					break;
			}
		}
		
	}

}
