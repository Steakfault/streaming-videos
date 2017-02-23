import java.io.File;
import java.util.Scanner;

// Classe permettant de lire un ficher d'entrée
public class InFile {

	private String filename;
	private int videos;
	private int endpoints;
	private int requestDescriptions;
	private int cache;
	private int cacheSize;

	public InFile(String filename) {
		this.filename = filename;
		try {
			File file = new File(filename);
			try (Scanner sc = new Scanner(file)) {
				this.videos = sc.nextInt();
				this.endpoints = sc.nextInt();
				this.requestDescriptions = sc.nextInt();
				this.cache = sc.nextInt();
				this.cacheSize = sc.nextInt();
			}
		} catch(Exception e) {}
	}

	public void debug() {
		System.out.println("Nombre de videos : " + this.videos);
		System.out.println("Nombre de endpoints : " + this.endpoints);
		System.out.println("Nombre de request descriptions : " + this.requestDescriptions);
		System.out.println("Nombre de cache : " + this.cache);
		System.out.println("Taille de chaque cache : " + this.cacheSize + " Mo");
	}
}
