package ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
	네트워크 : java.net 패키지 기능제공
	InetAddress 클래스 : IP주소를 관리하는 기능담당 클라스 


*/
public class InetAddressExample {

	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost();
//			192.168.0.50
			System.out.println("내 컴퓨터의 IP주소 : " + local.getHostAddress());
			
//			www.naver.com을 자신의 컴퓨터에 설정된 DNS서버,IP로 부터 응답받음.
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소" + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
