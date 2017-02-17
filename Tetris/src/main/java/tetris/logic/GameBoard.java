package tetris.logic;

import java.awt.Color;
import java.util.Random;
import tetris.domain.Block;
import tetris.domain.Tetrominoes;

/**
 * Luokka tarjoaa pelilaudan ja sen metodit.
 *
 * @author Arttu
 */
public class GameBoard {

    private final int height;
    private final int width;
    private int posX;
    private int posY;
    private boolean[][] board;
    private Color blockColor;
    private Color[] availableColors;

    /**
     * Luo uuden pelilaudan annetuilla mitoilla.
     *
     * @param height Pelilaudan korkeus.
     * @param width Pelilaudan leveys.
     */
    public GameBoard(int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new boolean[height][width];
        this.posX = width / 2 + 1;
        this.posY = height - 2;
        this.availableColors = new Color[]{
            new Color(0, 53, 128), Color.WHITE
        };
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public Color getColor() {
        return this.blockColor;
    }

    public boolean[][] getBoard() {
        return this.board;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    /**
     * Tarkistaa voiko annettuihin koordinaatteihin liikkua.
     *
     * @param x Annettu x-koordinaatti.
     * @param y Annettu y-koordinaatti.
     * @return tosi jos liikkuminen mahdollista, false jos ei.
     */
    public boolean canMove(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return false;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == true) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Tarkistaa voiko annettua palikkaa kääntää.
     *
     * @param block Annettu Block -olio.
     * @return tosi jos kääntäminen mahdollista.
     */
    public boolean canRotate(Block block) {
        for (int i = 0; i < 4; i++) {
            int x = posX + block.getX(i);
            int y = posY - block.getY(i);
            if (!canMove(x, y)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Liikuttaa Block -oliota alaspäin pelilaudalla.
     *
     * @param block Block -olio jota halutaan siirtää.
     * @return Palauttaa tosi jos liikkuminen onnistui.
     */
    public boolean moveDown(Block block) {
        for (int i = 0; i < 4; i++) {
            int y = posY - block.getY(i);
            if (!canMove(posX, y - 1)) {
                return false;
            }
        }
        posY--;
        return true;
    }

    /**
     * Liikuttaa Block -oliota vasemmalle pelilaudalla.
     *
     * @param block Block -olio jota halutaan siirtää.
     */
    public void moveLeft(Block block) {
        for (int i = 0; i < 4; i++) {
            int x = posX + block.getX(i);
            if (!canMove(x - 1, posY)) {
                return;
            }
        }
        posX--;
    }

    /**
     * Liikuttaa Block -oliota oikealle pelilaudalla.
     *
     * @param block Block -olio jota halutaan siirtää.
     */
    public void moveRight(Block block) {
        for (int i = 0; i < 4; i++) {
            int x = posX + block.getX(i);
            if (!canMove(x + 1, posY)) {
                return;
            }
        }
        posX++;
    }

    /**
     * Luo satunnaisen Block -olion arpomalla sille tetrominon.
     *
     * @return luotu Block -olio.
     */
    public Block createRandom() {
        Random r = new Random();
        Block created = new Block(Tetrominoes.values()[r.nextInt(7)]);
        this.blockColor = availableColors[r.nextInt(availableColors.length)];
        this.posX = width / 2 + 1;
        this.posY = height - 2;
        return created;
    }

    /**
     * Tallentaa pysähtyneen Block -olion koordinaatit pelilaudalle.
     *
     * @param block Block -olio joka on pysähtynyt.
     */
    public void blockStopped(Block block) {
        for (int i = 0; i < 4; i++) {
            int x = posX + block.getX(i);
            int y = posY - block.getY(i);
            board[y][x] = true;
        }
    }

    private boolean lineIsFull(int i) {
        for (int j = 0; j < width; j++) {
            if (board[i][j] == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Poistaa pelilaudalta täynnä olevat rivit.
     */
    public void removeLine() {
        for (int i = 0; i < height; i++) {
            if (lineIsFull(i)) {
                for (int k = 0; k < width; k++) {
                    board[i][k] = false;
                }
            }
        }
    }
}
