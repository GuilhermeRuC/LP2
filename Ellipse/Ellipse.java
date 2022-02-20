import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.geom.*;

public class Ellipse {
    public static void main (String[] args) {
        EllipseFrame frame = new EllipseFrame();
    }
}

class EllipseFrame extends JFrame {
    public EllipseFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setSize(720, 720);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.lightGray);
        g2d.fillOval(80,180,385,450);
        g2d.setPaint(Color.BLUE);
        g2d.fillOval(100,200,349,415);
        g2d.setPaint(Color.black);
        g2d.drawOval(110,208,330,400);
        g2d.setColor(Color.yellow);
        g2d.drawOval(215,390,150,70);
        g2d.setColor(Color.GREEN);
        g2d.fillOval(25,30,200,150);
        g2d.setColor(Color.RED);
        g2d.fillOval(600,280,50,300);
    }
}