/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arttu
 */
public class BlockLeftRotationTest {

    public BlockLeftRotationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
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
    public void rotateItoLeftOnce() {
        Block i = new Block(Tetrominoes.I);
        i.rotateLeft();
        int[][] coordinates = i.getCoordinates();
        assertEquals(-1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(2, coordinates[3][0]);
        assertEquals(0, coordinates[3][1]);
    }

    @Test
    public void rotateItoLeftMultipleTimes() {
        Block i = new Block(Tetrominoes.I);
        i.rotateLeft();
        i.rotateLeft();
        int[][] coordinates = i.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(-1, coordinates[2][1]);
        assertEquals(0, coordinates[3][0]);
        assertEquals(-2, coordinates[3][1]);
    }

    @Test
    public void rotateItoLeftFull() {
        Block i = new Block(Tetrominoes.I);
        i.rotateLeft();
        i.rotateLeft();
        i.rotateLeft();
        i.rotateLeft();
        int[][] coordinates = i.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(-1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(1, coordinates[2][1]);
        assertEquals(0, coordinates[3][0]);
        assertEquals(2, coordinates[3][1]);
    }

    @Test
    public void rotateTtoLeftOnce() {
        Block t = new Block(Tetrominoes.T);
        t.rotateLeft();
        int[][] coordinates = t.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(0, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateTtoLeftMultipleTimes() {
        Block t = new Block(Tetrominoes.T);
        t.rotateLeft();
        t.rotateLeft();
        int[][] coordinates = t.getCoordinates();
        assertEquals(1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(-1, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(0, coordinates[3][1]);
    }

    @Test
    public void rotateTtoLeftFull() {
        Block t = new Block(Tetrominoes.T);
        t.rotateLeft();
        t.rotateLeft();
        t.rotateLeft();
        t.rotateLeft();
        int[][] coordinates = t.getCoordinates();
        assertEquals(-1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(1, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(0, coordinates[3][1]);
    }

    @Test
    public void rotateJtoLeftOnce() {
        Block j = new Block(Tetrominoes.J);
        j.rotateLeft();
        int[][] coordinates = j.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(-1, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateJtoLeftMultipleTimes() {
        Block j = new Block(Tetrominoes.J);
        j.rotateLeft();
        j.rotateLeft();
        int[][] coordinates = j.getCoordinates();
        assertEquals(1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(-1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateJtoLeftFull() {
        Block j = new Block(Tetrominoes.J);
        j.rotateLeft();
        j.rotateLeft();
        j.rotateLeft();
        j.rotateLeft();
        int[][] coordinates = j.getCoordinates();
        assertEquals(-1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateLtoLeftOnce() {
        Block l = new Block(Tetrominoes.L);
        l.rotateLeft();
        int[][] coordinates = l.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(-1, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateLtoLeftMultipleTimes() {
        Block l = new Block(Tetrominoes.L);
        l.rotateLeft();
        l.rotateLeft();
        int[][] coordinates = l.getCoordinates();
        assertEquals(1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(-1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateLtoLeftFull() {
        Block l = new Block(Tetrominoes.L);
        l.rotateLeft();
        l.rotateLeft();
        l.rotateLeft();
        l.rotateLeft();
        int[][] coordinates = l.getCoordinates();
        assertEquals(-1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateStoLeftOnce() {
        Block s = new Block(Tetrominoes.S);
        s.rotateLeft();
        int[][] coordinates = s.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(-1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateStoLeftMultipleTimes() {
        Block s = new Block(Tetrominoes.S);
        s.rotateLeft();
        s.rotateLeft();
        int[][] coordinates = s.getCoordinates();
        assertEquals(1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(1, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateStoLeftFull() {
        Block s = new Block(Tetrominoes.S);
        s.rotateLeft();
        s.rotateLeft();
        s.rotateLeft();
        s.rotateLeft();
        int[][] coordinates = s.getCoordinates();
        assertEquals(-1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(-1, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateZtoLeftOnce() {
        Block z = new Block(Tetrominoes.Z);
        z.rotateLeft();
        int[][] coordinates = z.getCoordinates();
        assertEquals(-1, coordinates[0][0]);
        assertEquals(1, coordinates[0][1]);
        assertEquals(-1, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(0, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateZtoLeftMultipleTimes() {
        Block z = new Block(Tetrominoes.Z);
        z.rotateLeft();
        z.rotateLeft();
        int[][] coordinates = z.getCoordinates();
        assertEquals(1, coordinates[0][0]);
        assertEquals(1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(1, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(0, coordinates[3][1]);
    }

    @Test
    public void rotateZtoLeftFull() {
        Block z = new Block(Tetrominoes.Z);
        z.rotateLeft();
        z.rotateLeft();
        z.rotateLeft();
        z.rotateLeft();
        int[][] coordinates = z.getCoordinates();
        assertEquals(-1, coordinates[0][0]);
        assertEquals(-1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(-1, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(0, coordinates[3][1]);
    }

    @Test
    public void notRotatingO() {
        Block o = new Block(Tetrominoes.O);
        o.rotateLeft();
        int[][] coordinates = o.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(1, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(1, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }
}
