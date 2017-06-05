
public class Board {
	
	private static char [][] board = new char[9][9];

	public void initialBoard() {
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				board[i][j] = '_';
	}
	
	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
	
	public boolean isNotEmpty(int row, int column) {
		if(board[row][column] != '_') {
			return true;
		} else { return false; }
	}

	public boolean checkIfFull() {
		boolean check = false;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(board[i][j] != '_') {
					check = true;
				}
			}
		}
		return check;
	}
	
	public void displayBoard() {
		System.out.println(" 0  1 2 3 4 5 6 7 8 9");
		for(int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(j == 0) { 
					System.out.print(" " + (i + 1) + "  ");
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void update(char player, int row, int column) {
		board[row][column] = player;
	}

}
