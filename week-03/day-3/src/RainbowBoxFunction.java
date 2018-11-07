import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawSqr (Graphics graphics, int size, Color color) {
        int x = 0;
        int y = 0;
        int fillerSize = WIDTH;
        for (int i = 0; i < WIDTH; i++) {
            graphics.setColor(new Color((int)(Math.random()* 255), (int)(Math.random()* 255),(int)(Math.random()* 255)));
            graphics.fillRect(x, y, fillerSize, fillerSize);
            fillerSize -= 10;
            x += 5;
            y += 5;
        }
        graphics.setColor(color);
        int xLast = WIDTH/2 - (size/2);
        int yLast = HEIGHT/2 - (size/2);
        graphics.fillRect(xLast, yLast, size, size);

    }
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        for (int i = 0; i < 100; i++) {
            drawSqr(graphics, 120, Color.pink);

        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}