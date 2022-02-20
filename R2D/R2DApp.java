import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.geom.*;

public class R2DApp {
    public static void main (String[] args) {
        R2DFrame frame = new R2DFrame();
    }
}

class R2DFrame extends JFrame {
    public R2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setSize(1280, 720);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLUE);
        g2d.fillRect(50, 70, 625, 597);
        g2d.setColor(Color.WHITE);
        g2d.drawRect(140,185,100,50);
        g2d.setColor(Color.GREEN);
        g2d.fillRect(540,285,200,150);
        g2d.setColor(Color.RED);
        g2d.fillRect(600,480,70,100);
        g2d.setPaint(Color.cyan);
        g2d.drawRect(600,480,70,100);
    }
}