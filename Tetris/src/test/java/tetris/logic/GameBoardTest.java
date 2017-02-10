/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.logic;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.domain.Block;
import tetris.domain.Tetrominoes;

/**
 *
 * @author Arttu
 */
public class GameBoardTest {

    GameBoard b;
    Block c;

    public GameBoardTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        b = new GameBoard(10, 10);
        c = new Block(Tetrominoes.I);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void creatingBoardWorks() {
        assertEquals(10, b.getHeight());
        assertEquals(10, b.getWidth());
        assertEquals(5, b.getX());
        assertEquals(8, b.getY());
    }

    @Test
    public void movingWorks() {
        boolean result = b.canMove(4, 5);
        assertEquals(true, result);
    }

    @Test
    public void movingWorks2() {
        boolean result = b.canMove(10, 5);
        assertEquals(false, result);
    }

    @Test
    public void movingWorks3() {
        boolean result = b.canMove(5, 10);
        assertEquals(false, result);
    }

    @Test
    public void movingToZero() {
        boolean result = b.canMove(0, 0);
        assertEquals(true, result);
    }

    @Test
    public void movingDownWorks() {
        b.moveDown(c);
        assertEquals(7, b.getY());
    }

    @Test
    public void movingDownWorks2() {
        b.moveDown(c);
        b.moveDown(c);
        b.moveDown(c);
        b.moveDown(c);
        b.moveDown(c);
        b.moveDown(c);
        b.moveDown(c);
        assertEquals(2, b.getY());
    }

    @Test
    public void movingLeftWorks() {
        b.moveLeft(c);
        assertEquals(4, b.getX());
    }

    @Test
    public void movingLeftWorks2() {
        b.moveLeft(c);
        b.moveLeft(c);
        b.moveLeft(c);
        b.moveLeft(c);
        b.moveLeft(c);
        assertEquals(0, b.getX());
    }

    @Test
    public void movingLeftWorksWithDifferentBlock() {
        Block a = new Block(Tetrominoes.O);
        for (int i = 0; i < 5; i++) {
            b.moveLeft(a);
        }
        assertEquals(0, b.getX());
    }

    @Test
    public void movingLeftNotNegative() {
        for (int i = 0; i < 7; i++) {
            b.moveLeft(c);
        }
        assertEquals(0, b.getX());
    }

    @Test
    public void movingRightWorks() {
        b.moveRight(c);
        assertEquals(6, b.getX());
    }

    @Test
    public void movingRightWorks2() {
        b.moveRight(c);
        b.moveRight(c);
        b.moveRight(c);
        b.moveRight(c);
        b.moveRight(c);
        assertEquals(9, b.getX());
    }

    @Test
    public void movingRightWorksWithDifferentBlock() {
        Block a = new Block(Tetrominoes.O);
        for (int i = 0; i < 5; i++) {
            b.moveRight(a);
        }
        assertEquals(8, b.getX());
    }

    @Test
    public void randomCreateWorks() {
        Block e = b.createRandom();
        assertNotEquals(e, Tetrominoes.EMPTY);
        assertEquals(5, b.getX());
        assertEquals(8, b.getY());
        assertEquals(e.getClass(), c.getClass());
    }

    @Test
    public void stoppingWorks() {
        boolean[][] board = b.getBoard();
        b.blockStopped(c);
        assertEquals(true, board[9][5]);
        assertEquals(true, board[8][5]);
        assertEquals(true, board[7][5]);
        assertEquals(true, board[6][5]);
    }

    @Test
    public void cantMoveWhenBlocked() {
        b.blockStopped(c);
        boolean result = b.canMove(5, 9);
        assertEquals(false, result);
    }

    @Test
    public void removeFullLine() {
        for (int i = 0; i < 10; i++) {
            b.getBoard()[0][i] = true;
        }

        b.removeLine();
        for (int i = 0; i < 10; i++) {
            assertEquals(b.getBoard()[0][i], false);
        }
    }

    @Test
    public void lineFullCheck() {
        b.removeLine();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals(false, b.getBoard()[i][j]);
            }
        }
    }
    
    @Test
    public void colorIsSet() {
        b.createRandom();
        assertNotNull(b.getColor());
    }
}
