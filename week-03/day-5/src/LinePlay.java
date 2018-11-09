import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawPink(Graphics graphics, int x, int y, int x9, int y9) {
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(x, y, x9, y9);
    }

    public static void drawCyan(Graphics graphics, int x, int y, int x9, int y9) {
        graphics.setColor(new Color(0, 128,0));
        graphics.drawLine(x, y, x9, y9);
    }

    public static void mainDraw(Graphics graphics) {
        int steps = 14;
        int xCoordinate = 40;
        int yCoordinate = 20;
        for (int j = 0; j <= steps; j++) {
            drawPink(graphics, xCoordinate, 0, HEIGHT, yCoordinate );
            drawCyan(graphics, 0, xCoordinate, yCoordinate, HEIGHT);
            xCoordinate += 20;
            yCoordinate += 20;
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