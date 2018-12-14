/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author nicov
 */
public class Rotation extends Effet {


    public Rotation(Bandeau unBandeau) {
        super(unBandeau);
    }

   



   
    public void playEffet() {
        unBandeau.setMessage("WILLY WOLLER 2006");
        for (int i = 0; i <= 20; i++) {
            unBandeau.setRotation(2 * Math.PI * i / 10);
            this.pauseEntreEffet(100);
        }
    }
    
}
