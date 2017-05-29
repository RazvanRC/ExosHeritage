package fr.razvan.modele;

import java.time.LocalDate;

public class Patron extends Employe {
	
	private float CA;
	private double pourcentage;
	private double salaire;
	
	@Override
	public double getSalaire() {
		
		salaire = (CA * pourcentage ) / 100;
		return salaire;
	}

	public Patron(String nom, String prenom, String matricule, LocalDate dateNaiss, float CA, double pourcentage) {
		super(matricule, nom, prenom, dateNaiss);
		this.CA = CA;
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "Patron [matricule: " + getMatricule() + ", prenom: " + getPrenom() + ", nom: " + getNom() + ", date naissance: " + getDateNaissance() + ", CA: " + CA + ", pourcentage: " + pourcentage + ", salaire: " + getSalaire() + "]";
	}
	
	

}
