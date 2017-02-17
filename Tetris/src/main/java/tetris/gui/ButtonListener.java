package tetris.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import tetris.domain.Block;
import tetris.game.Tetris;
import tetris.logic.GameBoard;

/**
 * Luokka tarjoaa toiminnallisuuden liikkumiselle.
 *
 * @author Arttu
 */
public class ButtonListener implements KeyListener {

    private GameBoard board;
    private Block block;
    private Tetris game;

    /**
     * Luo uuden ButtonListener -olion.
     *
     * @param board Annettu pelilauta.
     * @param block Annettu Block -olio.
     */
    public ButtonListener(Tetris board, Block block) {
        this.board = board.getBoard();
        this.block = board.getCurrent();
        this.game = board;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        Block c = new Block(block.getTetromino());
        c.setCoordinates(block.getCoordinates());
        
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            c.rotateLeft();
            if (board.canRotate(c)) {
                block.rotateLeft();
            }
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            c.rotateRight();
            if (board.canRotate(c)) {
                block.rotateRight();
            }
        } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            board.moveLeft(block);
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            board.moveRight(block);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
