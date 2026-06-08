package days10;

public class Ex07 {
	final static int LEFT = 0;
	final static int DOWN = 1;
	final static int RIGHT = 2;
	final static int UP = 3;

	public static void main(String[] args) {
		
		int[][] m = new int[5][5];
		whelk(m,1,0,-1,2);
		
		dispM(m);

	}

	private static int whelk(int[][] m,int cnt,int row,int col, int arrow) {
		if(cnt > m.length*m[0].length) {
			return 0;
		}

		int row2=row,col2=col;
		if(arrow == LEFT) {
			col2 = col-1;
			if(col2 < 0 || m[row2][col2] != 0) 
				return whelk(m,cnt,row,col,UP);
		} else if(arrow == DOWN) {
			row2 = row+1;
			if(row2 >= m[0].length || m[row2][col2] != 0) 
				return whelk(m,cnt,row,col,LEFT);
		} else if(arrow == RIGHT) {
			col2 = col+1;
			if(col2 >= m.length || m[row2][col2] != 0) 
				return whelk(m,cnt,row,col,DOWN);
		} else if(arrow == UP) {
			row2 = row-1;
			if(row2 < 0 || m[row2][col] != 0) 
				return whelk(m,cnt,row,col,RIGHT);
		}

		m[row2][col2] = cnt;
		whelk(m,cnt+1,row2,col2,arrow);
		return 0;		
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
