package ex02.datatype;

public class DataType {
	static int Num; // ������ : 0���� �ʱ�ȭ ��, �Ǽ�ȭ�� 0.0 ���ڿ��� :NULL�� �ʱ�ȭ�� �ڵ�����
public static void main(String[] args) {
	int i =0;//* ���������� �ݵ�� �ʱ�ȭ�ϰ� ����Ѵ�. �� 0�� �ƴϴ���
	short x =90; //��ó�� ��������� �ڷ����� ������ �ʴ� �̻� ������ int�� �νĵ�
	float f = 33.4567F; // �������� �������� ������ �Ǳ� ������ double���� ���� �׷��� �ʱ� ���ؼ�
	// ������ F��, f������
	System.out.println(x);
	System.out.println(f);
	System.out.println(100); // int ������ ��µ� 
	System.out.println(200l); // long���� ����ϰ� ������ �ڿ��ٰ� �ҹ��� l�̳� ������ L�̿�
	System.out.println(12.34);//double�� �νĵ� (system�� ���ݴ� ���� �� �ڷ����� defalut�� ��ƹ���)
	System.out.println(Num);
}
}
