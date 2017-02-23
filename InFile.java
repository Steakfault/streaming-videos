import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe permettant de lire un ficher d'entrée
public class InFile {

	private String filename;
	private int videos;
	private int endpoints;
	private int requestDescriptions;
	private int cache;
	private int cacheSize;
	private List<Video> videoList;

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


	// Getters

	public String getFilename() {
		return this.filename;
	}

	public int getVideos() {
		return this.videos;
	}

	public int getEndpoints() {
		return this.endpoints;
	}

	public int getRequestDescriptions() {
		return this.requestDescriptions;
	}

	public int getCache() {
		return this.cache;
	}

	public int getCacheSize() {
		return this.cacheSize;
	}

	public List<Video> getVideoList() {
		return this.videoList;
	}

}
