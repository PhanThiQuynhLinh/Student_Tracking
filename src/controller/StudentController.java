/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author QuynhLinh
 */
public class StudentController {

    private JTable tbStudent;
    private JTextField tfSearch;
    private JButton btExport;
    private JButton btAdd;

    public StudentController(JTable tbStudent, JTextField tfSearch, JButton btExport, JButton btAdd) {
        this.tbStudent = tbStudent;
        this.tfSearch = tfSearch;
        this.btExport = btExport;
        this.btAdd = btAdd;
    }

    public void loadDataTable() {

    }

}
