
public class Application {
	public static void main(String[] args) {
		
		int [] values = {3,5,89};
		
		System.out.println(values[2]);
		
		int[][] grid = {
				{3,5,89},
				{3,4},
				{1,2,8,5,96}
		};
		
		System.out.println( grid [2][4]);
		
		String[][] texts = new String [2][3];
		texts[0][1] ="Hello there";
		System.out.println(texts[0][1]);
		
		for (int row= 0; row < grid.length; row++){
			for (int col = 0; col < grid[row].length; col++ )
				 System.out.print(grid[row][col]  + "\t" );
		System.out.println();
		}
	}
}
