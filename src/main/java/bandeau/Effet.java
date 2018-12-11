/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author nicov
 */
public class Effet{
    
    
    protected final Bandeau unBandeau = new Bandeau();
    
    //Définition de la fenêtre d'affichage
    Font font = unBandeau.getFont();
    Color back = unBandeau.getBackground();
    Color fore = unBandeau.getForeground();
    //Methode du sleep
    public void pauseEntreEffet(){
        unBandeau.sleep(100);
    }
   
}
