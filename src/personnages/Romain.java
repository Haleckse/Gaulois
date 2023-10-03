package personnages;

public class Romain {
	private String nom; 
	private int force;
	private Equipement[] equipement; 
	private int nbEquipement = 0 ;  
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert(force >= 0) : "Entrez une valeur >= 0"; 
		
		
	}
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	} 
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	public String prendreParole() {
		return "Le romain " +nom + ": ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert(force >= 0) : "La force d'un romain est toujours positive"; 
		int forceAvantCoup = force; 
		force -= forceCoup;
		if (force > 0 ) {
			parler("Aie");
		}
		else {
			parler("J'abandonne");
		}
		assert(forceAvantCoup > force) : "La force du romain doit diminuer"; 
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2 :
			System.out.println("Le soldat " + nom + " est deja bien protégé !");
		case 1 :
			if (equipement[0] == equipement) {
				System.out.println("Le soldat Minus possède déjà un casque.");
			}
		}
		
		
	}	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.recevoirCoup(2);
	}
}
