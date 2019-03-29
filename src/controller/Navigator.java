/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.MenuEnum;
import dto.MenuDto;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import view.PnHomePage;

/**
 *
 * @author QuynhLinh
 */
public class Navigator {
    private JPanel pnContent;
    private MenuEnum menuEnum;
    private MenuDto menuDto;
    public Navigator(JPanel pnContent) {
        this.pnContent = pnContent;
    }
    
    public void setStart(){
        pnContent.removeAll();
        pnContent.setLayout(new BorderLayout());
        pnContent.add(new PnHomePage());
        pnContent.validate();
    }
    
    
      
}
