package fr.razvan.modele;

import java.time.LocalDate;

public abstract class Employe {
	
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String matricule, String nom, String prenom, LocalDate dateNaiss) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaiss;
	}
	
	@Override
	public String toString() {
		return "Employe [matricule: " + matricule + ", nom: " + nom + ", prenom: " + prenom + ", dateNaissance: "
				+ dateNaissance + "]";
	}
	
	public abstract double getSalaire();
}
