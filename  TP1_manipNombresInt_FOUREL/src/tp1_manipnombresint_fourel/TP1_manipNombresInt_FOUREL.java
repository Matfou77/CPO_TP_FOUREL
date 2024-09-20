/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_fourel;

import java.util.Scanner;

/**
 *
 * @author foure
 */
public class TP1_manipNombresInt_FOUREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valeur1;
        int valeur2;
        
        System.out.println("Entrez un entier :");
        Scanner sc1 = new Scanner(System.in);
        valeur1 = sc1.nextInt();
        System.out.println("Entrez un entier :");
        Scanner sc2 = new Scanner(System.in);
        valeur2 = sc2.nextInt();
        
        System.out.println("resultat de la somme " +(valeur1+valeur2));
        System.out.println("resultat de la difference" +(valeur1-valeur2));
        System.out.println("resultat du produit" +(valeur1*valeur2));
        
        System.out.println(valeur1/valeur2);
        System.out.println(valeur1%valeur2);
        
    }
    
}
