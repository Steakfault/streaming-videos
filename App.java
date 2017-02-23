/**
 * JavaDoc comment
 * Main attributes:
 *
 * @author      Team SteakFault
 * @version     0.1
 * @since       2017/02/23
 */

// Classe principale
public class App {
	public static void main (String [] args) {

		String filename; // le nom du fichier (sans l'extension, etc...)


		/*
				Juste à décommenter le fichier souhaité
		*/

		filename = "example";
		// filename = "kittens";
		// filename = "me_at_the_zoo";
		// filename = "trending_today";
		// filename = "videos_worth_spreading";

		InFile in = new InFile(filename);
		in.debug();

		Work w = new Work(in);
		w.printResults();
		w.out(filename);
	}
}
