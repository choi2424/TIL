package ch06.sec11.exam02;

// ���������
public class Earth {

//	 	Ư���� �Һ����� �̸����� ����. �� ���� ���ΰ�. ���� ���� �� �� ����.
	//  1)��� ���� �� �ʱ�ȭ
	static final double EARTH_RADIUS = 6400;
	
	// 2)��� ����
	static final double EARTH_SURFACE_AREA;
	
	// static �ɹ��ʵ尡 �޸� ���� ��, �Ʒ� static���� �ڵ����� ȣ�� ��.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
		
	}
}
