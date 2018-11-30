package com.objis.cameroun.aac.dao;

import java.util.List;

import com.objis.cameroun.aac.domaine.Agriculteur;

public interface IDao {
	
	public void enregistrerAgriculteurDao(Agriculteur agriculteur);
	public List<Agriculteur> listeAgriculteursDao();
	public void rechercherAgriculteurDao(String nom);
	public List<Agriculteur> nbreAgriculteursDao(String domaine);
}
