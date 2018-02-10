
public class arraysBidimensionales {
	public static void main (String[] args){
		int[][] bidimensional=new int[4][5];

		bidimensional[0][0]=15;
		bidimensional[0][1]=12;
		bidimensional[0][2]=3;
		bidimensional[0][3]=7;
		bidimensional[0][4]=30;

		bidimensional[1][0]=10;
		bidimensional[1][1]=11;
		bidimensional[1][2]=4;
		bidimensional[1][3]=20;
		bidimensional[1][4]=9;

		bidimensional[2][0]=1;
		bidimensional[2][1]=4;
		bidimensional[2][2]=7;
		bidimensional[2][3]=8;
		bidimensional[2][4]=2;

		bidimensional[3][0]=19;
		bidimensional[3][1]=15;
		bidimensional[3][2]=21;
		bidimensional[3][3]=30;
		bidimensional[3][4]=14;

		for(int i=0;i<4;i++){
			System.out.println();
			for(int y=0;y<5;y++){
				System.out.print(bidimensional[i][y] + " ");
			}
		}
	}
}
