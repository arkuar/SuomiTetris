package tetris.domain;

public class Block {

    private Tetrominoes tetromino;
    private int[][] currentCoords;

    public Block() {
        this.tetromino = Tetrominoes.EMPTY;
        this.currentCoords = new int[4][2];
    }

    public Block(Tetrominoes tetromino) {
        this.tetromino = tetromino;
        currentCoords = tetromino.getCoords();
    }

    public Tetrominoes getTetromino() {
        return this.tetromino;
    }

    public int[][] getCoordinates() {
        return this.currentCoords;
    }
    
    public void setX(int i, int x) {
        currentCoords[i][0] = x;
    }

    public int getX(int i) {
        return currentCoords[i][0];
    }

    public void setY(int i, int y) {
        currentCoords[i][1] = y;
    }

    public int getY(int i) {
        return currentCoords[i][1];
    }

    public void rotateLeft() {
        if (tetromino == Tetrominoes.O) {
            return;
        }
        Block rotated = new Block();
        rotated.tetromino = tetromino;
        for (int i = 0; i < 4; i++) {
            rotated.setX(i, currentCoords[i][1]);
            rotated.setY(i, -currentCoords[i][0]);
        }
        currentCoords = rotated.currentCoords;
    }

    public void rotateRight() {
        if (tetromino == Tetrominoes.O) {
            return;
        }
        Block rotated = new Block();
        rotated.tetromino = tetromino;
        for (int i = 0; i < 4; i++) {
            rotated.setX(i, -currentCoords[i][1]);
            rotated.setY(i, currentCoords[i][0]);
        }
        currentCoords = rotated.currentCoords;
    }

}
