package tetris;

import javax.swing.SwingUtilities;
import tetris.logic.GameBoard;
import tetris.domain.*;
import tetris.game.Tetris;
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
        Tetris game = new Tetris(22, 10);
        UserInterface ui = new UserInterface(game, 22);
        SwingUtilities.invokeLater(ui);
        
        while(ui.getRefreshable() == null) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Gameboard not drawn yet.");
            }
        }
        
        game.setRefreshable(ui.getRefreshable());
        game.start();
    }

}
