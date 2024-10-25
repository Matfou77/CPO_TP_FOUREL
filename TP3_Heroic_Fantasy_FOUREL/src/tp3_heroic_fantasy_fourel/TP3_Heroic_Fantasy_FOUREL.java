/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_fourel;

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
        Epee duran = new Epee("Durandal",40,70);
        
        Baton chene = new Baton("Chene", 40, 50);
        Baton charme = new Baton("Charme", 50, 60);
        
        Magicien Garc = new Magicien("Gandalf",65,true);
        Magicien Gand = new Magicien("Garcimore",44,false);
        
        Guerrier Lan = new Guerrier( "Lannister", 45, true);
        Guerrier Con = new Guerrier( "Conan", 78,false);
        
        System.out.println("Le Nom de l'epee est " +Exca.getNom()+ ", le niveau d'attaque est de " +Exca.getNVattaque()+", la finesse de l'epee est de " +Exca.getFinesse());
        System.out.println("Le Nom de l'epee est " +duran.getNom()+ ", le niveau d'attaque est de " +duran.getNVattaque()+", la finesse de l'epee est de " +duran.getFinesse());
        System.out.println("Le Nom du baton est " +chene.getNom()+ ", le niveau d'attaque est de " +chene.getNVattaque()+", l'age du baton est de "+chene.getAge());
        System.out.println("Le Nom du baton est " +charme.getNom()+ ", le niveau d'attaque est de " +charme.getNVattaque()+", l'age du baton est de "+charme.getAge());
        ArrayList<String> TabArme = new ArrayList<String>();
        TabArme.add("[" +Exca.getNom()+ ", " +Exca.getNVattaque()+", " +Exca.getFinesse()+ "]");
        TabArme.add("Durandal");
        TabArme.add("Chene");
        TabArme.add("Charme");
        for (int i=0 ;i<TabArme.size();i++) {
            System.out.println("il y a " +TabArme.get(i) +".");
        }
        ArrayList<String> TabPerso = new ArrayList<String>();
        TabPerso.add("Gandalf");
        TabPerso.add("Garcimore");
        TabPerso.add("Lannister");
        TabPerso.add("Conan");
        for (int i=0 ;i<TabPerso.size();i++) {
            System.out.println("il y a " + TabPerso.get(i) +".");
        }
    }
}
