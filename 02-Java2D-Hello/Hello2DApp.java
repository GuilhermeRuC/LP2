import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.geom.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(1280, 720);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.black);
        int w = getWidth();
        int h = getHeight();
        g2d.fillRect(0, 0, 1280, 720);
        g2d.setColor(Color.WHITE);
        g2d.drawLine(540,285,200,150);
        g2d.drawLine(540,435,200,150);
        g2d.drawLine(1080,570,740,435);
        g2d.drawLine(1080,570,740,285);
        g2d.setColor(Color.GREEN);
        g2d.fillRect(540,285,200,150);
        g2d.setColor(Color.RED);
        g2d.fillOval(540,285,200,150);
        g2d.setPaint(Color.black);
    }
}