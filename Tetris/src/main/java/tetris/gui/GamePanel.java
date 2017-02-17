package tetris.gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import tetris.domain.Block;
import tetris.game.Tetris;
import tetris.logic.GameBoard;

/**
 * Luokka tarjoaa näkymän pelilaudalle.
 *
 * @author Arttu
 */
public class GamePanel extends JPanel implements Refreshable {

    private Tetris game;
    private Block current;
    private int blockSize;

    /**
     * Luo pelinäkymän annetulle pelilaudalle.
     *
     * @param game Annettu pelilauta.
     * @param blockSize Palikan koko.
     */
    public GamePanel(Tetris game, int blockSize) {
        super();
        this.game = game;
        this.blockSize = blockSize;
        this.current = null;
        setBackground(Color.DARK_GRAY);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int fromTop = this.getHeight() - game.getHeight() * blockSize;
        this.current = game.getCurrent();
        for (int i = 0; i < 4; i++) {
            int x = game.getX() + current.getX(i);
            int y = game.getY() - current.getY(i);
            paintBlock(g, x * blockSize, fromTop + (game.getHeight() - y - 1) * blockSize, game.getBoard().getColor());
        }
    }

    private void paintBlock(Graphics g, int x, int y, Color c) {
        g.setColor(c);
        g.fill3DRect(x, y, blockSize, blockSize, true);
    }

    @Override
    public void refresh() {
        repaint();
    }
    
}
