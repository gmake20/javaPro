package days10;

public class Ex06 {

	public static void main(String[] args) throws InterruptedException {
		int [][]m = new int[5][5];
		// fillM(m);
		// fillM2(m);

		star1(5);
		// __*
		// _***
		// *****

		star2(5);
		// __*
		// _***
		// *****
		// _***
		// __*

		//magicSquare2(m); // 홀수마방진

		//dispM(m);

	}

	private static void star2(int n) {
		star1(n);
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<=i;j++)
				System.out.print(" ");
			for(int j=0;j<n*2-((i+1)*2+1);j++)  
				System.out.print("*");
			System.out.println();
		}
	}

	private static void star1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) 
				System.out.print(" ");
			for(int j=0;j<i*2+1;j++)
				System.out.print("*");
			System.out.println();
		}


	}

	// 1행의 가운데 1입력 (1행, (length-1/2)열)
	// 열증가, 행감소 => col+1 row-1
	private static void magicSqare(int[][] m) {
		int row = 0;
		int col = m[0].length/2;
		int count = 1;
		m[row][col] = count;
		while(count< m.length*m[0].length) {
			if(count % m.length == 0) {
				row++;
			}
			else {
				col++; row--;				
			}
			if(col == m[0].length) col=0;
			if(row < 0) row = m.length-1;
			if(row == m.length) row = 0;

			count++;
			m[row][col] = count;
		}

	}

	private static void magicSquare2(int[][] m) throws InterruptedException {
		int v = 1;      
		int row = 0, col = m[0].length/2; // 행, 열
		m[row][col] = v;

		while (v < m.length * m[0].length) {

			if ( v % 5 == 0 ) {
				row++;
				if(row >= m.length) row = 0;
			} else {
				col++; row--;
				if (row == -1)  row = m.length-1;
				if (col == m[0].length) col = 0; 
			}
	
			m[row][col] = ++v;
			
			
			dispM(m);
			System.out.println();
			Thread.sleep(1000);
		} // while


	}


	//  0   1   2   3  4      
	//0   [01][06][11][16][21]
	//1   [02][07][12][17][22]
	//2   [03][08][13][18][23]
	//3   [04][09][14][19][24]
	//4   [05][10][15][20][25]    	
	private static void fillM2(int[][] m) {
		for(int i=0,v=1;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++,v++) {
				// m[j][i] = v;
				m[i][j] = m[i].length+i+1;
				// m[i][j] = 5*i+j+1;
			}
		}
	}

	private static void fillM(int[][] m) {
		for(int i=0,v=1;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++,v++) {
				m[i][j] = v;
			}
		}
	}

	private static void dispM(int[][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
		}
	}

}
