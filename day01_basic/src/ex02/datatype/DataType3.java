/*
package ex02.datatype;

public class DataType3 {
	public static void main(String[] args) {
		short sh = 32767; // -32768~32767
		int num = 32769; // -21억~21억
		System.out.println(sh);
		num = sh; // int = short 가능 2byte를 4byte에 할당하는 것이라 가능
		// 자동 형변환이 됨 
		// 작은 자료형은 큰 자료형에 자동형변환(묵시적 형변환)
		System.out.println("sh= " + sh);
		System.out.println("num = " + num);
		
		num = 32769; // 범위를 초과해서 -가 출력됨 short로 출력하면
		// 그 범위 내에서 rotation됨
		sh = (short)num; // short= int 할때는 명시적 형변환이 필요
		//큰 자료형을 작은 자료형에 넣으려면 명시적형변환을 해야함
		//데이터 손실 발생
		System.out.println(sh + ", " +num);
	}
}
// end class
//*/

//*
package ex02.datatype;

public class DataType3 {
public static void main(String[] args) {
	short sh = 32767;
	int num = 50000;
	System.out.println(sh + " : " + num);
	num = -32769;
	sh = (short)num;
	System.out.println(sh + " : " + num);
	
}
}
//end class
//*/
