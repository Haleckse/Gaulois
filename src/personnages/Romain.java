package personnages;

import personnages.Equipement; 

public class Romain {
	private String nom; 
	private int force;
	private Equipement[] equipements; 
	private int nbEquipement = 0 ;  
	private String texte; 
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2]; 
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
	
//	public void recevoirCoup(int forceCoup) {
//		assert(force >= 0) : "La force d'un romain est toujours positive"; 
//		int forceAvantCoup = force; 
//		force -= forceCoup;
//		if (force > 0 ) {
//			parler("Aie");
//		}
//		else {
//			parler("J'abandonne");
//		}
//		assert(forceAvantCoup > force) : "La force du romain doit diminuer"; 
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
		parler("Aïe");
		if (equipements[i] == null) {
			continue;
			} else {
			equipementEjecte[nbEquipementEjecte] =
			equipements[i];
			nbEquipementEjecte++;
			equipements[i] = null;
			}
			}
			return equipementEjecte;
			}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2 :
			System.out.println("Le soldat " + nom + " est deja bien prot�g� !");
			break; 
		case 1 :
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " poss�de d�j� un " + equipement);
			}
			else {
				equipements[nbEquipement] = equipement; 
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement);
				nbEquipement ++; 
			}
			break; 
		case 0:
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement);
			equipements[nbEquipement] = equipement; 
			nbEquipement ++; 
			break; 
			
		}
	}	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.recevoirCoup(2);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);	}
	
}
