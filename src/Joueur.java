
import java.util.LinkedList;
import java.util.Queue;


public class Joueur {
	private Queue<Carte> deck;
	private String nom;
	private int score;
	
	public Joueur(String nom) {
		deck = new LinkedList<Carte>();
		this.nom = nom;
		score = 0;
	}
	
	public Queue<Carte> getDeck() {
		return deck;
	}
	public void setDeck(Queue<Carte> deck) {
		this.deck = deck;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void addScore(int gain) {
		score += gain;
	}
	
	public void ajouteCarte(Carte c) {
		deck.add(c);
	}
	
	public Carte retireCarte() {
		Carte carteSortie = deck.remove();
		return carteSortie;
	}
}
