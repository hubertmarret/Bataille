
public class Jeu {
	private Paquet paquet;
	private Carte carte1;
	private Carte carte2;
	private Joueur joueur1;
	private Joueur joueur2;
		
	public Jeu() {
		paquet = new Paquet();
		carte1 = new Carte();
		carte2 = new Carte();
		joueur1 = new Joueur("bob");
		joueur2 = new Joueur("mat");
	}
	
	public Carte getCarte1() {
		return carte1;
	}
	public void setCarte1(Carte carte1) {
		this.carte1 = carte1;
	}
	public Carte getCarte2() {
		return carte2;
	}
	public void setCarte2(Carte carte2) {
		this.carte2 = carte2;
	}
	
	public void distribuer() {
		paquet.melanger();
		for(int i=0; i<paquet.getNbCartes(); i++) {
			if(i % 2 == 0) {
				joueur1.ajouteCarte(paquet.retireCarte());
			}
			else {
				joueur2.ajouteCarte(paquet.retireCarte());
			}
		}
	}
	
	public void installerJeu() {
		paquet.creerPaquet();
		System.out.println(paquet.getPaquet().size());
		distribuer();
	}
	
	public void sortirCarte() {
		carte1 = joueur1.retireCarte();
		carte2 = joueur2.retireCarte();
		switch(carte1.superieur(carte2)) {
		case 1: 
			joueur1.addScore(3);
			break;
		case -1:
			joueur2.addScore(3);
			break;
		case 0:
			joueur1.addScore(1);
			joueur2.addScore(1);
			break;
		default:
			System.out.println("problem");
		}
	}
	
	public void afficheVainqueur() {
		int diff = joueur1.getScore() - joueur2.getScore();
		if(diff > 0) {
			System.out.println(joueur1.getNom()+" gagne.");
		}
		else if(diff < 0) {
			System.out.println(joueur2.getNom()+" gagne.");
		}
		else {
			System.out.println(joueur1.getNom()+" et "+joueur2.getNom()+" sont ex aequo.");
		}
	}
	
	public void jouer() {
		installerJeu();
		do {
			sortirCarte();
		}
		while(joueur1.getDeck().isEmpty());
		afficheVainqueur();
	}
	
}
