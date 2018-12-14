/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

public class Clignoter extends Effet {

    public Clignoter(Bandeau unBandeau) {
        super(unBandeau);
    }

    public void playEffet() {
        unBandeau.setMessage("Offre spéciale !!");
        this.pauseEntreEffet(2000);
        unBandeau.setMessage("Pour 1 WILLY WALLER 2006 Acheté !");
        this.pauseEntreEffet(2000);
        unBandeau.setMessage("C'est pas 1...");
        this.pauseEntreEffet(2000);
        unBandeau.setMessage("Pas 2...");
        this.pauseEntreEffet(2000);
        unBandeau.setMessage("Pas 3...");
        this.pauseEntreEffet(2000);
        unBandeau.setMessage("Mais !!!");
        this.pauseEntreEffet(2000);
        for (int i = 0; i < 20; i++) {
            unBandeau.setMessage("14 WILLY WALLER 2006 offerts");
            this.pauseEntreEffet(150);
            unBandeau.setMessage("");
            this.pauseEntreEffet(150);

        }
        unBandeau.setMessage("Pour seulement 99.99euros !!!");
        
    }
}
