package tetris;

import javax.swing.SwingUtilities;
import tetris.logic.GameBoard;
import tetris.domain.*;
import tetris.gui.UserInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arttu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameBoard b = new GameBoard(22, 10);
        UserInterface ui = new UserInterface(b);
        SwingUtilities.invokeLater(ui);
    }

}
