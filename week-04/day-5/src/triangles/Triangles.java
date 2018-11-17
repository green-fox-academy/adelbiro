package triangles;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics) {
    int counter = 7;
    drawTriangles(graphics, 0, 0, WIDTH, counter);
  }

  public static void drawTriangles(Graphics graphics, double x, double y, int canvasSize, int counter) {
    if (counter > 0) {
      graphics.setColor(Color.RED);
      graphics.drawLine((int) x, (int) y, (int) x + canvasSize, (int) y);
      graphics.setColor(Color.GREEN);
      graphics.drawLine((int) x + canvasSize, (int) y, (int) x + canvasSize / 2, (int) y + canvasSize);
      graphics.setColor(Color.BLUE);
      graphics.drawLine((int) x, (int) y, (int) x + (canvasSize / 2), (int) y + canvasSize);

      drawTriangles(graphics, x, y, canvasSize / 2, counter - 1);
      drawTriangles(graphics, x + (canvasSize / 2), y, canvasSize / 2, counter - 1);
      drawTriangles(graphics, x + canvasSize / 4, y + canvasSize / 2, canvasSize / 2, counter - 1);
    }
    return;
  }

  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    Triangles.ImagePanel panel = new Triangles.ImagePanel();
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
