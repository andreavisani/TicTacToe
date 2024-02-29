
public class Grid {
	
	private final int ROWS = 3;
	private final int COLS = 3;

	
	private char[][] grid = {
			{' ', ' ', ' ' }, 
			{' ', ' ', ' ' }, 
			{' ', ' ', ' ' }, 
	};
	
	
	public void printGrid() {
		System.out.println("  0 1 2");
		for (int i = 0; i < ROWS ; i++) {
			switch (i) {
			case 0: System.out.print('A');
			break;
			case 1: System.out.print('B');
			break;
			case 2: System.out.print('C');
			}
			System.out.print("|");
			for (int y = 0; y < COLS ; y++) {
				System.out.print(grid[i][y]);
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	public int convertRowColumn(char letter) {
		int rowNum = (int)letter - 65;
		return rowNum;
	}
	
	public void addElement(char row, int col) {
		int rowNum = convertRowColumn(row);
		
		grid[rowNum][col] = 'X';
	}
	
	public static void main (String[] args) {
		Grid myGrid = new Grid();
		myGrid.printGrid();
		
		myGrid.addElement('B', 0);
		myGrid.printGrid();
	}

}
					
			
