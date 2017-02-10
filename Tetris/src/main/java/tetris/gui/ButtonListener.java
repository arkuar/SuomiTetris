package tetris.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import tetris.domain.Block;
import tetris.logic.GameBoard;

public class ButtonListener implements KeyListener {

    private GameBoard board;
    private Block block;

    public ButtonListener(GameBoard board, Block block) {
        this.board = board;
        this.block = block;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            block.rotateLeft();
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            block.rotateRight();
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
