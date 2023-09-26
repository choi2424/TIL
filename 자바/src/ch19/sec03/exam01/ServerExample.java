package ch19.sec03.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//	서버용 통신프로그램.
//	서버용 : ServerSocket 클래스
//	연결 : Socket 클래스
public class ServerExample {

	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		System.out.println("서버 종료 : q,Q 입력하고 , Enter키를 입력하세요.");
		System.out.println("-------------------------------------------");
		
//		TCP 서버시작.
		startServer();
		
//		키보드 입력 . Scanner클래스 : 콘솔에서 키보드 입력받는 기능을 제공.
//		System.in : 표준 입력스트림
		Scanner scanner = new Scanner(System.in);
		while(true) {
//			콘솔환경에서 키보드로 데이터 입력후 Enter을 치면 , 버퍼에 데이터가 저장된다
//			버퍼에 저장되어 있는 내용을 읽고 변수에 저장
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		
		scanner.close();
		
//		TCP 서버 종료
		stopServer();
	}

	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {}
		
	}

	private static void startServer() {
//		작업 스레드 정의
		
//		익명구현객체
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
//					port는 충돌되지 않아야 한다. 즉 port가 미사영된 것 . Dynamic port에서  선택
					serverSocket = new ServerSocket(50001); // localhost:50001
					System.out.println("[서버] 시작됨");
					
//					실행중인 상태유지
					while(true) {
						System.out.println("\n[서버] 연결요청을 기다림\n");
//						연결수락(클라이언트 요청이 오면, 수락)
						Socket socket = serverSocket.accept(); // Block상태(대기중) . 클라이언트 요청발생
//						socket객체 : 1)연결된 클라이언트 정보 2)입출력스트림정보 참조.
						
//						1)연결된 클라이언트 정보참조
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버]" + isa.getHostName() + "의 연결 요청을 수락함.");
						
//						2)입출력스트림 작업 : 채팅
						
//						연결 끊기.
						socket.close();
						System.out.println("[서버]" + isa.getHostName() + "의 연결을 끊음.");
					}
				} catch (IOException e) {
					System.out.println("[서버]" + e.getMessage() + "의 연결을 끊음");
				} // port는 충돌되지 않아야 한다 . 다른 프로그램에서 사용이 안된것.
				
			}
		};
		
//		스레드 시작
		thread.start(); // run()메소드를 호출하는 작업. CPU점유가 되었을 때(실행스레드)
	}

}
