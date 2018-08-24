/**
 * 
 */
package com.chapter3.arrays.tic_tac_toe;

/**
 * @author root
 *Simulation of a Tic Tac Toe game (does not do strategy)
 */
public class TicTacToe {
	
	private final int X = -1, O = 1;
	private final int EMPTY = 0;
	private int[][] board = new int[3][3];
	private int player;
	private int round = 0;
	boolean end = false;
	
	public TicTacToe() {
		clearBoard();
	}
	/**
	 * Clears the board
	 */
	public void clearBoard() {
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board[i].length ; j++) {
				board[i][j] = EMPTY;
			}
		}
		player = X;
	}
	
	/**
	 * Puts an X or O mark at position i,j.
	 * @param i
	 * @param j
	 * @throws IllegalArgumentException
	 */
	public void putMark(int i, int j) throws IllegalArgumentException{
		
		
		if(i < 0 || i > 2 || j < 0 || j > 2) 
			throw new IllegalArgumentException("Invalid board position.");
		if(board[i][j] != EMPTY) {
			throw new IllegalArgumentException("Board position occupied.");
		}
		if(end) {
			throw new IllegalArgumentException("The game has ended");
		}
		
		board[i][j] = player;
		player = -player;
		
		int winner = winner();
		
		if(round > 3 && round < 8 && winner != 0) {
			System.out.println();
			
			int winningPlayer = winner;
			String[] outcome = {"O wins", "", "X wins"};
			System.out.println(outcome[1 + winningPlayer]);
			end = true;
		}else if(round > 8 && winner == 0){
			System.out.println("Tie");
			end = true;
		}
		
		round++;
	}
	
	public boolean isWin(int mark) {
		return ((board[0][0] + board[0][1] + board[0][2] == mark * 3)
				|| (board[1][0] + board[1][1] + board[1][2] == mark * 3)
				|| (board[2][0] + board[2][1] + board[2][2] == mark * 3)
				|| (board[0][0] + board[1][0] + board[2][0] == mark * 3)
				|| (board[0][1] + board[1][1] + board[2][1] == mark * 3)
				|| (board[0][1] + board[1][2] + board[2][2] == mark * 3)
				|| (board[0][0] + board[1][1] + board[2][2] == mark * 3)
				|| (board[2][0] + board[1][1] + board[0][2] == mark * 3));		
	}
	
	
	public int winner() {
		if(isWin(X)) {
			return X;
		}else
			if(isWin(O)) {
				return O;
			}else {
				return 0;
			}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				switch(board[i][j]) {
				case X: sb.append("X"); break;
				case O: sb.append("O"); break;
				case EMPTY: sb.append(" "); break;				
				}
				
				if(j < 2)
					sb.append("|");
			}
			if(i < 2)
				sb.append("\n-----\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.putMark(1,1);  game.putMark(0,2);
		
		game.putMark(1,2);  game.putMark(0,0);
		
		game.putMark(1,0);  game.putMark(2,1);
		
		game.putMark(1,2);  game.putMark(1,0);
		
		game.putMark(2,0);
		
		
	}
}




