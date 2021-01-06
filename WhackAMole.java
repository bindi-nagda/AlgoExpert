

public class WhackAMole {

	// instance variables
	public int score = 0;
	public int molesLeft = 0;
	public int attemptsLeft;
	public char[][] moleGrid;

	// constructor
	public WhackAMole(int numAttempts, int gridDimension) {
		attemptsLeft = numAttempts;
		moleGrid = new char[gridDimension][gridDimension];
		for (int i = 0; i < moleGrid.length; i++) { 
			for (int j = 0; j < moleGrid.length; j++) { 
				moleGrid[i][j] = '*'; 
			} 
		}
	} // end constructor

	// Methods
	public boolean place(int x, int y) {
		molesLeft = molesLeft + 1;
		System.out.println("The number of Moles placed is " + molesLeft); 
		moleGrid[x][y] = 'M';
		return true;
	}

	public void whack(int x, int y) {
		if (moleGrid[x][y] == 'M') {
			moleGrid[x][y] = 'W';
			molesLeft = molesLeft - 1;
			attemptsLeft = attemptsLeft - 1;
			System.out.println("Mole found! The number of attempts left is " + attemptsLeft); 
			score = score + 1;
		}
		else {
			attemptsLeft = attemptsLeft - 1;
			System.out.println("No mole here. The number of attempts left is " + attemptsLeft); 
		}
	}

	public void printGrid() {
		System.out.println(); 
		System.out.println(); 
		for (int i = 0; i < moleGrid.length; i++) { 
			for (int j = 0; j < moleGrid.length; j++) { 
				System.out.print(moleGrid[i][j] + " "); 
			} 

			System.out.println(); 
		} 
		System.out.println(); 
		System.out.println(); 
	}
} // end class WhackAMole

