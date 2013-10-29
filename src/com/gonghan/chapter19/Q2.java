package com.gonghan.chapter19;

/*
 * Design an algorithm to figure out if someone has won in a game of tic-tac-toe.
 */
public class Q2 {
	// init a n*n matrix, use 1 or 2, 0=empty
	int[][] array;
	int size = 4;

	public Q2() {
		array = new int[size][size];
		fillMatrix();
	}

	public void fillMatrix() {
		addMatrix(0, 0, 1);
		addMatrix(0, 1, 0);
		addMatrix(0, 2, 2);
		addMatrix(0, 3, 0);
		addMatrix(1, 0, 1);
		addMatrix(1, 1, 1);
		addMatrix(1, 2, 1);
		addMatrix(1, 3, 0);
		addMatrix(2, 0, 2);
		addMatrix(2, 1, 1);
		addMatrix(2, 2, 2);
		addMatrix(2, 3, 0);
		addMatrix(3, 0, 0);
		addMatrix(3, 1, 0);
		addMatrix(3, 2, 1);
		addMatrix(3, 3, 0);
	}

	private void addMatrix(int i, int j, int value) {
		this.array[i][j] = value;
	}

	private int getMatrix(int i, int j) {
		if (i >= 0 && i < size && j >= 0 && j < size)
			return array[i][j];
		else
			return -1;
	}

	public void check() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (check1(i, j) || check2(i, j) || check3(i, j)
						|| check4(i, j)) {
					int tmp = getMatrix(i, j);
					System.out.println("Player " + tmp + " wins.");
					return;
				}
			}
		}
		System.out.println("No player wins.");
	}

	// XXX
	private boolean check1(int i, int j) {
		int first = getMatrix(i, j);
		if (first == 0 || first == -1) {
			return false;
		}
		int second = getMatrix(i, j + 1);
		int third = getMatrix(i, j + 2);
		if (first == second && first == third) {
			return true;
		}
		return false;
	}

	// X
	// X
	// X
	private boolean check2(int i, int j) {
		int first = getMatrix(i, j);
		if (first == 0 || first == -1) {
			return false;
		}
		int second = getMatrix(i + 1, j);
		int third = getMatrix(i + 2, j);
		if (first == second && first == third) {
			return true;
		}
		return false;
	}

	// X
	// X
	// X
	private boolean check3(int i, int j) {
		int first = getMatrix(i, j);
		if (first == 0 || first == -1) {
			return false;
		}
		int second = getMatrix(i + 1, j + 1);
		int third = getMatrix(i + 2, j + 2);
		if (first == second && first == third) {
			return true;
		}
		return false;
	}

	// X
	// X
	// X
	private boolean check4(int i, int j) {
		int first = getMatrix(i, j);
		if (first == 0 || first == -1) {
			return false;
		}
		int second = getMatrix(i + 1, j - 1);
		int third = getMatrix(i + 2, j - 2);
		if (first == second && first == third) {
			return true;
		}
		return false;
	}
}
