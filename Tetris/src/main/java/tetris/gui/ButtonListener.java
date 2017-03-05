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
     */
    public ButtonListener(Tetris board) {
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

        if (ke.getKeyChar() == 'p') {
            game.pause();
        }

        if (game.stopped) {
            return;
        }

        switch (ke.getKeyCode()) {
            case KeyEvent.VK_UP:
                c.rotateLeft();
                if (board.canRotate(c)) {
                    block.rotateLeft();
                }
                break;
            case KeyEvent.VK_DOWN:
                c.rotateRight();
                if (board.canRotate(c)) {
                    block.rotateRight();
                }
                break;
            case KeyEvent.VK_LEFT:
                board.moveLeft(block);
                break;
            case KeyEvent.VK_RIGHT:
                board.moveRight(block);
                break;
            case KeyEvent.VK_SPACE:
                board.moveDown(block);
                break;
            default:
                break;
        }
        block = game.getCurrent();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
