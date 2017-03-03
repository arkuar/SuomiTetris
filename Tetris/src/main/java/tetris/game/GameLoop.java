package tetris.game;

/**
 * Luokka määrittää pelin ajankulun ja tarjoaa ajankulun kontrolloimiseen
 * erilaisia metodeja.
 *
 * @author Arttu
 */
public abstract class GameLoop {

    private boolean running = false;
    private boolean paused = false;
    private double gameSpeed;

    /**
     * Määrittää pelin ajankulun.
     */
    public void run() {
        running = true;

        long lastTime = System.currentTimeMillis();
        long passed = 0;
        gameSpeed = 1;
        while (running) {
            long time = System.currentTimeMillis();
            long delta = time - lastTime;
            lastTime = time;

            if (!paused) {
                if (lastTime <= time) {
                    if (passed < gameSpeed * 1000) {
                        passed += delta;
                    } else {
                        updateGame();
                        passed = 0;
                    }
                    draw();
                } else {
                    long delay = (time - time) * 1000;
                    if (delay > 0) {
                        try {
                            Thread.sleep(delay);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
        }
        stop();
    }

    /**
     * Abstrakti metodi pelitilanteen päivittämiseen.
     *
     * @see Tetris#updateGame()
     */
    public abstract void updateGame();

    /**
     * Abstrakti metodi pelin piirtoalustan päivittämiseen.
     *
     * @see Tetris#draw()
     */
    public abstract void draw();

    /**
     * Pysäyttää run -metodin while-loopin suorittamisen.
     */
    public void stop() {
        running = false;
    }

    /**
     * Jatkaa pelin päivittämistä normaaliin tapaan.
     */
    public void resume() {
        paused = false;
    }

    /**
     * Pysäyttää pelin päivittämisen.
     */
    public void pauseUpdates() {
        paused = true;
    }
    /**
     * Kasvattaa pelin nopeutta.
     */
    public void increaseSpeed() {
        gameSpeed -= 0.2;
    }
    /**
     * Palauttaa pelin nopeuden oletukseksi.
     */
    public void resetSpeed() {
        gameSpeed = 1;
    }

}
