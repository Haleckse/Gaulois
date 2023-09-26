package personnages;
import java.util.Random;

public class Druide {
	private String nom; 
	private int effetPotionMax;
	private int effetPotionMin;
	private int forcePotion = 1; 
	
	public Druide(String nom, int effetPotionMax, int effetPotionMin) {
		super();
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;
		parler("Je suis le druide " + nom + "effet potion min" + effetPotionMax + "effet potion max " + effetPotionMax);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public void setEffetPotionMax(int effetPotionMax) {
		this.effetPotionMax = effetPotionMax;
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void setEffetPotionMin(int effetPotionMin) {
		this.effetPotionMin = effetPotionMin;
	}
	
	public String prendreParole() {
		return "Le duide " +nom + ": ";
	}
		
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
}
