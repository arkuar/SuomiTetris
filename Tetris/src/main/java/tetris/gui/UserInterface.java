package tetris.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import tetris.logic.GameBoard;

public class UserInterface implements Runnable {

    private JFrame frame;
    private GameBoard game;
    private int height, width;
    private GamePanel gamepanel;

    public UserInterface(GameBoard game) {
        this.game = game;
    }

    @Override
    public void run() {
        frame = new JFrame("SuomiTetris");
        frame.setPreferredSize(new Dimension(250, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        this.gamepanel = new GamePanel(game);
        container.add(gamepanel);
    }

}
