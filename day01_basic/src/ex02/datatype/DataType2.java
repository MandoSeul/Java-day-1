package ex02.datatype;

public class DataType2 {
	public static void main(String[] args) {
		String str = "A"; // 문자열 , " ", 2byte , 문자열의 끝에는 null이 들어감 \0 ( 자동적으로 )
		char ch = 'A'; // 문자 , ' ' , 1byte
		char ch2 = 67 ;// 아스키 코드 값도 대입됨 ASCII
		char ch3 = 'b'; // ASCII : 98
		int su =20;
		String aa = "happy";
		double d = 12.345;
		System.out.println(ch);
		System.out.println(ch2);
		//ASCII로 출력하고 싶을때는 (int)붙여서 형 변환을 해주면됨.
		System.out.println((int)ch);
		System.out.println(ch2+ch3); // ASCII끼리 더해져서 출력됨
		System.out.println(ch2+","+ch3);//이러면 덧셈이 되는게 아니라 연결이 됨
		System.out.println("aa="+aa);
		System.out.println("실수형 데이터 : "+d);
		System.out.println("==================");
		
		for(int i = 65; i<=90; i++){
			System.out.print((char)i+"\t"); // \t = tab key
		}// for end
		System.out.println("-------------------");

		for(int i = 'a'; i<='z'; i++){ // 숫자값과 문자값 둘 다 가능
			System.out.print((char)i+"\t"); // \t = tab key
		}// for end
		
		System.out.println("\n\n boolean type");
		boolean flag = true; // c와 다르게 java에서는 bool이 int로 변환이 안됨
		System.out.println(flag);
	}
}
