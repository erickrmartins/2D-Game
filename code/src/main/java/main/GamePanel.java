package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    //SCREEN SETTINGS
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;

    final int maxScreenColumns = 16;
    final int maxScreenRows = 12;
    final int screenWidth = tileSize * maxScreenColumns;
    final int screenHeight = tileSize * maxScreenRows;

    public GamePanel() {
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setDoubleBuffered(true);
    }

    Thread gameThread;

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        while(gameThread != null) {

            // UPDATE: CHARACTER POSITION AND OTHER INFORMATION
            update();

            // DRAW: AFTER THE UPDATED DATA, DRAW THE SCREEN
            repaint();
        }
    }

    public void update() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;

        
    }
}
