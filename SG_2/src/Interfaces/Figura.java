package Interfaces;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Figura {
	String tipo; // Tipo de la figura ("linea" o "circulo")
    List <Point> points = new ArrayList<>(); // Puntos que componen la figura

   protected   int starx;
   protected   int stary;
      
   protected  int finalx;
   protected int finaly;
      
   Color color;
   
    public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}

	public Figura(String tipo) {
        this.tipo = tipo;
    }
    
	public void setInitialCoordenades(int x, int y) {
		starx= x;
		stary=y;
	}
	
	public void setFinalCoordenades(int x, int y) {
		finalx= x;
		finaly=y;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public int getStarx() {
		return starx;
	}

	public void setStarx(int starx) {
		this.starx = starx;
	}

	public int getStary() {
		return stary;
	}

	public void setStary(int stary) {
		this.stary = stary;
	}

	public int getFinalx() {
		return finalx;
	}

	public void setFinalx(int finalx) {
		this.finalx = finalx;
	}

	public int getFinaly() {
		return finaly;
	}

	public void setFinaly(int finaly) {
		this.finaly = finaly;
	}
	
    
	
    
}