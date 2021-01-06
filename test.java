import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numAttempts = 5;
		WhackAMole myGame = new WhackAMole(numAttempts,10);

		myGame.printGrid();

		myGame.place(0,0);
		myGame.place(0,1);
		myGame.place(1,3);
		myGame.place(2,1);
		myGame.place(6,5);
		myGame.place(4,9);
		myGame.place(7,2);
		myGame.place(3,8);
		myGame.place(7,7);
		myGame.place(9,9);

		myGame.printGrid();

		for (int i = 1; i <= numAttempts; i++ ) {

			System.out.print("Enter x coordinate:  ");
			int x = scanner.nextInt();
			System.out.print("Enter y coordinate:  ");
			int y = scanner.nextInt();

			myGame.whack(x, y);
			myGame.printGrid();

		}
		
		System.out.println("Your final score is:  " + myGame.score);
		
		scanner.close();
	}
}
