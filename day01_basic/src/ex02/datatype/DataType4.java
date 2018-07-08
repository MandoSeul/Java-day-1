package ex02.datatype;

public class DataType4 {
public static void main(String[] args) {
	int su = 10;
	System.out.println("10진수 : " +su); // %d, %o, %x, %X);
	System.out.printf("10진수 %d\n",su);
	System.out.printf("8진수 %o\n",su);
	System.out.printf("16진수 %x %X \n",su,su);
	System.out.println("====================");
	System.out.printf("10진수 값 : %d \n",012); // 0숫자 <----8진수
	System.out.printf("10진수 값 : %d \n",0xA); // 0x숫자 <----16진수

	//정수 (+, -, *, /, % ,,,,,,,) 정수 = 정수
	
	System.out.println("7/3 = " + 7/3);
	System.out.println("7/3.0 = " + 7/3.0); // 실수 연산이 됨
	System.out.println("7./3. = " + 7./3.); 
	
}
}
