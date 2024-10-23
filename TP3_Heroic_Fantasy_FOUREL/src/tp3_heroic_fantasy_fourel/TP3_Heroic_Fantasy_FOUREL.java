/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_fourel;

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
        
        System.out.println("Le Nom de l'epee est " +Exca.getNom()+ ", le niveau d'attaque est de " +Exca.getNVattaque()+", la finesse de l'epee est de " +Exca.getFinesse());
        System.out.println("Le Nom de l'epee est " +duran.getNom()+ ", le niveau d'attaque est de " +duran.getNVattaque()+", la finesse de l'epee est de " +duran.getFinesse());
        System.out.println("Le Nom du baton est " +chene.getNom()+ ", le niveau d'attaque est de " +chene.getNVattaque()+", l'age du baton est de "+chene.getAge());
        System.out.println("Le Nom du baton est " +charme.getNom()+ ", le niveau d'attaque est de " +charme.getNVattaque()+", l'age du baton est de "+charme.getAge());
    }
}
