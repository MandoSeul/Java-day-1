/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	System.out.println(3+4*5);
	System.out.println((3+4)*5);
	// ���� ������ : ���� ==> ++, --, ~
	int x = 10, y;
	y=x++;
	System.out.println("x = " + x +"\ny = " + y);
//�� �׻� �̰� �򰥸����� ++�� �ڿ� �پ� ������ ���� ������ �̹Ƿ� �̸� x�� ���� ���� y���� �Ѱ��ְ� ��
// ������ x�� ���� �ϳ� �÷��ִ� �� -> ���������� �� ���� ������

	// �ݴ�� ���� �����ڵ� ���� �̸� x�� ���� �÷��ְ� y�� �־���
	y = ++x;
	System.out.println("x = " + x +"\ny = " + y);
++x; //x++;// �� �� �ǹ̰� ������ 
//�̷��� �ܵ����� ���̸� ��������� ���� �Ȱ���
}
}
/*/
/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	int x = 10, y;
	y=~x; // ��Ʈ ���� : -(������+1) ==> ��� �����
	System.out.println("x = " + x +"\ny = " + y);
}
}
//*/

/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
// ��������� : +, -, * , /, % , ^ .....
	int x = 10, y = 20;
	int god = x*y;
	System.out.println("x *y = " + god);
	System.out.println("x *y =  " + x+y);
	
	System.out.println("7 /3 =  " + 7/3); // ��
	System.out.println("7 %3 =  " + 7%3); // ������


}
}
//*/

/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	// 1. ��������
	// ������� m_na, ch_na, b_na �� ������ ���� ���� ����� ��
	int pay = 567890;
	int ���� , õ��, ���, �ʿ�, tmp;
	// 2. �޼��� ��� �� �Է¹ޱ�
	// 3. ó��(���)
	// 4. ��� ���(ȭ��)
	���� = pay/10000;
	tmp= pay%10000;
	õ�� = tmp/1000;
	tmp = tmp %1000;
	��� = tmp/100;
	tmp = tmp%100;
	�ʿ� = tmp/10;
	System.out.println("���� : " + ���� + "��");
	System.out.println("õ�� : " + õ��+ "��");
	System.out.println("��� : " + ���+ "��");
	System.out.println("�ʿ� : " + �ʿ�+ "��");
	System.out.println();
// �ѹ��� �� �� �� ���� ex 	System.out.println("���� : " + pay/10000 + "��");
	// System.out.println("õ�� : " + (pay%10000)/1000 + "��");
	System.out.println("���� : " + pay/10000 + "��");
	System.out.println("õ�� : " + (pay%10000)/1000 + "��");
 
}
}
//*/

/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	 int su = 12345; 
	 int hour, min, sec, tmp;
	 hour= su/3600;
	 tmp = su%3600;
	 min = tmp/60;
	 sec = min%60;
	 System.out.println(hour + " �� " + min + " �� " + sec + " ��  �Դϴ�");
	 
}
}
//*/

/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	//shift ������ : <<, >>, <<<
	
	int x=8, result;
	result = x<<2;
	System.out.println("left shift result : " + result);
	 
}
}
//*/

//*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
// �� ������ : &, |, ^ ( 2�� �������� ����� -> ������ �˷���)
	// 10�� �������� ��� �� - > ��, ���� ���� ����� && || !
	System.out.println(4&7);
	System.out.println(4|7);
	System.out.println(4^7);
	System.out.println("==================");
	boolean flag;
	int x= 10, y=20, z= 30;
	flag =  ( x > y) && (y>z);
	System.out.println("( x > y) && (y>z) = " + flag);
	flag =  ( x < y) || (y>z);
	System.out.println("( x < y) || (y>z) = " + flag);
// ���� ���� �̹� ����� �� �� �����ڴ� �ڿ� ������ �������� ����
}
}
//*/