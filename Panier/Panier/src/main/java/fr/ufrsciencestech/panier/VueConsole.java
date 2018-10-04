/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author profil
 */
import java.util.Observer;
import java.util.Observable;

public class VueConsole implements Observer{ 
    Panier P;
    public VueConsole(Panier p){
        P=p;
    }
    @Override
    public void update(Observable o, Object arg){
        System.out.println("nouvelle contenance "+P.getSize());
    }
}
