package com.objis.cameroun.aac.service;

import java.util.List;
import java.util.Scanner;

import com.objis.cameroun.aac.dao.DaoImpl;
import com.objis.cameroun.aac.dao.IDao;
import com.objis.cameroun.aac.domaine.Agriculteur;

public class ServiceImpl implements IService {
	
	private IDao dao;
	
	public ServiceImpl() {
		
		dao=new DaoImpl();
	}

	@Override
	
	public void enregistrerAgriculteurService(Agriculteur agriculteur) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("  Vous allez enregistrer un nouveau agriculteur\n");
		
		// recuperer les informations de l'agriculteur entrées au clavier par l'utilisateur
		
		System.out.println("  Veillez saisir les coordonnees de l'agriculteur\n ");
		System.out.println("  Nom: ");
		agriculteur.setNom(sc.nextLine());
		System.out.println("  Prenom: ");
		agriculteur.setPrenom(sc.nextLine());
		System.out.println("  Domaine: ");
		agriculteur.setDomaine(sc.nextLine());
		System.out.println("  Telephone: ");
		agriculteur.setTelepnone(sc.nextLine());
		System.out.println("  Village: ");
		agriculteur.setVillage(sc.nextLine());
		System.out.println("  Nombre d'annees d'experience: ");
		agriculteur.setExperience(sc.nextInt());
	
		dao.enregistrerAgriculteurDao(agriculteur);
		
		System.out.println("Super!!!!!!!!!! l'agriculteur "+ agriculteur.getNom() +" a ete enregistre avec succes\n");

	}

	@Override
	public List<Agriculteur> listeAgriculteursService() {
		
		return dao.listeAgriculteursDao();
	}

	@Override
	public void rechercherAgriculteurService(String nom) {
		
		dao.rechercherAgriculteurDao(nom);
		
	}

	@Override
	public void nbreAgriculteursService(String domaine) {
		List<Agriculteur> maListe;
		maListe=dao.nbreAgriculteursDao(domaine);
		//return maListe;
		for(Agriculteur agriculteur:maListe) {
			System.out.println(agriculteur);
		}
	}

}
