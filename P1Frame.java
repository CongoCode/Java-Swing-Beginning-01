/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project01;

import javax.swing.JFrame;

/**
 *
 * @author benismunganga
 */
public class P1Frame extends JFrame
{
    
    public P1Frame(String lablText)
    {
         
       //  JFrame fram = new JFrame(lablText);
         P1Panel pPanel = new P1Panel(lablText);
         this.getContentPane().add(pPanel);
         //fram.getContentPane().add(pPanel);
         this.setVisible(true);
         //fram.setVisible(true);
         this.setSize(300, 300);
        // fram.setSize(300, 300);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // fram.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
    }
}
