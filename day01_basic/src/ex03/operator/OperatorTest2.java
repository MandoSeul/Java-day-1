/*
package ex03.operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// »ïÇ× (Á¶°Ç) ¿¬»êÀÚ : (Á¶°Ç)? (Âü):°ÅÁş;
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
		// »ïÇ× (Á¶°Ç) ¿¬»êÀÚ : (Á¶°Ç)? (Âü):°ÅÁş;
		int x = 3, y=5, z=7, result;
		result = (x>y)?x:
						(y>z)? y:z;
		System.out.println("result ===> " + result);

		
		int su = 10;
		String str;
		str = (su %2 ==0)? "Â¦¼ö" : "È¦¼ö";
		// °°Àº °Í : str = (su %2 !=0)? "È¦¼ö" : "Â¦¼ö";
		
		System.out.println(su+"===>  "  + str);
		
		int a =3, b=4, c=5; // Å« ¼ø À¸·Î ³ª¿­
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
					
		// ±³¼ö´ÔÀÌ ÇÑ °Í
		/*int max =0, mid =0, min =0;
		 * max = ((a>b)&&(a>c))?a:((b>c)&&(b>a)?:b:c;
		 * min =((a<b)&&(b<c))?a:((b<c)&&(b<a))?b:c;
		 * mid = ((max!=a)&&(min!=a))?a:((min!=b)&&(max!=b))?B:c;
		 * System.out.println(max + ">" + min + ">" + min);
		
		 */
	}

}
//*/