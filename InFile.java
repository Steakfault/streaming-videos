import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe permettant de lire un ficher d'entrée
public class InFile {

	private String filename; // nom du fichier
	private int videos; // nombre de videos
	private int endpoints; // nombre d'endpoints
	private int requestDescriptions; // nombre de requestDescriptions
	private int cache; // nombre de caches
	private int cacheSize; // taille de chaque cache en MB
	private List<Video> videoList; // liste des vidéos

	// Constructeur
	public InFile(String filename) {
		this.filename = "./input/" + filename + ".in";
		try {
			File file = new File(this.filename);
			try (Scanner sc = new Scanner(file)) {
				this.videos = sc.nextInt();
				this.endpoints = sc.nextInt();
				this.requestDescriptions = sc.nextInt();
				this.cache = sc.nextInt();
				this.cacheSize = sc.nextInt();

				this.videoList = new ArrayList<Video>();
				for (int i = 0; i < this.videos; i++) {
					Video v = new Video(i, sc.nextInt());
					this.videoList.add(v);
				}
			}
		} catch(Exception e) {}
	}

	// Pour le debug : affiche ce qui a été parsé
	public void debug() {
		System.out.println("Nombre de videos : " + this.videos);
		System.out.println("Nombre de endpoints : " + this.endpoints);
		System.out.println("Nombre de request descriptions : " + this.requestDescriptions);
		System.out.println("Nombre de cache : " + this.cache);
		System.out.println("Taille de chaque cache : " + this.cacheSize + "MB");

		System.out.println("\nListe des vidéos :");
		for (Video v : this.videoList) {
			System.out.println(" - " + v);
		}
	}


	/*
			   GETTERS
	*/

	// Retourne le nom du fichier
	public String getFilename() {
		return this.filename;
	}

	// Retourne le nombre de vidéos
	public int getVideos() {
		return this.videos;
	}

	// Retourne le nombre d'endpoints
	public int getEndpoints() {
		return this.endpoints;
	}

	// Retourne le nombre de requestDescriptions
	public int getRequestDescriptions() {
		return this.requestDescriptions;
	}

	// Retourne le nombre
	public int getCache() {
		return this.cache;
	}

	// Retourne la taille des caches
	public int getCacheSize() {
		return this.cacheSize;
	}

	// Retourne la liste des vidéos
	public List<Video> getVideoList() {
		return this.videoList;
	}

}
