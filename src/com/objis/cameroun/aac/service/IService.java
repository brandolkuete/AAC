package com.objis.cameroun.aac.service;

import java.util.List;

import com.objis.cameroun.aac.domaine.Agriculteur;

public interface IService {
	
	public void enregistrerAgriculteurService(Agriculteur agriculteur);
	public List<Agriculteur> listeAgriculteursService();
	public void rechercherAgriculteurService(String nom);
	public void nbreAgriculteursService(String domaine);

}
