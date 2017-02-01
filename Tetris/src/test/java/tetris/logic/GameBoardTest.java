/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.logic;

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
        boolean result = b.canMove(-1, 23);
        assertEquals(false, result);
    }

    @Test
    public void movingDownWorks() {
        b.moveDown(c);
        assertEquals(7, b.getY());
    }

    @Test
    public void movingLeftWorks() {
        b.moveLeft(c);
        assertEquals(4, b.getX());
    }

    @Test
    public void movingRightWorks() {
        b.moveRight(c);
        assertEquals(6, b.getX());
    }

    @Test
    public void stoppingWorks() {
        boolean[][] board = b.getBoard();
        b.blockStopped(c);
        assertEquals(true, board[5][9]);
        assertEquals(true, board[5][8]);
        assertEquals(true, board[5][7]);
        assertEquals(true, board[5][6]);
    }
    
    @Test
    public void cantMoveWhenBlocked() {
        b.blockStopped(c);
        boolean result = b.canMove(5, 9);
        assertEquals(false, result);
    }
}
