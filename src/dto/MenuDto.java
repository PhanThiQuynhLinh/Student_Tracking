/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import common.MenuEnum;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author QuynhLinh
 */
public class MenuDto {
    private JPanel pnMenu;
    private JLabel lbMenu;
    private MenuEnum nameMenu;

    public MenuDto() {
    }
    
    public void setPnMenu(JPanel pnMenu) {
        this.pnMenu = pnMenu;
    }

    public void setLbMenu(JLabel lbMenu) {
        this.lbMenu = lbMenu;
    }

    public void setNameMenu(MenuEnum nameMenu) {
        this.nameMenu = nameMenu;
    }

    public JPanel getPnMenu() {
        return pnMenu;
    }

    public JLabel getLbMenu() {
        return lbMenu;
    }

    public MenuEnum getNameMenu() {
        return nameMenu;
    }
    
    
    
    
    
         
}
