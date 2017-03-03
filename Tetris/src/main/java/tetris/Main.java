package tetris;

import javax.swing.SwingUtilities;
import tetris.*;
import tetris.domain.Block;
import tetris.domain.Tetrominoes;
import tetris.game.Tetris;
import tetris.gui.UserInterface;
import tetris.logic.GameBoard;

public class Main {

    /**
     * Käynnistää ohjelman.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tetris game = new Tetris(22, 10);
        UserInterface ui = new UserInterface(game, 22);
        SwingUtilities.invokeLater(ui);

        while (ui.getRefreshable() == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Gameboard not drawn yet.");
            }
        }

        game.setRefreshable(ui.getRefreshable());
        game.run();
    }

}
