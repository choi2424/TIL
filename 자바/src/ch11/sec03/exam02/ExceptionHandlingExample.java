package ch11.sec03.exam02;

//	다중예외처리 예제 = 실행시 오류가 2개 이상 존재 했을 때 예외처리 하는 문법.
//	배열의 array[1] 값이 숫자 형태의 문자열이 아니므로 정수 변환시 예외 발생 NumberFormatException
//	배열의 array[2] 인덱스가 존재하지 않아 예외 발생 ArrayIndexOutOfBoundsException
//	다중예외처리시 catch(	)구문에서 상위예외클래스가 뒤에 작업이 되어야 한다.
public class ExceptionHandlingExample {

   public static void main(String[] args) {
      
      String[] array = {"100", "1OO"}; // 알파엣 o를 입력
      
      for(int i=0; i<=array.length; i++) {
         
         try {
            int value = Integer.parseInt(array[i]);
            System.out.println("array[" + i + "] : " + value);            
         }catch (NumberFormatException e) {
            System.out.println("숫자로 변환 할 수 없음 : " + e.getMessage());
         }catch (Exception e) { // ArrayIndexOutOfBoundsException 클래스를 사용해야 하지만 , 상위클래스로 대신작업도 가능
            System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
         }
      }
   }
}
			
	
