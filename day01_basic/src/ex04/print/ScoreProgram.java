package ex04.print;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		// 1. ����� ���� ����
		int kor = 90, eng = 90, com = 100, total;
		double avg = 0; // ���-�Ҽ��� 2�ڸ����� ǥ��
		String name = "Seul Kee";
		//2.
		System.out.println(name +"���� ����ǥ");
		System.out.println("kor : " + kor + "\teng : " + eng + "\tcom : " + com );
		
		//3. ó��(���)
		total = kor + eng + com;
		avg = ((double)total/3);
		System.out.printf("total : " + total +"\taverage : %.2f " ,avg);
		
		//4. ������
}
}
