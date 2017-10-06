/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project01;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author benismunganga
 */
public class P1Panel extends JPanel
{
    public P1Panel(String lablText)
    {
         //JPanel panl = new JPanel();
         JLabel labl = new JLabel(lablText);
         //panl.add(labl);
         this.add(labl);
         //add(panl);
         
    }    
}
