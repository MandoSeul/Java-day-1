package ex02.datatype;

public class DataType2 {
	public static void main(String[] args) {
		String str = "A"; // ���ڿ� , " ", 2byte , ���ڿ��� ������ null�� �� \0 ( �ڵ������� )
		char ch = 'A'; // ���� , ' ' , 1byte
		char ch2 = 67 ;// �ƽ�Ű �ڵ� ���� ���Ե� ASCII
		char ch3 = 'b'; // ASCII : 98
		int su =20;
		String aa = "happy";
		double d = 12.345;
		System.out.println(ch);
		System.out.println(ch2);
		//ASCII�� ����ϰ� �������� (int)�ٿ��� �� ��ȯ�� ���ָ��.
		System.out.println((int)ch);
		System.out.println(ch2+ch3); // ASCII���� �������� ��µ�
		System.out.println(ch2+","+ch3);//�̷��� ������ �Ǵ°� �ƴ϶� ������ ��
		System.out.println("aa="+aa);
		System.out.println("�Ǽ��� ������ : "+d);
		System.out.println("==================");
		
		for(int i = 65; i<=90; i++){
			System.out.print((char)i+"\t"); // \t = tab key
		}// for end
		System.out.println("-------------------");

		for(int i = 'a'; i<='z'; i++){ // ���ڰ��� ���ڰ� �� �� ����
			System.out.print((char)i+"\t"); // \t = tab key
		}// for end
		
		System.out.println("\n\n boolean type");
		boolean flag = true; // c�� �ٸ��� java������ bool�� int�� ��ȯ�� �ȵ�
		System.out.println(flag);
	}
}
