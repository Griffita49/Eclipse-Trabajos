package Interfaces;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
public class Linea extends Figura{

	public Linea() {
		super("Linea");	
	}
	
	public void drawRectLine(Graphics g) {
		g.drawLine(starx, stary, finalx, finaly);
	}
}

