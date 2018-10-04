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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controller implements ActionListener{
    Panier P;
    public Controller(Panier p){
        P=p;
    }
    public void actionPerformed(ActionEvent e){
        String n=((JButton)e.getSource()).getName();
        if(n.equals("moins"))
            P.removeLastOrange();
        else if(n.equals("plus"))
            P.addOrange(new Orange(Math.random()+0.5,"France"));
        
    }
}
