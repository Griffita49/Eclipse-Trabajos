package eventos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Simplepaint extends JPanel {
    private List<Point> points = new ArrayList<>();
    private List <List<Point>> puntos = new ArrayList<>();

    public Simplepaint() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                points = new ArrayList<>();  // Comienza un nuevo trazo
                points.add(e.getPoint());
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                puntos.add(points);  // Almacena el trazo actual
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.black);

        // Dibuja todas las líneas guardadas en "puntos"
        for (List<Point> trazo : puntos) {
            for (int i = 1; i < trazo.size(); i++) {
                Point p1 = trazo.get(i - 1);
                Point p2 = trazo.get(i);
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }

        // Dibuja el trazo actual
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
           // g.drawOval(i, i, i, i);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint");
        Simplepaint paintPanel = new Simplepaint();
        frame.add(paintPanel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
