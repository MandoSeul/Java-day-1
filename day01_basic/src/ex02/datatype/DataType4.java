package ex02.datatype;

public class DataType4 {
public static void main(String[] args) {
	int su = 10;
	System.out.println("10���� : " +su); // %d, %o, %x, %X);
	System.out.printf("10���� %d\n",su);
	System.out.printf("8���� %o\n",su);
	System.out.printf("16���� %x %X \n",su,su);
	System.out.println("====================");
	System.out.printf("10���� �� : %d \n",012); // 0���� <----8����
	System.out.printf("10���� �� : %d \n",0xA); // 0x���� <----16����

	//���� (+, -, *, /, % ,,,,,,,) ���� = ����
	
	System.out.println("7/3 = " + 7/3);
	System.out.println("7/3.0 = " + 7/3.0); // �Ǽ� ������ ��
	System.out.println("7./3. = " + 7./3.); 
	
}
}
