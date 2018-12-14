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

    @Override
    public void playEffet() {
        Color c;
        Random r = new Random();
        unBandeau.setBackground(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        unBandeau.setForeground(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        this.pauseEntreEffet(50);
    }

}
