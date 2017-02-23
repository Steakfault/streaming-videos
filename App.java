// Classe principale

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
		InFile in;
		Work w;

		filename = "example";
		in = new InFile(filename);
		in.debug();

		w = new Work(in);
		w.printResults();
		w.out(filename);


		filename = "kittens";
		in = new InFile(filename);
		in.debug();

		w = new Work(in);
		w.printResults();
		w.out(filename);


		filename = "me_at_the_zoo";
		in = new InFile(filename);
		in.debug();

		w = new Work(in);
		w.printResults();
		w.out(filename);


		filename = "trending_today";
		in = new InFile(filename);
		in.debug();

		w = new Work(in);
		w.printResults();
		w.out(filename);


		filename = "videos_worth_spreading";
		in = new InFile(filename);
		in.debug();

		w = new Work(in);
		w.printResults();
		w.out(filename);




		OutFile out = new OutFile("./output/caca.out", 352);
	}
}
