package com.objis.cameroun.aac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.objis.cameroun.aac.domaine.Agriculteur;


public class DaoImpl implements IDao {

	@Override
	public void enregistrerAgriculteurDao(Agriculteur agriculteur) {
		
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet  statement et preparation de la requete
			

			String sql = "insert into `agriculteur`(`nom`,`prenom`,`domaine`,`telephone`,`village`,`experience`)" 
					+"values (?,?,?,?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			
			ps.setString(1, agriculteur.getNom());
			ps.setString(2, agriculteur.getPrenom());
			ps.setString(3, agriculteur.getDomaine());
			ps.setString(4, agriculteur.getTelepnone());
			ps.setString(5, agriculteur.getVillage());
			ps.setInt(6, agriculteur.getExperience());
			
		
			// Etape 3 : exécution requête
			ps.executeUpdate();
			
			
			
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

	@Override
	public List<Agriculteur> listeAgriculteursDao() {
		
		//création d'une collection des agriculteurs
				List<Agriculteur> maListAgriculteurs= new ArrayList<Agriculteur>();
			
				try {

					// Etape 1 : récupération de la connexion
					Connection cn = ConnectionMYSQL.getInstance();

					// Etape 2 : préparation requête
					
					String sql = "SELECT * FROM agriculteur ";
					
					Statement st = cn.createStatement();
					
					// Etape 3 : exécution requête
					ResultSet rs = st.executeQuery(sql); // ResultSet recupere les elements ligne par ligne 

					// Etape 4 :parcours Resultset (optionnel)
					while (rs.next()) {
						//recuperation des valeurs d'une ligne de la table agriculteur, pour initialiser dans un objet agriculteur
						Agriculteur agriculteur =  new Agriculteur();
						agriculteur.setIdAgiculteur(rs.getInt("idAgriculteur"));
						agriculteur.setNom(rs.getString("nom"));
						agriculteur.setPrenom(rs.getString("prenom"));
						agriculteur.setDomaine(rs.getString("domaine"));
						agriculteur.setTelepnone(rs.getString("telephone"));
						agriculteur.setVillage(rs.getString("village"));
						agriculteur.setExperience(rs.getInt("experience"));
						
						//ajout de l'agriculteur dans List maListAgriculteurs
						maListAgriculteurs.add(agriculteur); // cette instruction permet d'inserrer l'objet agriculteur dans malistAgriculteurs
						
					}
					
					// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
				} catch (SQLException e) {
					e.printStackTrace();
					
				} 
				
				return maListAgriculteurs;
	}

	@Override
	public void rechercherAgriculteurDao(String nom) {
		
		//création d'une collection des agriculteurs
		List<Agriculteur> maListAgriculteurs= new ArrayList<Agriculteur>();
		
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			
			String sql = "SELECT *FROM agriculteur WHERE nom='"+nom+"'";
			
			Statement st = cn.createStatement();
			
			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql); // ResultSet recupere les elements ligne par ligne 
			
			while (rs.next()) {
				Agriculteur agriculteur =  new Agriculteur();
				
					agriculteur.setIdAgiculteur(rs.getInt("idAgriculteur"));
					agriculteur.setNom(rs.getString("nom"));
					agriculteur.setPrenom(rs.getString("prenom"));
					agriculteur.setDomaine(rs.getString("domaine"));
					agriculteur.setTelepnone(rs.getString("telephone"));
					agriculteur.setVillage(rs.getString("village"));
					agriculteur.setExperience(rs.getInt("experience"));
					
					//ajout de l'agriculteur  ayant ce nom dans la liste maListAgriculteurs
					maListAgriculteurs.add(agriculteur);	
			}
			
		}
		// Etape 5 : gestion des exceptions et liberation 'automatique' des ressources
		catch (SQLException e) {
		e.printStackTrace();
		
		}
		
		if(maListAgriculteurs.isEmpty()==true) {
			System.out.println("Aucun agricuteur de ce nom, desole");
		}
		else {
			for(Agriculteur agriculteur:maListAgriculteurs) {
				System.out.println(agriculteur);    //plusieurs agriculteurs peuvent avoir le meme nom
			}
		}
	}

	@Override
	public List<Agriculteur> nbreAgriculteursDao(String domaine) {
		
		List<Agriculteur> maListAgriculteurs= new ArrayList<Agriculteur>();
		
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			
			String sql = "SELECT *FROM agriculteur WHERE domaine='"+domaine+"'";
			
			Statement st = cn.createStatement();
			
			
			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql); // ResultSet recupere les elements ligne par ligne 
			
			while (rs.next()) {
				Agriculteur agriculteur =  new Agriculteur();
				
					agriculteur.setIdAgiculteur(rs.getInt("idAgriculteur"));
					agriculteur.setNom(rs.getString("nom"));
					agriculteur.setPrenom(rs.getString("prenom"));
					agriculteur.setDomaine(rs.getString("domaine"));
					agriculteur.setTelepnone(rs.getString("telephone"));
					agriculteur.setVillage(rs.getString("village"));
					agriculteur.setExperience(rs.getInt("experience"));
					
					//ajout de l'agriculteur  ayant ce nom dans la liste maListAgriculteurs
					maListAgriculteurs.add(agriculteur);	
			}
			
		}
		// Etape 5 : gestion des exceptions et liberation 'automatique' des ressources
		catch (SQLException e) {
		e.printStackTrace();
		
		}
		
		if(maListAgriculteurs.isEmpty()==true) {
			System.out.println("Aucun agriculteur de ce domaine, desole");
		}
		
			return maListAgriculteurs;
	}
	
	

}
