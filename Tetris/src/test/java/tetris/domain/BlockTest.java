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
public class BlockTest {
    
    public BlockTest() {
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
    public void createEmptyBlock() {
        Block e = new Block();
        assertEquals(Tetrominoes.EMPTY, e.getTetromino());
    }
    
    @Test
    public void createBlock() {
        Block b = new Block(Tetrominoes.I);
        assertEquals(Tetrominoes.I, b.getTetromino());
    }
    
    @Test
    public void setXWorks() {
        Block b = new Block();
        b.setX(0, 12);
        assertEquals(12, b.getCoordinates()[0][0]);
    }
    
    @Test
    public void setYWorks() {
        Block b = new Block();
        b.setY(0, 12);
        assertEquals(12, b.getCoordinates()[0][1]);
    }
}
