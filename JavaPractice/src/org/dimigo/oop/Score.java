package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int math = scanner.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		StringBuilder print = new StringBuilder();
		print.append("<< 점수 출력 >>\n")
		.append("국어 점수 : ")
		.append(kor)
		.append("\n수학 점수 : ")
		.append(math)
		.append("\n영어 점수 : ")
		.append(eng)
		.append("\n총점 : ")
		.append(kor+math+eng)
		.append("\n평균 : ")
		.append(String.format("%.1f", (kor+math+eng)/3.0));
		
		System.out.print(print);

	}

}
