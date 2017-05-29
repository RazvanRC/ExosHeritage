package fr.razvan.modele;

import java.time.LocalDate;

public class Cadre extends Employe {

	public Cadre() {
		// TODO Auto-generated constructor stub
	}
	
	private int indice;
	private int salaire;

	@Override
	public double getSalaire() {
		switch (indice) {
		case 1:
			salaire = 13000;
			break;
		case 2:
			salaire = 15000;
			break;
		case 3:
			salaire = 17000;
			break;
		case 4:
			salaire = 20000;
			break;
	
		default:
			break;
		}
		return salaire;
	}

	public Cadre(String nom, String prenom, String matricule, LocalDate dateNaiss, int indice) {
		super(matricule, nom, prenom, dateNaiss);
		this.indice = indice;
	}

	@Override
	public String toString() {
		return "Cadre [matricule: " + getMatricule() + ", prenom: " + getPrenom() + ", nom: " + getNom() + ", date naissance: " + getDateNaissance() + ", indice: " + indice + ", salaire: " + getSalaire() + "]";
	}

	
	
}
