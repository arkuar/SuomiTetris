/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import tetris.domain.Block;
import tetris.gui.Refreshable;
import tetris.logic.GameBoard;

/**
 * Peliä pyörittävä luokka.
 *
 * @author Arttu
 */
public class Tetris extends Timer implements ActionListener {

    private int width;
    private int height;
    private Refreshable refreshable;
    private GameBoard gameboard;
    private Block current;
    public boolean cont;
    public boolean stopped;

    /**
     * Luo pelin annetuilla mitoilla.
     *
     * @param height pelilaudan korkeus.
     * @param width pelilaudan leveys.
     */
    public Tetris(int height, int width) {
        super(400, null);
        this.width = width;
        this.height = height;
        this.gameboard = new GameBoard(height, width);
        this.current = gameboard.createRandom();
        this.cont = true;
        this.stopped = false;

        super.addActionListener(this);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.gameboard.getX();
    }

    public int getY() {
        return this.gameboard.getY();
    }

    public Block getCurrent() {
        return this.current;
    }

    public void setCurrent(Block block) {
        this.current = block;
    }

    public GameBoard getBoard() {
        return this.gameboard;
    }

    public void setRefreshable(Refreshable r) {
        this.refreshable = r;
    }

    /**
     * Luo uuden pelin.
     */
    public void newGame() {
        this.gameboard.newGame();
        this.current = gameboard.createRandom();
        this.cont = true;
        this.stopped = false;
        refreshable.refresh();
        super.start();
    }

    /**
     * Pysäyttää pelin tai jatkaa sitä riippuen tilasta.
     */
    public void pause() {
        if (!stopped) {
            stopped = true;
            super.stop();
        } else {
            stopped = false;
            super.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!gameboard.moveDown(current)) {
            gameboard.blockStopped(current);
            gameboard.removeLine();
            setCurrent(gameboard.createRandom());
            if (!gameboard.canMove(getX(), getY() - 1)) {
                super.stop();
                this.cont = false;
            }
        }
        refreshable.refresh();
    }

}
