// Classe permettant de décrire une vidéo
public class Video {
	private int id; // l'id de la vidéo
	private int size; // la taille de la vidéo en MB

	// Constructeur
	public Video(int id, int size) {
		this.id = id;
		this.size = size;
	}

	// Retourne l'id de la vidéo
	public int getId() {
		return this.id;
	}

	// Retourne la taille de la vidéo en MB
	public int getSize() {
		return this.size;
	}

	// méthode pour transformer en String
	public String toString() {
		return "La video #" + getId() + " a une taille de " + getSize() + "MB";
	}
}
