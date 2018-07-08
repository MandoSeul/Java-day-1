/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	System.out.println(3+4*5);
	System.out.println((3+4)*5);
	// 단항 연산자 : 증감 ==> ++, --, ~
	int x = 10, y;
	y=x++;
	System.out.println("x = " + x +"\ny = " + y);
//난 항상 이거 헷갈리던데 ++가 뒤에 붙어 있으면 후위 연산자 이므로 미리 x가 가진 값을 y에게 넘겨주고 그
// 다음에 x의 값을 하나 올려주는 것 -> 증감연산자 중 후위 연산자

	// 반대로 전위 연산자도 있음 미리 x의 값을 올려주고 y에 넣어줌
	y = ++x;
	System.out.println("x = " + x +"\ny = " + y);
++x; //x++;// 앞 뒤 의미가 없어짐 
//이렇게 단독으로 쓰이면 결과적으로 값은 똑같음
}
}
/*/
/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	int x = 10, y;
	y=~x; // 비트 부정 : -(원래값+1) ==> 결과 출력함
	System.out.println("x = " + x +"\ny = " + y);
}
}
//*/

/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
// 산술연산자 : +, -, * , /, % , ^ .....
	int x = 10, y = 20;
	int god = x*y;
	System.out.println("x *y = " + god);
	System.out.println("x *y =  " + x+y);
	
	System.out.println("7 /3 =  " + 7/3); // 몫
	System.out.println("7 %3 =  " + 7%3); // 나머지


}
}
//*/

/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	// 1. 변수선언
	// 강사님은 m_na, ch_na, b_na 로 나머지 저장 변수 만들어 줌
	int pay = 567890;
	int 만원 , 천원, 백원, 십원, tmp;
	// 2. 메세지 출력 및 입력받기
	// 3. 처리(계산)
	// 4. 결과 출력(화면)
	만원 = pay/10000;
	tmp= pay%10000;
	천원 = tmp/1000;
	tmp = tmp %1000;
	백원 = tmp/100;
	tmp = tmp%100;
	십원 = tmp/10;
	System.out.println("만원 : " + 만원 + "장");
	System.out.println("천원 : " + 천원+ "장");
	System.out.println("백원 : " + 백원+ "장");
	System.out.println("십원 : " + 십원+ "장");
	System.out.println();
// 한번에 할 수 도 있음 ex 	System.out.println("만원 : " + pay/10000 + "장");
	// System.out.println("천원 : " + (pay%10000)/1000 + "장");
	System.out.println("만원 : " + pay/10000 + "장");
	System.out.println("천원 : " + (pay%10000)/1000 + "장");
 
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
	 System.out.println(hour + " 시 " + min + " 분 " + sec + " 초  입니다");
	 
}
}
//*/

/*
package ex03.operator;

public class OperatorTest {
public static void main(String[] args) {
	//shift 연삱나 : <<, >>, <<<
	
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
// 논리 연산자 : &, |, ^ ( 2진 논리에서는 결과를 -> 값으로 알려줌)
	// 10진 논리에서는 결과 값 - > 참, 거짓 으로 얄려줌 && || !
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
// 앞의 것이 이미 결론을 낸 논리 연산자는 뒤에 연산을 수행하지 않음
}
}
//*/