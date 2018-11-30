package com.objis.cameroun.aac.domaine;

public class Agriculteur {
	
	private int idAgiculteur;
	private String nom;
	private String prenom;
	private String domaine;
	private String telepnone;
	private String village;
	private int experience;
	
	
	public Agriculteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agriculteur(int idAgiculteur, String nom, String prenom, String domaine, String telepnone, String village,
			int experience) {
		super();
		this.idAgiculteur = idAgiculteur;
		this.nom = nom;
		this.prenom = prenom;
		this.domaine = domaine;
		this.telepnone = telepnone;
		this.village = village;
		this.experience = experience;
	}
// l'id etant auto-increment dans la bd, on genere un constructeur qui ne prend pas l'id
	public Agriculteur(String nom, String prenom, String domaine, String telepnone, String village, int experience) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.domaine = domaine;
		this.telepnone = telepnone;
		this.village = village;
		this.experience = experience;
	}

	public int getIdAgiculteur() {
		return idAgiculteur;
	}

	public void setIdAgiculteur(int idAgiculteur) {
		this.idAgiculteur = idAgiculteur;
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

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getTelepnone() {
		return telepnone;
	}

	public void setTelepnone(String telepnone) {
		this.telepnone = telepnone;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Agriculteur [idAgiculteur=" + idAgiculteur + ", nom=" + nom + ", prenom=" + prenom + ", domaine="
				+ domaine + ", telepnone=" + telepnone + ", village=" + village + ", experience=" + experience + "]";
	}
	
	
	
	
	
	

}
