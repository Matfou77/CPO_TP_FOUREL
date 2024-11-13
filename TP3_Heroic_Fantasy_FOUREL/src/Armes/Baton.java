package Armes;

import Armes.Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author foure
 */
public class Baton extends Arme {
    private int age ;
    public Baton(String nom, int age, int NVattaque) {
        super(nom, NVattaque);
        if (age<100) this.age = age ;
        else this.age = 0 ;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "" + nom + "{" + "age=" + age + " ,NVattaque=" + NVattaque + '}';
    }
    
    
}
