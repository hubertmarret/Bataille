import java.util.ArrayList;
import java.util.Collections;

public class Paquet {
	private ArrayList<Carte> paquet;
	private int NbCartes;
	
	public Paquet() {
		paquet = new ArrayList<Carte>();
		NbCartes = 52;
	}
	
	public int getNbCartes() {
		return NbCartes;
	}

	public void setNbCartes(int nbCartes) {
		NbCartes = nbCartes;
	}

	public ArrayList<Carte> getPaquet() {
		return paquet;
	}

	public void setPaquet(ArrayList<Carte> paquet) {
		this.paquet = paquet;
	}
	
	public void creerPaquet() {
		if(!paquet.isEmpty()) {
			paquet.clear();
		}
		for(COULEUR c : COULEUR.values()) {
			for(int j=0; j<NbCartes/COULEUR.values().length; j++) {
				paquet.add(new Carte(j+2,c));
			}
		}
	}
	
	public void melanger() {
		Collections.shuffle(paquet);
	}
	
	public Carte retireCarte() {
		return paquet.remove(paquet.size()-1);
	}
}
