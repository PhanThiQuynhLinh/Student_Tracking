/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.MenuEnum;
import dto.MenuDto;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.ColorUtils;
import view.PnClass;
import view.PnCourse;
import view.PnHomePage;
import view.PnStatistical;
import view.PnStudent;

/**
 *
 * @author QuynhLinh
 */
public class Navigator {

    private final JPanel pnMainView;
    private List<MenuDto> menus;
    private MenuEnum menuEnum;
    private MenuDto menuDto;
    private MenuEnum pressMenu;

    public Navigator(JPanel pnMainView) {
        this.pnMainView = pnMainView;
    }

    public void setStart(JPanel startPage) {
        pressMenu = menuEnum.HOME_PAGE;
        pnMainView.removeAll();
        pnMainView.setLayout(new BorderLayout());
        pnMainView.add(new PnHomePage());
        pnMainView.validate();
    }

    public void setEvent(List<MenuDto> menus) {
        this.menus = menus;
        menus.forEach(menu -> {
            menu.getLbMenu().addMouseListener(new LabelMenuEvent(menu));
        });
    }

    class LabelMenuEvent extends MouseAdapter {

        private JPanel selectedPanel;
        private final MenuEnum curMenuName;
        private final JPanel curPanel;
        private final JLabel curLabel;

        public LabelMenuEvent(MenuDto menu) {
            this.curMenuName = menu.getNameMenu();
            this.curPanel = menu.getPnMenu();
            this.curLabel = menu.getLbMenu();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            curPanel.setBackground(ColorUtils.hoverMenuPanel);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (pressMenu != curMenuName) {
                curPanel.setBackground(ColorUtils.normalMenuPanel);

            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            pressMenu = curMenuName;
            for (MenuDto menuDto : menus) {
                menuDto.getPnMenu().setBackground(ColorUtils.normalMenuPanel);
            }

            curPanel.setBackground(ColorUtils.hoverMenuPanel);

            switch (curMenuName) {
                case HOME_PAGE:
                    selectedPanel = new PnHomePage();
                    break;
                case COURSE_MANAGER:
                    selectedPanel = new PnCourse();
                    break;
                case CLASS_MANAGER:
                    selectedPanel = new PnClass();
                    break;
                case STATISTICAL_MANAGER:
                    selectedPanel = new PnStatistical();
                    break;
                case STUDENT_MANAGER:
                    selectedPanel = new PnStudent();
                    break;
            }

            pnMainView.removeAll();
            pnMainView.setLayout(new BorderLayout());
            pnMainView.add(selectedPanel);
            pnMainView.validate();
            pnMainView.repaint();
        }

    }

}
