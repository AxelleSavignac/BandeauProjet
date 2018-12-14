/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.util.Random;

public class Couleur extends Effet {

    public Couleur(Bandeau unBandeau) {
        super(unBandeau);
    }

     //Définition de la méthode playEffet() pour Zoom
    public void playEffet() {
        //Création d'un élement random
        Random r = new Random();
        //Définition de la couleur du fond en mode random
        unBandeau.setBackground(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        //Définition de la couleur de l'écriture en mode random
        unBandeau.setForeground(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        this.pauseEntreEffet(50);
    }

}
