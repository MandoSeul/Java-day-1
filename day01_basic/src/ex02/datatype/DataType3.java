/*
package ex02.datatype;

public class DataType3 {
	public static void main(String[] args) {
		short sh = 32767; // -32768~32767
		int num = 32769; // -21��~21��
		System.out.println(sh);
		num = sh; // int = short ���� 2byte�� 4byte�� �Ҵ��ϴ� ���̶� ����
		// �ڵ� ����ȯ�� �� 
		// ���� �ڷ����� ū �ڷ����� �ڵ�����ȯ(������ ����ȯ)
		System.out.println("sh= " + sh);
		System.out.println("num = " + num);
		
		num = 32769; // ������ �ʰ��ؼ� -�� ��µ� short�� ����ϸ�
		// �� ���� ������ rotation��
		sh = (short)num; // short= int �Ҷ��� ����� ����ȯ�� �ʿ�
		//ū �ڷ����� ���� �ڷ����� �������� ���������ȯ�� �ؾ���
		//������ �ս� �߻�
		System.out.println(sh + ", " +num);
	}
}
// end class
//*/

//*
package ex02.datatype;

public class DataType3 {
public static void main(String[] args) {
	short sh = 32767;
	int num = 50000;
	System.out.println(sh + " : " + num);
	num = -32769;
	sh = (short)num;
	System.out.println(sh + " : " + num);
	
}
}
//end class
//*/
