package com.games;

import java.util.Scanner;

public class TicTakToe {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		char[][] board = new char[3][3];
		char currentPlayer = 'X';
		boolean gameOver = false;
		initializeBoard(board);
		System.out.println("====================================");
		System.out.println("       TIC TAC TOE GAME");
		System.out.println("====================================");
		System.out.println("Player 1 : X");
		System.out.println("Player 2 : O");
		System.out.println();
		System.out.println("Board Positions");
		System.out.println("----------------");
		System.out.println("00 | 01 | 02");
		System.out.println("10 | 11 | 12");
		System.out.println("20 | 21 | 22");
		System.out.println();
		while (!gameOver) {
			printBoard(board);
			System.out.println("Player " + currentPlayer + " Turn");
			System.out.print("Enter Position (00-22): ");
			String position = sc.next();
			// Check input length
			if (position.length() != 2) {
				System.out.println("❌ Invalid Input! Enter like 00, 11, 22.");
				continue;
			}
			// Check digits
			if (!Character.isDigit(position.charAt(0))
					|| !Character.isDigit(position.charAt(1))) {
				System.out.println("❌ Enter numbers only.");
				continue;
			}
			int row = position.charAt(0) - '0';
			int col = position.charAt(1) - '0';
			// Validate range
			if (row > 2 || col > 2) {
				System.out.println("❌ Position must be between 00 and 22.");
				continue;
			}
			// Already occupied
			if (board[row][col] != ' ') {
				System.out.println("❌ Position already occupied.");
				continue;
			}
			board[row][col] = currentPlayer;
			if (checkWin(board, currentPlayer)) {
				printBoard(board);
				System.out.println();
				System.out.println("***************************");
				System.out.println("Player " + currentPlayer + " Wins!");
				System.out.println("***************************");
				gameOver = true;
			} else if (isBoardFull(board)) {
				printBoard(board);
				System.out.println();
				System.out.println("***************************");
				System.out.println("Match Draw!");
				System.out.println("***************************");
				gameOver = true;
			} else {
				if (currentPlayer == 'X')
					currentPlayer = 'O';
				else
					currentPlayer = 'X';
			}
		}
		sc.close();
	}
	// Initialize Board
	static void initializeBoard(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}
	// Print Board
	static void printBoard(char[][] board) {
		System.out.println();
		System.out.println("     0   1   2");
		System.out.println("   -------------");

		for (int i = 0; i < 3; i++) {
			System.out.print(i + "  | ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("   -------------");
		}
		System.out.println();
	}
	// Check Winner
	static boolean checkWin(char[][] board, char player) {
		// Rows
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == player &&board[i][1] == player &&board[i][2] == player) {
				return true;
			}
		}

		// Columns
		for (int j = 0; j < 3; j++) {

			if (board[0][j] == player &&  board[1][j] == player &&board[2][j] == player) {
				return true;
			}
		}

		// Main Diagonal
		if (board[0][0] == player &&board[1][1] == player &&board[2][2] == player) {
			return true;
		}
		// Secondary Diagonal
		if (board[0][2] == player &&board[1][1] == player &&board[2][0] == player) {
			return true;
		}
		return false;
	}
	// Check Draw
	static boolean isBoardFull(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {

					return false;
				}
			}
		}
		return true;
	}
}