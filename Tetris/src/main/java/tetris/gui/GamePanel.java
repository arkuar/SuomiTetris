package tetris.gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import tetris.domain.Block;
import tetris.logic.GameBoard;

/**
 * Luokka tarjoaa näkymän pelilaudalle.
 *
 * @author Arttu
 */
public class GamePanel extends JPanel implements Refreshable {

    private GameBoard game;
    private Block current;

    /**
     * Luo pelinäkymän annetulle pelilaudalle.
     *
     * @param game Annettu pelilauta.
     */
    public GamePanel(GameBoard game) {
        super();
        this.game = game;
        this.current = game.createRandom();
        setBackground(Color.DARK_GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    private void paintBlock(Graphics g, int x, int y, Color c) {
        g.setColor(c);

    }

    @Override
    public void refresh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
