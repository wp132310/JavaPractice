package org.dimigo.oop;
import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		System.out.println("1+1은?");
		String answer = scanner.nextLine();

		if ("2".equals(answer)) {
			System.out.println("ㅇㅇ");
		} 
		else {
			System.out.println("ㄴ");
		}

		System.out.println("");
		System.out.println("디미고인 사이트 주소는?");
		answer = scanner.nextLine();

		if ("dimigo.in".equalsIgnoreCase(answer)) {
			System.out.println("ㅇㅇ");
		} 
		else {
			System.out.println("ㄴㄴ");
		}
		System.out.println("");
		System.out.println("3+3은?");
		
		answer = scanner.nextLine();

		if ("6".equals(answer)) {
			System.out.println("ㅇㅇ");
		} 
		else {
			System.out.println("ㄴㄴ");
		}
		scanner.close();
	}
}