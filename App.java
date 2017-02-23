// Classe principale
public class App {
	public static void main (String [] args) {

		String filename;


		/*
				Juste à décommenter le fichier souhaité
		*/

		filename = "example";
		// filename = "kittens";
		// filename = "me_at_the_zoo";
		// filename = "trending_today";
		// filename = "videos_worth_spreading";

		InFile in = new InFile("./input/" + filename + ".in");
		in.debug();
	}
}
