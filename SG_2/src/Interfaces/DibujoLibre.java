package Interfaces;

import java.awt.Graphics;
import java.awt.Point;

public class DibujoLibre {


	
	public void drawFree(Graphics g , Figura figura) {
		
	       for (int i = 1; i < figura.points.size(); i++) {
               Point point1 = figura.getPoints().get(i - 1);
               Point point2 = figura.getPoints().get(i);
               g.drawLine(point1.x, point1.y, point2.x, point2.y); // Dibuja la línea entre dos puntos
           }
	}

}
