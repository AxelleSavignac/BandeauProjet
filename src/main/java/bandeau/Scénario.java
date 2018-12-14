/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author nicov
 */
public class Scénario {
     private ArrayList<Effet> scénarioPub = new ArrayList<Effet>();
 
     
     
    
    public void AjouterEffet(Effet e){
       
        scénarioPub.add(e);
        
    }
    
    public void playOn() {
        for (Effet e : scénarioPub) {
            e.jouer();
        }
        
        
    }
    
  
        
        
    
}
