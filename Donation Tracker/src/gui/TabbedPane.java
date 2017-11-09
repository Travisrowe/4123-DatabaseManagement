/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;


/**
 *
 * @author legen
 */
public class TabbedPane extends JFrame{
     JTabbedPane jTabs = new JTabbedPane();
     
     JPanel firstP = new JPanel();
     JPanel secondP = new JPanel();
     
     JLabel firstL = new JLabel("First tab");
     JLabel secondL = new JLabel("Second tab");
     
     TabbedPane()
     {
         firstP.add(firstL);
         secondP.add(secondL);
         
         jTabs.add("First Tab", firstP);
         jTabs.add("Second Tab", secondP);
         add(jTabs);       
     }
     
     public static void main(String args[])
     {
         TabbedPane tp = new TabbedPane();
         
         tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         tp.setSize(600, 400);
         tp.setVisible(true);
     }
     
}
