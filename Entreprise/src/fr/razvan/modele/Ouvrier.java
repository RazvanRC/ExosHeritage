package fr.razvan.modele;

import java.time.LocalDate;

public class Ouvrier extends Employe {
	
	private static final int SMIG = 2500;
	private LocalDate dateEntree;
	private int salaire;
	private int anneeAncien;
	
		
	
	@Override
	public double getSalaire() {		
		if (SMIG + anneeAncien * 100 <= (SMIG * 2)) {
			salaire = SMIG + anneeAncien * 100;
		} else {
			salaire = SMIG * 2;
		}
		return salaire;
	}

	@Override
	public String toString() {
		return "Ouvrier [matricule: " + getMatricule() + ", prenom: " + getPrenom() + ", nom: " + getNom() + ", date naissance: "
				+ getDateNaissance() + ", anneeAncien: " + anneeAncien + ", salaire: " + getSalaire() + "]";
	}
	
	

	public Ouvrier(String nom, String prenom, String matricule, LocalDate dateNaiss, LocalDate dateEntree) {
		super(matricule, nom, prenom, dateNaiss);
		anneeAncien = LocalDate.now().getYear() - dateEntree.getYear();
		this.setDateEntree(dateEntree);
	}

	public LocalDate getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(LocalDate dateEntree) {
		this.dateEntree = dateEntree;
	}
	

}
