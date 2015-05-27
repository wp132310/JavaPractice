package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "혜리", "그외"}
		};
		
		int i=0;
		for(String group : idolGroup) {
			System.out.println("<< "+group+" 멤버 >>");
			
			for(String member : members[i++])
				System.out.println(member);
			
			System.out.println();
		}
	}

}
