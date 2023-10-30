package personnages;

public class Gaulois {
	private String nom ;
	private int force ; 
	private int effetPotion = 1 ;
	private int nbTrophees;
	private static final int MAX_TROPHEES = 100; 
	private Equipement tropheesArray[] = new Equipement[MAX_TROPHEES];
	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
//	public String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		return ("Le gaulois " + nom + " : ");
		}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3);	
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.tropheesArray[nbTrophees] = trophees[i];
		}
		}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
//		asterix.parler("Bonjour, mon nom est " + asterix.getNom());
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("bonjour");
		Romain minus = new Romain("Minus", 6);
		asterix.frapper(minus); 
		
	}
}




