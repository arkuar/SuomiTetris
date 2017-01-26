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
public class BlockRightRotationTest {

    public BlockRightRotationTest() {
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
    public void rotateItoRightOnce() {
        Block i = new Block(Tetrominoes.I);
        i.rotateRight();
        int[][] coordinates = i.getCoordinates();
        assertEquals(1, coordinates[0][0]);
        assertEquals(0, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(-1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(-2, coordinates[3][0]);
        assertEquals(0, coordinates[3][1]);
    }

    @Test
    public void rotateItoRightMultipleTimes() {
        Block i = new Block(Tetrominoes.I);
        i.rotateRight();
        i.rotateRight();
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
    public void rotateItoRightFull() {
        Block i = new Block(Tetrominoes.I);
        i.rotateRight();
        i.rotateRight();
        i.rotateRight();
        i.rotateRight();
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
    public void rotateTtoRightOnce() {
        Block t = new Block(Tetrominoes.T);
        t.rotateRight();
        int[][] coordinates = t.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(-1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(-1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(0, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateTtoRightMultipleTimes() {
        Block t = new Block(Tetrominoes.T);
        t.rotateRight();
        t.rotateRight();
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
    public void rotateTtoRightFull() {
        Block t = new Block(Tetrominoes.T);
        t.rotateRight();
        t.rotateRight();
        t.rotateRight();
        t.rotateRight();
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
    public void rotateJtoRightOnce() {
        Block j = new Block(Tetrominoes.J);
        j.rotateRight();
        int[][] coordinates = j.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(-1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(1, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateJtoRightMultipleTimes() {
        Block j = new Block(Tetrominoes.J);
        j.rotateRight();
        j.rotateRight();
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
    public void rotateJtoRightFull() {
        Block j = new Block(Tetrominoes.J);
        j.rotateRight();
        j.rotateRight();
        j.rotateRight();
        j.rotateRight();
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
    public void rotateLtoRightOnce() {
        Block l = new Block(Tetrominoes.L);
        l.rotateRight();
        int[][] coordinates = l.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(-1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(1, coordinates[2][1]);
        assertEquals(-1, coordinates[3][0]);
        assertEquals(-1, coordinates[3][1]);
    }

    @Test
    public void rotateLtoRightMultipleTimes() {
        Block l = new Block(Tetrominoes.L);
        l.rotateRight();
        l.rotateRight();
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
    public void rotateLtoRightFull() {
        Block l = new Block(Tetrominoes.L);
        l.rotateRight();
        l.rotateRight();
        l.rotateRight();
        l.rotateRight();
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
    public void rotateStoRightOnce() {
        Block s = new Block(Tetrominoes.S);
        s.rotateRight();
        int[][] coordinates = s.getCoordinates();
        assertEquals(0, coordinates[0][0]);
        assertEquals(-1, coordinates[0][1]);
        assertEquals(0, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(1, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(1, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateStoRightMultipleTimes() {
        Block s = new Block(Tetrominoes.S);
        s.rotateRight();
        s.rotateRight();
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
    public void rotateStoRightFull() {
        Block s = new Block(Tetrominoes.S);
        s.rotateRight();
        s.rotateRight();
        s.rotateRight();
        s.rotateRight();
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
    public void rotateZtoRightOnce() {
        Block z = new Block(Tetrominoes.Z);
        z.rotateRight();
        int[][] coordinates = z.getCoordinates();
        assertEquals(1, coordinates[0][0]);
        assertEquals(-1, coordinates[0][1]);
        assertEquals(1, coordinates[1][0]);
        assertEquals(0, coordinates[1][1]);
        assertEquals(0, coordinates[2][0]);
        assertEquals(0, coordinates[2][1]);
        assertEquals(0, coordinates[3][0]);
        assertEquals(1, coordinates[3][1]);
    }

    @Test
    public void rotateZtoRightMultipleTimes() {
        Block z = new Block(Tetrominoes.Z);
        z.rotateRight();
        z.rotateRight();
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
    public void rotateZtoRightFull() {
        Block z = new Block(Tetrominoes.Z);
        z.rotateRight();
        z.rotateRight();
        z.rotateRight();
        z.rotateRight();
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
        o.rotateRight();
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
