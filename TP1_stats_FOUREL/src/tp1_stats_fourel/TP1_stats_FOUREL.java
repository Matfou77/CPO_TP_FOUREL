/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_fourel;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author foure
 */
public class TP1_stats_FOUREL {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int [] tabEntiers = new int[6];
        int m ;
        Random random = new Random();
        
        System.out.println("Saisissez une valeur :");
        try (Scanner sc = new Scanner(System.in)) {
            m = sc.nextInt();
            
            for (int i = 0; i < m; i++) {
                // Générer un nombre aléatoire entre 0 et 5
                int randomNumber = random.nextInt(6);    
                
                tabEntiers[randomNumber]++;
            }
            // Boucle pour afficher la valeur de chaque cellule
            for (int i = 0 ; i < tabEntiers.length ; i++) {
                double pourcentage = (double) tabEntiers[i] /m*100; 
                System.out.println("Cellule " + i + " : " + pourcentage +" %");
            }
        }
        
    }
}
