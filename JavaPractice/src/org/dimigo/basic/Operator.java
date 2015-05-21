package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=9, b=10;
		double h=5.8;
		double area1=(a+b)*h/2;
		
		h=5.4;
		
		double area2=a*h;
		
		double c = area1-area2;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + area1);
		System.out.println("평행사변형 넓이 : " + area2);
		
		System.out.println("사다리꼴이 평행사변형보다 " + c + " 더 큽니다.");

	}

}
