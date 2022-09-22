package program;
import components.MainOffice;

/**
 *  * @author Roni_Jack_Vituli
 * */
public class Game {

	public static void main(String[] args) {
		MainOffice game = new MainOffice(5,4);
 		game.play(60);
	}
}
