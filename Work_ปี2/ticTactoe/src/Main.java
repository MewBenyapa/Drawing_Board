import java.util.Scanner;

public class Main {
	
	private static Board board = new Board() ;
	
	public static void main(String[] args) {
		char player = 'X';
		int row, column;
		Scanner scan =  new Scanner(System.in);
		Game game = new Game();

		board.initialBoard();
		
		while(true) {   
			
			if (player == 'X') {
				System.out.print("\nFirst player, Turn\n");
			} else {
				System.out.print("\nSecond player, Turn\n");
			}
			System.out.print("Please select row: ");
			row = scan.nextInt();
			System.out.print("Please select column: ");
			column = scan.nextInt();

			while (board.isNotEmpty(row-1, column-1)) {
				System.out.println("You cannot place on that cell.");
				board.displayBoard();
				System.out.print("Please select row: ");
				row = scan.nextInt();
				System.out.print("Please select column: ");
				column = scan.nextInt();

			}
			
			board.update(player, row-1, column-1);
			board.displayBoard();

			if(game.checkWinInRow() == 1 || game.checkWinInColumn() == 1 || game.DiagonalGoRight() == 1 || game.DiagonalGoLeft() ==1) {
				System.out.println("\nThe winner is first player !");
				break;
			} else if (game.checkWinInRow() == 2 || game.checkWinInColumn() == 2 || game.DiagonalGoRight() == 2 || game.DiagonalGoLeft() == 2){
				System.out.println("\nThe winner is second player !");
				break;
			}

			player = game.changePlayer(player);
			
		}
	}
}