/*
package ex03.operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� (����) ������ : (����)? (��):����;
		int x = 3, y=5, z=7, result;
		result = (x>y)?x:y;
		System.out.println("result ===> " + result);

	}

}
//*/

//*
package ex03.operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� (����) ������ : (����)? (��):����;
		int x = 3, y=5, z=7, result;
		result = (x>y)?x:
						(y>z)? y:z;
		System.out.println("result ===> " + result);

		
		int su = 10;
		String str;
		str = (su %2 ==0)? "¦��" : "Ȧ��";
		// ���� �� : str = (su %2 !=0)? "Ȧ��" : "¦��";
		
		System.out.println(su+"===>  "  + str);
		
		int a =3, b=4, c=5; // ū �� ���� ����
		int biggest, mid, small ;
		
		biggest = (a>b)?a:
			(b>c)? b:
				(c>a)? c:a;
		mid = (a>b)?a:
			(b>c)? b:
				(c>a)? b:a;
		small = (a>b)?a:
			(b>c)? b:
				(c>a)? a:c;
		
		System.out.println("biggest : " + biggest + "\t mid : " + mid + "\t small : " + small);
					
		// �������� �� ��
		/*int max =0, mid =0, min =0;
		 * max = ((a>b)&&(a>c))?a:((b>c)&&(b>a)?:b:c;
		 * min =((a<b)&&(b<c))?a:((b<c)&&(b<a))?b:c;
		 * mid = ((max!=a)&&(min!=a))?a:((min!=b)&&(max!=b))?B:c;
		 * System.out.println(max + ">" + min + ">" + min);
		
		 */
	}

}
//*/