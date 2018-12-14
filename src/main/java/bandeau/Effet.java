/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
/*
 *
 * @author nicov
 */

public abstract class Effet {

    
    protected final Bandeau unBandeau ;

    public Effet(Bandeau unBandeau){
        this.unBandeau = unBandeau;
    }

    //Methode du sleep
    public void pauseEntreEffet(int i) {
        unBandeau.sleep(i);
    }

    public abstract void playEffet();

}

    
   
   

