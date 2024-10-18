package Interfaces;

import java.awt.Graphics;

public class Circulo extends Figura{
private	int radio;
	
	public Circulo() {
		super("Circulo");
		// TODO Auto-generated constructor stub
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
    public  void drawCircle(Graphics g) {
        int diameter = radio * 2;
        g.drawOval(starx - radio, stary - radio, diameter, diameter); // Dibuja el círculo centrado
    }
	
}
