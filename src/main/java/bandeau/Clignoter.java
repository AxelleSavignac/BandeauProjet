/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

public class Clignoter extends Effet {

    public Clignoter(Bandeau unBandeau) {
        super(unBandeau);
    }

    @Override
    public void playEffet() {
        for (int i = 0; i < 20; i++) {
            unBandeau.setMessage("Pour 1 acheté, c'est pas 1, pas 2, pas 3 ... Mais 14 WILLY WALLER 2006 offerts");
            this.pauseEntreEffet(100);
            unBandeau.setMessage("");
            this.pauseEntreEffet(100);
        }
    }
}
