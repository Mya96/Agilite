package Exploration;

import java.util.ArrayList;
import java.util.Random;

public class Marin {

	private int grade;
	private int visite;
	private String nom;
	private ArrayList<Ile> iles = new ArrayList<Ile>();

	public Marin(String nom) {
		this.nom = nom;

	}

	public Marin(String nom, int grade) {
		this.nom = nom;
		this.grade = grade;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int visite(int visite, Ile ile) {
		return extracted(visite, ile);
	}

	private int extracted(int visite, Ile ile) {
		this.visite += visite;
		this.addIle(ile);
		return this.visite;
	}

	public void addIle(Ile ile) {

		iles.add(ile);
	}

	public void listIle() {

		for (Ile item : this.iles) {
			System.out.println(item.nameIle());

		}

	}

	public int sizeIle() {

		return iles.size();
	}

	public int totalVisiteIle() {
		int nbVisite = 0;

		for (Ile ile : this.iles) {
			nbVisite = nbVisite + ile.nbVisiteIle();
		}
		return nbVisite;
	}

	public int updateGrade(int nbVisite) {
		int newGrade = 0;
		if (nbVisite > 1) {
			newGrade = this.grade + 1;
		} else {
			newGrade = this.grade;
		}
		return newGrade;
	}

}
