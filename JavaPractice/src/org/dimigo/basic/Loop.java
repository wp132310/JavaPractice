package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		
		for(i=1; i<=10; i++){
			for(j=1; j<=10; j++){
			if(j==i) System.out.print("*");
			else System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
