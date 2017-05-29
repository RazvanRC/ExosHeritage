package fr.razvan.app;

import java.time.LocalDate;

import fr.razvan.modele.Cadre;
import fr.razvan.modele.Ouvrier;
import fr.razvan.modele.Patron;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employe employe1 = new Employe(1, "Gabin", "Jean", dateNai);		
		Ouvrier ouvrier1 = new Ouvrier("Gabin", "Jean", "2", LocalDate.of(1970, 07, 11), LocalDate.of(2000, 01, 11));
		System.out.println(ouvrier1);

		Cadre cadre1 = new Cadre("Belmondo", "Jean Paul", "3", LocalDate.of(1965, 07, 11), 3);
		System.out.println(cadre1);
		
		Patron patron1 = new Patron("Delon", "Alain", "1", LocalDate.of(1960, 07, 11), 540234, 13.55);
		System.out.println(patron1);		
		
	}

}
