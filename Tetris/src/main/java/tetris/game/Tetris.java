/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.Parent;
import javax.swing.JLabel;
import tetris.domain.Block;
import tetris.gui.Refreshable;
import tetris.gui.UserInterface;
import tetris.logic.GameBoard;

/**
 * Peliä pyörittävä luokka.
 *
 * @author Arttu
 */
public class Tetris extends GameLoop implements ActionListener {

    private int width;
    private int height;
    private Refreshable refreshable;
    private GameBoard gameboard;
    private Block current;
    public boolean cont;
    public boolean stopped;
    private int score;
    private int nextLevelScore;

    /**
     * Luo pelin annetuilla mitoilla.
     *
     * @param height pelilaudan korkeus.
     * @param width pelilaudan leveys.
     */
    public Tetris(int height, int width) {
        this.width = width;
        this.height = height;
        this.gameboard = new GameBoard(height, width);
        this.current = gameboard.createRandom();
        this.cont = true;
        this.stopped = false;
        this.score = 0;
        this.nextLevelScore = 1000;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getScore() {
        return this.score;
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
        this.score = 0;
        refreshable.refresh();
        this.nextLevelScore = 500;
        resume();
    }

    /**
     * Pysäyttää pelin tai jatkaa sitä riippuen tilasta.
     */
    public void pause() {
        if (!stopped && cont) {
            stopped = true;
            pauseUpdates();
        } else if (stopped && cont) {
            stopped = false;
            resume();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        draw();
    }

    /**
     * Päivittää pelitilanteen.
     */
    @Override
    public void updateGame() {
        if (score >= nextLevelScore) {
            increaseSpeed();
            nextLevelScore *= 2;
        }
        if (!gameboard.moveDown(current)) {
            gameboard.blockStopped(current);
            gameboard.removeLine();
            score += 100 * gameboard.getRemoved();
            setCurrent(gameboard.createRandom());
            if (!gameboard.canMove(getX(), getY() - 1)) {
                this.cont = false;
                pauseUpdates();
            }
        }
    }

    /**
     * Piirtää päivitettävän piirtoalustan uudestaan.
     */
    @Override
    public void draw() {
        refreshable.refresh();
    }

}
