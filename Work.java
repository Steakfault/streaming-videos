import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Classe qui fait le taf'
public class Work {

	private InFile in; // contient les infos du fichier d'entré parsé
	private String results = ""; // contiendra le résultat

	// Constructeur
	public Work(InFile in) {
		this.in = in;
		this.generateResults();
	}

	// Génère les résultats
	private void generateResults() {
		this.results += this.in.getCache();

	}

	// Récupère les résultats
	public String getResults() {
		return this.results;
	}

	// Affiche les résultats
	public void printResults() {
		System.out.println(this.getResults());
	}

	// écrit les résultats dans un fichier
	public void out(String filename) {
		Writer writer = null;

		try {
			writer = new BufferedWriter(new FileWriter("./output/" + filename + ".out"));
			writer.write(this.results);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) try {
				writer.close();
			} catch (IOException ignore) {}
		}

	}

}