package tetris;

import tetris.logic.GameBoard;
import tetris.domain.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arttu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameBoard b = new GameBoard(10, 10);
        Block c = new Block(Tetrominoes.I);
    }

}
