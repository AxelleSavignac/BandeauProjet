/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bandeau;

import java.awt.Color;
import java.awt.Font;

public class couleur {
    private final Bandeau bandeauAxelle1 = new Bandeau();
    
    public static void main(String[] args) {
	    new  couleur().essai();
    }
    
    public void essai() {
        Font font = bandeauAxelle1.getFont();
        Color back = bandeauAxelle1.getBackground();
        Color fore = bandeauAxelle1.getForeground();
        
        bandeauAxelle1.setMessage("Epluche patate revolutionnaire");
                bandeauAxelle1.setBackground(Color.BLUE);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setForeground(Color.YELLOW);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setBackground(Color.GREEN);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setForeground(Color.ORANGE);
                bandeauAxelle1.sleep(500);
                bandeauAxelle1.setBackground(Color.cyan);
                bandeauAxelle1.sleep(500);
                bandeauAxelle1.setBackground(Color.BLUE);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setForeground(Color.YELLOW);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setBackground(Color.GREEN);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setForeground(Color.ORANGE);
                bandeauAxelle1.sleep(500);
                bandeauAxelle1.setBackground(Color.cyan);
                bandeauAxelle1.sleep(500);
                bandeauAxelle1.setBackground(Color.BLUE);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setForeground(Color.YELLOW);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setBackground(Color.GREEN);
		bandeauAxelle1.sleep(500);
		bandeauAxelle1.setForeground(Color.ORANGE);
                bandeauAxelle1.sleep(500);
                bandeauAxelle1.setBackground(Color.cyan);
                bandeauAxelle1.sleep(500);
    
   }
}



/*
    
    private final Bandeau bandeauAxelle1 = new Bandeau();
    
    public static void main(String[] args) {
	    new couleur().essai();
    }

    public void essai() {
        Font font = bandeauAxelle1.getFont();
        Color back = bandeauAxelle1.getBackground();
        Color fore = bandeauAxelle1.getForeground();
        
        bandeauAxelle1.setMessage("Epluche patate revolutionnaire");
                bandeauAxelle1.setBackground(Color.BLUE);
		bandeauAxelle1.sleep(1000);
		bandeauAxelle1.setForeground(Color.YELLOW);
		bandeauAxelle1.sleep(1000);
		bandeauAxelle1.setBackground(Color.GREEN);
		bandeauAxelle1.sleep(1000);
		bandeauAxelle1.setForeground(Color.ORANGE);
                bandeauAxelle1.sleep(1000);
                bandeauAxelle1.setBackground(Color.cyan);
                bandeauAxelle1.sleep(1000);

               
               
	
        
        
    }
    
    
}

*/