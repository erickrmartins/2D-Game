package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Window Class
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("2D Game");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //Game Panel Class
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();



    }
}
