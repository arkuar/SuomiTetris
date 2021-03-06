package tetris.domain;

/**
 * Luokka tarjoaa toiminnallisuuden tetrominopalikoille.
 *
 * @author Arttu
 */
public class Block {

    private Tetrominoes tetromino;
    private int[][] currentCoords;

    /**
     * Luo tyhjän Block -olion.
     */
    public Block() {
        this.tetromino = Tetrominoes.EMPTY;
        this.currentCoords = new int[4][2];
    }

    /**
     * Luo uuden Block -olion joka sisältää tetrominon ja sen nykyiset
     * koordinaatit.
     *
     * @param tetromino Käyttäjän antama tetromino.
     */
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

    /**
     * Asettaa koordinaatit Block -oliolle.
     *
     * @param coordinates Annetut koordinaatit.
     */
    public void setCoordinates(int[][] coordinates) {
        this.currentCoords = coordinates;
    }

    /**
     * Asettaa indeksin x -koordinaatin.
     *
     * @param i indeksinumero.
     * @param x uusi x -koordinaatti.
     */
    public void setX(int i, int x) {
        currentCoords[i][0] = x;
    }

    /**
     * Palauttaa annetun indeksin x -koordinaatin.
     *
     * @param i indeksinumero.
     * @return x -koordinaatti.
     */
    public int getX(int i) {
        return currentCoords[i][0];
    }

    /**
     * Asettaa indeksin y -koordinaatin.
     *
     * @param i indeksinumero
     * @param y uusi y -koordinaatti.
     */
    public void setY(int i, int y) {
        currentCoords[i][1] = y;
    }

    /**
     * Palauttaa indeksin y -koordinaatin.
     *
     * @param i indeksinumero.
     * @return y -koordinaatti.
     */
    public int getY(int i) {
        return currentCoords[i][1];
    }

    /**
     * Kääntää tetrominoa vasemmalle ja tallentaa uudet koordinaatit.
     */
    public void rotateLeft() {
        if (this.tetromino == Tetrominoes.O) {
            return;
        }
        int[][] rotated = new int[4][2];
        int[][] current = getCoordinates();
        for (int i = 0; i < 4; i++) {
            rotated[i][0] = current[i][1];
            rotated[i][1] = -current[i][0];
        }

        setCoordinates(rotated);
    }

    /**
     * Kääntää tetrominoa oikealle ja tallentaa uudet koordinaatit.
     */
    public void rotateRight() {
        if (this.tetromino == Tetrominoes.O) {
            return;
        }
        int[][] rotated = new int[4][2];
        int[][] current = getCoordinates();
        for (int i = 0; i < 4; i++) {
            rotated[i][0] = -current[i][1];
            rotated[i][1] = current[i][0];
        }

        setCoordinates(rotated);
    }
}
