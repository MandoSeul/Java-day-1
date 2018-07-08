package ex04.print;

public class PrintTest {
	public static void main(String[] args) {
		double su = 123.4567;
		System.out.println(su);
		System.out.printf("%f\n",su);
		System.out.printf("%f\n",35.6);
		System.out.printf("%f \t %d \t %c \n",5.324,100,'A');
		System.out.printf("%f\n",12.3333337333333);// 소수점 6자리고, 5이상이면 그 뒤에수 7자리 수가 반올림 된다.
		System.out.printf("%10.4f\n",1234567890.3333337333333); // %전체자리 수(이것도 앞에 8자리 비워두고 2자리 나오는 거임) .소수점 자리수 (올라가는 그 수 뒷자리도 반올림됨) 
		//전체자리수가 기존 숫자보다 작을 경우 무시되어서 그냥 그 수가 나옴 - > 정수 부분을 무시해 버림 .3f 이렇게 이용함
		// 음수는 좌측 정렬 즉 10.4f하면 왼쪽부터 정렬되어서 빈칸이 안생김
		System.out.printf("%-10.4f\n",12.3333337333333); 
		System.out.println("\n\n");
		
		int x = 10;
		double d = 3.4;
		float f = 12.56f;
		
		System.out.println(x + "," + d + "," + f);
		System.out.println(100 + " ," + 20l+"," + 7.7f + "," +7.5); // f안쓰면 double type
		
		String str = "korea";
		System.out.printf("%s\n",str);
		System.out.printf("실수형 데이터 %f \n", d);
		System.out.printf("실수형 데이터 d = " + d + "입니다.");

	}
}
