/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import common.MenuEnum;
import java.util.Objects;
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

    public MenuDto(MenuEnum nameMenu, JPanel pnMenu, JLabel lbMenu) {
        this.pnMenu = pnMenu;
        this.lbMenu = lbMenu;
        this.nameMenu = nameMenu;
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

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(!(o instanceof MenuDto)){
            return false;
        }
        MenuDto dto = (MenuDto)o;
        return dto.getNameMenu() == this.getNameMenu();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameMenu);
    }
    
    
    
    
    
    
         
}
