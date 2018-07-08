package ex04.print;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		// 1. 사용할 변수 선언
		int kor = 90, eng = 90, com = 100, total;
		double avg = 0; // 평균-소수점 2자리까지 표현
		String name = "Seul Kee";
		//2.
		System.out.println(name +"님의 성적표");
		System.out.println("kor : " + kor + "\teng : " + eng + "\tcom : " + com );
		
		//3. 처리(계산)
		total = kor + eng + com;
		avg = ((double)total/3);
		System.out.printf("total : " + total +"\taverage : %.2f " ,avg);
		
		//4. 결과출력
}
}
