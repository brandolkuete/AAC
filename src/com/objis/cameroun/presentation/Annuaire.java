package com.objis.cameroun.presentation;

import java.util.List;
import java.util.Scanner;
import com.objis.cameroun.aac.domaine.Agriculteur;
import com.objis.cameroun.aac.service.IService;
import com.objis.cameroun.aac.service.ServiceImpl;

public class Annuaire {

	public static void main(String[] args) {
		
		System.out.println("\n");
		
		System.out.println("                    **********************************************************************");
		System.out.println("                    *                  Bienvenue dans l'annuaire des                     *");
		System.out.println("                    *                    Agriculteurs du Cameroun                        *");
		System.out.println("                    *                                                                    *");
		System.out.println("                    **********************************************************************");
		
		// Appel de la couche service
		
			IService service =new ServiceImpl();
		
		char choix=' ';
		
		System.out.println("\n  Voici les operations que vous pouvez effectuer\n");
		
		while(choix != 'q') {
			
			
			System.out.println("    tapez 1 pour enregistrer un nouveau agriculteur dans la base de donnees");
			System.out.println("    tapez 2 pour rechercher un agriculteur");
			System.out.println("    tapez 3 pour afficher la liste des agriculteurs");
			System.out.println("    tapez 4 pour avoir la liste des agriculteurs en fonction du domaine");
			System.out.println("    tapez q si vous voulez quitter");
			
			System.out.println("\n  Faites votre choix: ");
			
			Scanner scan=new Scanner(System.in);
			choix= scan.nextLine().charAt(0);	
		
			if(choix != 'q') // on fait ce test pour que dans le cas où l'utilisateur saisit 'q' au debut, on arrete le programme
			{
		
		
				switch (choix) 
				{
	
				case '1':
				{
					
					// enregistrement de deus agriculteurs
					
					Agriculteur agriculteur= new Agriculteur();
					System.out.println("\n");
					
					service.enregistrerAgriculteurService(agriculteur); // ici on appelle le savoir-faire qui enregistre un agriculteur dans la BD
					System.out.println("\n");
					System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
					Scanner reponse=new Scanner(System.in);
					choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
		
					break;
				}
	
				case '2':
				{
					String nom;
					Scanner sc = new Scanner(System.in);
					System.out.println("  Quel agriculteur souhaitez-vous rechercher? \n");
					System.out.println("  Veillez entrer son nom: ");
					nom=sc.nextLine();
					System.out.println("\n");
					
					service.rechercherAgriculteurService(nom);
					System.out.println("\n");
		
					System.out.println("\n  Voulez-vous continuer?  o=oui ou q=quitter");
					Scanner reponse=new Scanner(System.in);
					choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
					break;
				}
				
				case '3':
				{
		
					// liste de tous les agriculteurs nde la base de données
					
					// declaration d'une collection des agriculteurs
					
					List<Agriculteur> agriculteurs;
					
					//appel de la methode listeAgriculteursService de la couche service
					System.out.println("\n");
					
					agriculteurs= service.listeAgriculteursService();
					
					//affichage de la liste des agriculteurs 
					
					for(Agriculteur agriculteur : agriculteurs)
						{
						
					 System.out.println(agriculteur);	
					}
					
					System.out.println("\n");
					System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
					Scanner reponse=new Scanner(System.in);
					choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
					break;
				}
				
				case '4':
				{
					String domaine;
					Scanner sc = new Scanner(System.in);
					System.out.println("  Dans quel domaine souhaitez-vous avoir la liste des agriculteurs? \n");
					System.out.println("  Veillez entrer le domaine: ");
					domaine=sc.nextLine();
					System.out.println("\n");
					service.nbreAgriculteursService(domaine);
					System.out.println("\n");
					
					System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
					Scanner reponse=new Scanner(System.in);
					choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
					break;
				}
	
				default:
					System.out.println("\n  Vous n'avez pas fait un bon choix \n");
					break;
	
				}

	
			}
		

		}
		System.out.println("\n  Aurevoir!!! ");
		}
	}
		
		
		
		


