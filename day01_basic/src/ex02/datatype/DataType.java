package ex02.datatype;

public class DataType {
	static int Num; // 정수형 : 0으로 초기화 됨, 실수화도 0.0 문자열은 :NULL로 초기화됨 자동으로
public static void main(String[] args) {
	int i =0;//* 지역변수는 반드시 초기화하고 사용한다. 꼭 0이 아니더라도
	short x =90; //이처럼 명시적으로 자료형을 써주지 않는 이상 정수는 int로 인식됨
	float f = 33.4567F; // 우측에서 좌측으로 컴파일 되기 때문에 double형이 잡힘 그러지 않기 위해서
	// 우측에 F나, f적어줌
	System.out.println(x);
	System.out.println(f);
	System.out.println(100); // int 형으로 출력됨 
	System.out.println(200l); // long으로 출력하고 싶으면 뒤에다가 소문자 l이나 ㄷ문자 L이용
	System.out.println(12.34);//double로 인식됨 (system이 조금더 정밀 한 자료형을 defalut로 잡아버림)
	System.out.println(Num);
}
}
