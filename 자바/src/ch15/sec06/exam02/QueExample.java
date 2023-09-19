package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueExample {

	public static void main(String[] args) {

		// 큐 : FIFO(선입선출)
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메세지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "손흥민"));
		messageQueue.offer(new Message("sendKakaotalk", "이강인"));
		messageQueue.offer(new Message("sendNaver", "이강인"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			

			default:
				System.out.println("메신저를 정확히 입력해 주세요.");
				break;
			}
			
		}

	}

}
