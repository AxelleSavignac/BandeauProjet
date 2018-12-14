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
public class Scenario {

    private ArrayList<Effet> scénarioPub = new ArrayList<Effet>();
    protected static Bandeau unBandeau = new Bandeau();

    //Définition de la fenêtre d'affichage
    Font font = unBandeau.getFont();
    Color back = unBandeau.getBackground();
    Color fore = unBandeau.getForeground();

    public static void main(String[] args) {
        //Création du scénario  
        Scenario s = new Scenario();
        //Création des effets
        Effet zoom = new Zoom(unBandeau);
        Effet rotation = new Rotation(unBandeau);
        Effet couleur = new Couleur(unBandeau);
        Effet clignoter = new Clignoter(unBandeau);
        //Ajout des effets dasn le scénario
        s.AjouterEffet(zoom);
        s.AjouterEffet(rotation);
        s.AjouterEffet(couleur);
        s.AjouterEffet(clignoter);
        // On joue le scénario
        s.jouer();
        

    }
    

    public void AjouterEffet(Effet e) {
        scénarioPub.add(e);
    }

    public void jouer() {
        for (Effet e : scénarioPub) {
            e.playEffet();
        }
    }
}
