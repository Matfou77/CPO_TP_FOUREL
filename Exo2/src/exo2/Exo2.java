/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

/**
 *
 * @author foure
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Declaration des variables
int nb = 0; // nombre d'entiers a additionner
int result; // resultat
int ind; //indice
nb=5;
result=0;

// Additionner des nb premiers entier
ind=1;
while (ind <= nb)  {
    result=result+ind;
}

// Afficher du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est "+result);
    }
}
    
    
    
 