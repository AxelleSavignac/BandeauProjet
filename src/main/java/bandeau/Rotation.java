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
public class Rotation extends Effet{

   

    public void RotationAnimation() {

        unBandeau.setMessage("WILLY WOLLER 2006");
		for (int i = 0; i <= 20; i++) {
			unBandeau.setRotation(2*Math.PI*i / 10);
			super.pauseEntreEffet();
		}
    }

    @Override
    public void jouer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
