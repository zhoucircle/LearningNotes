//这一题在运行的submit之后报Runtime error，可能是因为使用了递归的原因（PS：具体原因未知）
//但是通过这一题和2756发现了在二叉树中找到递归方程，然后用递归的方法解题会使得问题的思路变得很清晰，赞！！！

import java.util.Scanner;
public class Poj2499{
	private static int left = 0 ;
	private static int right = 0 ;
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		int scenario = cin.nextInt();
		
		for(int i = 1 ; i <= scenario ; ++i){
			int x = cin.nextInt();
			int y = cin.nextInt();
			System.out.println("Scenario #" + i +":");
			father(x,y);
		}

	}

	public static void father(int x,int y){
		if (x == y){
			System.out.println(left + " " + right + "\n");
		}
		else if (x < y){
			right++;
			father(x,y-x);
			
		}
		else{
			left++;
			father(x-y,y);
		}
	}
}