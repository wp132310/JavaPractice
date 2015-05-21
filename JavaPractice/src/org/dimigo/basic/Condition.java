package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d = 25;
		int bustype = 3;
		int pay = 0;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + d + "km");
		
		switch(bustype){
		case 1:
			System.out.println("차종 : 고속버스");
			pay = 850 + 300*((d-1)/10);
			break;
		case 2:
			System.out.println("차종 : 경차"); 
			pay = 300 + 200*((d-1)/10);
			break;
		case 3:
			System.out.println("차종 : 그 외");
			pay = 600 + 200*((d-1)/10);
			break;
			
		}
		
		System.out.println("통행료 : " + pay + "원");
		

	}

}
