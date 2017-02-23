import java.io.File;
import java.util.Scanner;

// Classe permettant de lire un ficher d'entrée
public class InFile {

	private String filename;
	private int videos = 0;
	private int endpoints = 0;
	private int requestDescriptions = 0;
	private int cache= 0;
	//public char[][] content;

	public InFile(String filename) {
		this.filename = filename;
		try {
			File file = new File(filename);
			try (Scanner sc = new Scanner(file)) {
				this.videos = sc.nextInt();
				this.endpoints = sc.nextInt();
				this.requestDescriptions = sc.nextInt();
				this.cache = sc.nextInt();
				//this.content = new char[this.columns][this.rows];

				/*int j = 0;
				while (sc.hasNext() && j < this.rows) {
					String str = sc.next();
					for (int i = 0; i < this.columns; i++) {
						this.content[i][j] = str.charAt(i);
					}
					j++;
				}*/

			}
		} catch(Exception e) {}
	}

	public void debug() {
		System.out.println("Nombre de videos : " + this.videos);
		System.out.println("Nombre de endpoints : " + this.endpoints);
		System.out.println("Nombre de request descriptions : " + this.requestDescriptions);
		System.out.println("Nombre de cache: " + this.cache);
	}
}
