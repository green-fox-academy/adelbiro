import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void drawLines (Graphics graphics,  int x, int y, int xEnd, int yEnd) {
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(x, y, xEnd, yEnd);
    }

    public static void mainDraw(Graphics graphics) {
        int numberOfLines = 20;
        int stepSize = WIDTH/2/20;
        for (int i = 1; i <= numberOfLines ; i++) {
            drawLines(graphics, WIDTH/2, HEIGHT/2 - (i*stepSize), (i*stepSize), HEIGHT/2); //left up
            drawLines(graphics, WIDTH/2, HEIGHT/2 - (i*stepSize), WIDTH- (i*stepSize), HEIGHT/2); // right up
            drawLines(graphics, WIDTH/2, HEIGHT/2 + (i*stepSize),i*stepSize, HEIGHT/2); //left bottom
            drawLines(graphics, WIDTH/2, HEIGHT/2 + (i*stepSize), WIDTH - (i* stepSize), HEIGHT/2); //right bottom
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