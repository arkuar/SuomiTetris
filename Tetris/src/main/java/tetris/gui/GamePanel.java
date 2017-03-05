package tetris.gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import tetris.domain.Block;
import tetris.game.Tetris;

/**
 * Luokka tarjoaa näkymän pelilaudalle.
 *
 * @author Arttu
 */
public class GamePanel extends JPanel implements Refreshable {

    private Tetris game;
    private Block current;
    private int blockSize;
    private JLabel scorebar;

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

    public void setScorebar(JLabel bar) {
        this.scorebar = bar;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int fromTop = this.getHeight() - game.getHeight() * blockSize;
        int[][] board = game.getBoard().getBoard();

        for (int i = 0; i < game.getHeight(); i++) {
            for (int j = 0; j < game.getWidth(); j++) {
                if (board[i][j] == 1) {
                    paintBlock(g, j * blockSize, fromTop + (game.getHeight() - i - 1) * blockSize, new Color(0, 53, 128));
                } else if (board[i][j] == 2) {
                    paintBlock(g, j * blockSize, fromTop + (game.getHeight() - i - 1) * blockSize, Color.WHITE);
                }
            }
        }

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
        if (!game.cont) {
            JOptionPane.showMessageDialog(this, "Game Over \n Your score: " + String.valueOf(game.getScore()));
        }
        try {
            this.scorebar.setText("Score: " + String.valueOf(game.getScore()));
        } catch (Exception e) {
        }

        repaint();
    }

}
