package ex04.print;

public class PrintTest {
	public static void main(String[] args) {
		double su = 123.4567;
		System.out.println(su);
		System.out.printf("%f\n",su);
		System.out.printf("%f\n",35.6);
		System.out.printf("%f \t %d \t %c \n",5.324,100,'A');
		System.out.printf("%f\n",12.3333337333333);// �Ҽ��� 6�ڸ���, 5�̻��̸� �� �ڿ��� 7�ڸ� ���� �ݿø� �ȴ�.
		System.out.printf("%10.4f\n",1234567890.3333337333333); // %��ü�ڸ� ��(�̰͵� �տ� 8�ڸ� ����ΰ� 2�ڸ� ������ ����) .�Ҽ��� �ڸ��� (�ö󰡴� �� �� ���ڸ��� �ݿø���) 
		//��ü�ڸ����� ���� ���ں��� ���� ��� ���õǾ �׳� �� ���� ���� - > ���� �κ��� ������ ���� .3f �̷��� �̿���
		// ������ ���� ���� �� 10.4f�ϸ� ���ʺ��� ���ĵǾ ��ĭ�� �Ȼ���
		System.out.printf("%-10.4f\n",12.3333337333333); 
		System.out.println("\n\n");
		
		int x = 10;
		double d = 3.4;
		float f = 12.56f;
		
		System.out.println(x + "," + d + "," + f);
		System.out.println(100 + " ," + 20l+"," + 7.7f + "," +7.5); // f�Ⱦ��� double type
		
		String str = "korea";
		System.out.printf("%s\n",str);
		System.out.printf("�Ǽ��� ������ %f \n", d);
		System.out.printf("�Ǽ��� ������ d = " + d + "�Դϴ�.");

	}
}
