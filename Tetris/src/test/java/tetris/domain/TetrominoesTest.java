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
 * @author arkuar
 */
public class TetrominoesTest {

    public TetrominoesTest() {
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
    public void rightCoordsForI() {
        int[][] i = Tetrominoes.I.getCoords();
        assertEquals(0, i[0][0]);
        assertEquals(-1, i[0][1]);
        assertEquals(0, i[1][0]);
        assertEquals(0, i[1][1]);
        assertEquals(0, i[2][0]);
        assertEquals(1, i[2][1]);
        assertEquals(0, i[3][0]);
        assertEquals(2, i[3][1]);
    }

    @Test
    public void rightCoordsForO() {
        int[][] o = Tetrominoes.O.getCoords();
        assertEquals(0, o[0][0]);
        assertEquals(0, o[0][1]);
        assertEquals(1, o[1][0]);
        assertEquals(0, o[1][1]);
        assertEquals(0, o[2][0]);
        assertEquals(1, o[2][1]);
        assertEquals(1, o[3][0]);
        assertEquals(1, o[3][1]);
    }

    @Test
    public void rightCoordsForT() {
        int[][] t = Tetrominoes.T.getCoords();
        assertEquals(-1, t[0][0]);
        assertEquals(0, t[0][1]);
        assertEquals(0, t[1][0]);
        assertEquals(0, t[1][1]);
        assertEquals(0, t[2][0]);
        assertEquals(1, t[2][1]);
        assertEquals(1, t[3][0]);
        assertEquals(0, t[3][1]);
    }

    @Test
    public void rightCoordsForJ() {
        int[][] j = Tetrominoes.J.getCoords();
        assertEquals(-1, j[0][0]);
        assertEquals(0, j[0][1]);
        assertEquals(0, j[1][0]);
        assertEquals(0, j[1][1]);
        assertEquals(1, j[2][0]);
        assertEquals(0, j[2][1]);
        assertEquals(1, j[3][0]);
        assertEquals(1, j[3][1]);
    }

    @Test
    public void rightCoordsForL() {
        int[][] l = Tetrominoes.L.getCoords();
        assertEquals(-1, l[0][0]);
        assertEquals(0, l[0][1]);
        assertEquals(0, l[1][0]);
        assertEquals(0, l[1][1]);
        assertEquals(1, l[2][0]);
        assertEquals(0, l[2][1]);
        assertEquals(-1, l[3][0]);
        assertEquals(1, l[3][1]);
    }

    @Test
    public void rightCoordsForS() {
        int[][] s = Tetrominoes.S.getCoords();
        assertEquals(-1, s[0][0]);
        assertEquals(0, s[0][1]);
        assertEquals(0, s[1][0]);
        assertEquals(0, s[1][1]);
        assertEquals(0, s[2][0]);
        assertEquals(-1, s[2][1]);
        assertEquals(1, s[3][0]);
        assertEquals(-1, s[3][1]);
    }
    
    @Test
    public void rightCoordsForZ() {
        int[][] z = Tetrominoes.Z.getCoords();
        assertEquals(-1, z[0][0]);
        assertEquals(1, z[0][1]);
        assertEquals(0, z[1][0]);
        assertEquals(-1, z[1][1]);
        assertEquals(0, z[2][0]);
        assertEquals(0, z[2][1]);
        assertEquals(1, z[3][0]);
        assertEquals(0, z[3][1]);
    }
}
