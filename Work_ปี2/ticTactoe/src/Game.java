public class Game {

	private Board board = new Board() ;

	public char changePlayer(char player) {
		char newTurn = 'a';
		if (player == 'O')
			newTurn='X';
		if (player == 'X')
			newTurn = 'O';
		return newTurn;
	}

	public int checkWinInRow() {
		int countX = 0, countO = 0, x = 0, i, j, u;
		for(i = 0; i < 9; i++) {
			for(j = 0; j < 9; j++) {
				if(board.isNotEmpty(i, j) && j < 5) {
					for(u = j; u < j + 4; u++) {
						if(board.getBoard()[i][u] == board.getBoard()[i][u + 1] && (board.getBoard()[i][u] == 'X')) {
							countX++;
						} else if (board.getBoard()[i][u] == board.getBoard()[i][u + 1] && (board.getBoard()[i][u] == 'O')) {
							countO++;
						} else {
							countX = 0; countO = 0;
						}
					}
					if(countX == 4) { x = 1; } 
					else if (countO == 4) { x = 2; } 
				}
			}
		}
		return x;
	}
	
	public int checkWinInColumn() {
		int countX = 0, countO = 0, x = 0, i, j, u;
		for(i = 0; i < 9; i++) {
			for(j = 0; j < 9; j++) {
				if(board.isNotEmpty(i, j) && i < 5) {
					for(u = i; u < i + 4; u++) {
						if(board.getBoard()[u][j] == board.getBoard()[u + 1][j] && (board.getBoard()[u][j] == 'X')) {
							countX++;
						} else if (board.getBoard()[u][j] == board.getBoard()[u + 1][j] && (board.getBoard()[u][j] == 'O')) {
							countO++;
						} else {
							countX = 0; countO = 0;
						}
					}
					if(countX == 4) { x = 1; } 
					else if (countO == 4) { x = 2; } 
				}
			}
		}
		return x;
	}
	
	public int DiagonalGoRight() {
		int right = 0 , i = 0 ;

		while(i < 9) {
			if(board.getBoard()[i][i] == 'X') {
				right++ ;
				if(right == 5) {
					return 1 ;
				}
			}else if(board.getBoard()[i][i] == 'O') {
				right++ ;
				if(right == 5) {
					return 2 ;
				}
			}else {
				right = 0 ;
			}
			i++;
		}
		return 0 ;
	}

	public int DiagonalGoLeft() {
		int left = 0 , i = 8 , j = 0;
		while(i >= 0 && j < 9) {
			if(board.getBoard()[i][j] == 'X') {
				left++ ;
				if(left == 5) {
					return 1 ;
				}
			}else if(board.getBoard()[i][j] == 'O') {
				left++ ;
				if(left == 5) {
					return 2 ;
				}
			}else {
				left = 0 ;
			}
			i--; j++;
		}
		return 0 ;
	} 
	
}