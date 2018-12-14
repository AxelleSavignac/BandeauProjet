/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

public class Clignoter extends Effet{
    
    private final Bandeau bandeauAxelle2 = new Bandeau();
    
    

 

 
    public void essai2() {
        Font font = bandeauAxelle2.getFont();
        Color back = bandeauAxelle2.getBackground();
        Color fore = bandeauAxelle2.getForeground();
        
        for (int i = 0; i <20; i++) {
            bandeauAxelle2.setMessage("Epluche patate revolutionnaire");
            bandeauAxelle2.sleep(100);
            bandeauAxelle2.setMessage(""); 
            bandeauAxelle2.sleep(100);
        }
            
    }

    @Override
    public void jouer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
        
        
        
        
        
