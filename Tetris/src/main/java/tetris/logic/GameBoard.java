package tetris.logic;

import java.util.Random;
import tetris.domain.Block;
import tetris.domain.Tetrominoes;

public class GameBoard {

    private final int height;
    private final int width;
    private int posX;
    private int posY;
    private boolean[][] board;
    private Random random;

    public GameBoard(int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new boolean[height][width];
        this.posX = width / 2;
        this.posY = height - 2;
        this.random = new Random();
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
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

    public void moveDown(Block block) {
        for (int i = 0; i < 4; i++) {
            int y = posY - block.getY(i);
            if (!canMove(posX, y - 1)) {
                return;
            }
        }
        posY--;
    }

    public void moveLeft(Block block) {
        for (int i = 0; i < 4; i++) {
            int x = posX + block.getX(i);
            if (!canMove(x - 1, posY)) {
                return;
            }
        }
        posX--;
    }

    public void moveRight(Block block) {
        for (int i = 0; i < 4; i++) {
            int x = posX + block.getX(i);
            if (!canMove(x + 1, posY)) {
                return;
            }
        }
        posX++;
    }

    public Block createRandom() {
        int i = random.nextInt(7);
        Block created = new Block(Tetrominoes.values()[i]);
        return created;
    }
    
    public void blockStopped(Block block) {
        for (int i = 0; i < 4; i++) {
            int x = posX + block.getX(i);
            int y = posY - block.getY(i);
            board[x][y] = true;
        }
    }
}
