package tetris.logic;

import tetris.domain.Block;

public class GameBoard {
    
    private final int height;
    private final int width;
    private int posX;
    private int posY;
    private boolean[][] board;
    
    public GameBoard(int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new boolean[height][width];
        this.posX = width / 2;
        this.posY = height - 1;
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
    
}
