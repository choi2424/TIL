package sec08.exam03;

// return Ű���� ��뿹��
// return [��ȯ��]; �޼����� ������ ����. ��� ȣ���� ������ �����ش�.
// �ݰ����� �����ϸ�, �Բ� �����ش�.

public class Car {
//	�ʵ� ����
	int gas;
	
//	���ϰ��� ���� �޼ҵ� . gas���� �Ű������� ���� �޾Ƽ�, gas�ʵ尪�� ����
	void setGas(int gas) {
		this.gas = gas;
		
	}
	
//	���� ��������üũ
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}
	
//	�����ϴ� ��� .
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.printf("�޸��ϴ�.(gas �ܷ� : %d)\n",gas);
				gas -= 1;
			}else {
				System.out.printf("����ϴ�.(gas �ܷ� : %d)\n",gas);
				return;
			}
		} 
			
		
		
	}
	
}
