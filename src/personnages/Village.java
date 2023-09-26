package personnages;
import personnages.Gaulois;
import personnages.Chef;

public class Village {
	private Chef chef; 
	private String nom;
	private Gaulois[] villageois; 
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];	 
	}
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}

	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois; 
		nbVillageois ++; 
	}
	
	public Gaulois trouverHabitant(int numeroHabitant ) {
		return villageois[numeroHabitant]; 
	}
	
	public void  afficherVillageois() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		
//		Gaulois gaulois = village.trouverHabitant(30);
//			On depasse ici la longueur du tableau
		
		Chef abraracourcix = new Chef("Abraracourcis", 8, village);
		
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//			Gaulois ne se trouve pas dans la liste des habitants 
		
		System.out.println(village.chef);
		
	}
}
