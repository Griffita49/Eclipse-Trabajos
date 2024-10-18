package Interfaces;

import java.awt.Graphics;

public class Cuadrado extends Figura{
private	 int  radio;

	public Cuadrado() {
		super("Cuadrado");
	}
	
	public  int getRadio() {
		return radio;
	}

	public  void setRadio(int radioentrada) {
		radio = radioentrada;
	}
	
    public  void drawSquare(Graphics g) {
        int diameter = radio * 2;
        g.drawRect(starx - radio, stary - radio, diameter, diameter); // Dibuja el círculo centrado
    }

}
