package tetris.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import tetris.game.Tetris;

/**
 * Luokka tarjoaa käyttöliittymän pelille.
 *
 * @author Arttu
 */
public class UserInterface implements Runnable {
    
    private JFrame frame;
    private Tetris game;
    private GamePanel gamepanel;
    private int blockSize;
    private JLabel scorebar;

    /**
     * Luo uuden käyttöliittymän parametrina annetulle pelille.
     *
     * @param game peli.
     * @param blockSize Palikan koko
     */
    public UserInterface(Tetris game, int blockSize) {
        this.game = game;
        this.blockSize = blockSize;
    }
    
    public JFrame getFrame() {
        return this.frame;
    }
    
    public JLabel getScorebar() {
        return this.scorebar;
    }
    
    public Refreshable getRefreshable() {
        return this.gamepanel;
    }
    
    @Override
    public void run() {
        frame = new JFrame("SuomiTetris");
        int width = (game.getWidth() + 1) * blockSize;
        int height = (game.getHeight() + 2) * blockSize;
        frame.setPreferredSize(new Dimension(width, height));
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        this.gamepanel = new GamePanel(game, blockSize);
        createMenu(gamepanel);
        container.add(gamepanel);
        ButtonListener listener = new ButtonListener(game);
        frame.addKeyListener(listener);
    }
    
    private void createMenu(GamePanel panel) {
        JMenuBar bar = new JMenuBar();
        JMenu menugame = new JMenu("Game");
        JMenuItem newGame = new JMenuItem("New Game");
        newGame.addActionListener((ae) -> {
            game.newGame();
        });
        menugame.add(newGame);
        bar.add(menugame);
        this.scorebar = new JLabel("Score: 0");
        bar.add(scorebar);
        panel.setScorebar(scorebar);
        frame.setJMenuBar(bar);
    }
    
}
