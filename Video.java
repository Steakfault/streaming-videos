// Classe permettant de décrire une vidéo
public class Video {
	private int id;
	private int size;

	// Constructeur
	public Video(int id, int size) {
		this.id = id;
		this.size = size;
	}

	public int getId() {
		return this.id;
	}

	public int getSize() {
		return this.size;
	}
}
