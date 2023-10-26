import java.util.*;
public class bbGameGameInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseballGame bbGame = new BaseballGame();
		
		System.out.print("Enter name of team number 1 >> ");
		bbGame.setTeam(0, sc.nextLine());

		for(int i = 0; i < 9; i++) {
			System.out.print("\nPlease enter scores in game #" + (i+1) + ": ");
			bbGame.setScores(0, i, sc.nextInt());
		}
		
		System.out.print("\nEnter name of the team number 2 >> ");
		bbGame.setTeam(1, sc.nextLine());
		sc.next();
		for(int i = 0; i < 9; i++) {
			System.out.print("\nPlease enter scores in game #" + (i+1) + ": ");
			bbGame.setScores(1, i, sc.nextInt());
		}
	}

}
