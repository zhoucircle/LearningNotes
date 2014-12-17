import java.util.Scanner;
public class Poj1088{
	private int s[][] = new int[101][101];
	private int m[][] = new int[101][101];
	private int r;
	private int c;
	public static void main(String args[]){
		Poj1088 goSkiing = new Poj1088();
		goSkiing.init();
	}

	
	public void init(){
		Scanner cin = new Scanner(System.in);
		r = cin.nextInt();
		c = cin.nextInt();
		for(int i = 1 ; i <=  r ; ++i){
			for(int j = 1 ; j <= c ; ++j){
				s[i][j] = cin.nextInt();
				m[i][j] = -1;
			}
		}
		getMaxHeight();
	}
	public void getMaxHeight(){
		int temp;
		int max = -1;
		for(int i = 1 ; i <= r ; ++i){
			for(int j = 1 ; j <= c ; ++j){
				temp = getHeight(i,j);
				if(max<temp){
					max = temp;
				}
			}
		}
		System.out.println(max);
	}

	public int getHeight(int i,int j){
		int max = 0;
		int temp;
		if(m[i][j] == -1){
			if(j > 1){
				if(s[i][j] > s[i][j-1]){
					temp = getHeight(i , j-1);
					if(max < temp){
						max = temp;
					}

				}
			}
			if(j < c){
				if(s[i][j] > s[i][j+1]){
					temp = getHeight(i , j+1);
					if(max < temp){
						max = temp;
					}
				}
			}
			if(i >1){
				if(s[i][j] > s[i-1][j]){
					temp = getHeight(i-1 , j);
					if(max < temp){
						max = temp;
					}
				}
			}
			if(i < r){
				if(s[i][j] > s[i+1][j]){
					temp = getHeight(i+1 , j);
					if(max < temp){
						max = temp;
					}
				}
			}
			m[i][j] = max + 1;
			return m[i][j];
		}
		else{
			return m[i][j];
		}
	}
}