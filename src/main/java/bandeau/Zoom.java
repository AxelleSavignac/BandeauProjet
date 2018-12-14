/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author nicov
 */
public class Zoom extends Effet {

    public Zoom(Bandeau unBandeau) {
        super(unBandeau);
    }

    public void playEffet() {

        for (int j = 0; j < 3; j++) {
            unBandeau.setMessage("WILLY WOLLER 2006");
            for (int i = 5; i < 35; i += 5) {
                unBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
                this.pauseEntreEffet(100);
            }
        }
    }

}
