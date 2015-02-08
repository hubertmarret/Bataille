
public class Carte {
	private int valeur;
	private COULEUR couleur;

	public Carte()
	{
		valeur=0;
		couleur= null;
	}
	public Carte(int val, COULEUR coul)
	{
		valeur=val;
		couleur=coul;
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public COULEUR getCouleur() {
		return couleur;
	}

	public void setCouleur(COULEUR couleur) {
		this.couleur = couleur;
	}
	
	public int superieur(Carte c) {
		if(valeur > c.valeur) {
			return 1;
		}
		else if(valeur < c.valeur) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
