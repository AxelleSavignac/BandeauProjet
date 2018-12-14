/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class Couleur extends Effet{

    public Couleur(Bandeau unBandeau) {
        super(unBandeau);
    }
    @Override
    public void playEffet() {
        unBandeau.setMessage("Epluche patate révolutionnaire");
        Color c;
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            unBandeau.setBackground( c = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
            unBandeau.setForeground( c = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
            this.pauseEntreEffet(500);     
        }
        unBandeau.setBackground( c = new Color((255),(255),(255)));
    }
}