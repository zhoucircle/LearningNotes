import java.util.Scanner;
public class poj2756{
	public static void main(String args[]){
		Scanner cin =new Scanner(System.in);
		int x = cin.nextInt();
		int y = cin.nextInt();
		System.out.println(father(x,y));

	}

	public static int father(int x,int y){
		if(x == y){
			return x;
		}
		else if (x <= y){
			return father(x,y/2);
		}
		else{
			return father(x/2,y);
		}
	}
}
