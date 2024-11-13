/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_fourel;
import Personnage.Magicien;
import Personnage.Personnage;
import Personnage.Guerrier;
import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author foure
 */
public class TP3_Heroic_Fantasy_FOUREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee Exca = new Epee("Excalibur",70,50);
        Epee Duran = new Epee("Durandal",40,70);
        Epee MS = new Epee("MasterSword",30,90);
        
        Baton Chene = new Baton("Chene", 40, 50);
        Baton Charme = new Baton("Charme", 50, 60);
        Baton Branche = new Baton("Branche",99,20);
        
        Magicien Gand = new Magicien("Gandalf",65,true);
        Magicien Garc = new Magicien("Garcimore",44,false);
        
        Guerrier Lan = new Guerrier( "Lannister", 45, true);
        Guerrier Con = new Guerrier( "Conan", 78,false);
        
        ArrayList<Arme> TabArme = new ArrayList<Arme>();
        TabArme.add(Exca);
        TabArme.add(Duran);
        TabArme.add(Chene);
        TabArme.add(Charme);
        TabArme.add(MS);
        TabArme.add(Branche);
            System.out.println(TabArme);
            System.out.println(TabArme.size());
        ArrayList<Personnage> TabPersonnage = new ArrayList<Personnage>();
        TabPersonnage.add(Gand);
        TabPersonnage.add(Garc);
        TabPersonnage.add(Lan);
        TabPersonnage.add(Con);
            System.out.println(TabPersonnage);
            System.out.println(TabPersonnage.size());
            
        Lan.ajouter_Arme(Exca);
        Lan.ajouter_Arme(Branche);
        Lan.ajouter_Arme(Duran);
        Lan.Equiper_Arme(0);
        Garc.ajouter_Arme(Branche);
        Garc.ajouter_Arme(Chene);
        Garc.ajouter_Arme(MS);
        
        System.out.println(Lan);
        
        Lan.close();
        Lan=null;
        Garc.close();
        Garc=null;
        System.gc();
        System.out.println("ils y a " + Personnage.nbr_Combattants + " Combattants dans le jeu");
        System.out.println("ils y a " + Guerrier.nbr_Guerrier + " Guerriers dans le jeu");
        System.out.println("ils y a " + Magicien.nbr_Magicien + " Magiciens dans le jeu");
        
        }
    }
