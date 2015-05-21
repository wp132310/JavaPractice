package org.dimigo.basic;


public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary = 1700000;
		int employee = 3;
		int num = 1500;
		long sum = (long) salary * 12 * employee * num;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + salary + "원");
		System.out.println("점포 내 직원 수 : " + employee + "명");
		System.out.println("점포 수 : " + num + "개");
		System.out.println("연간 인건비 : " + sum + "원");
		
		

	}

}
