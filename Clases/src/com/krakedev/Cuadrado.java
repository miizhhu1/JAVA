	package com.krakedev;

public class Cuadrado {
	
	private 	double lado;
	
	//creamos el metodo constructor
	public Cuadrado(double lado) {
		this.lado=lado;	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double area = lado*lado;
		return area;
		
	}
	
	public double calcularPerimetro () {
		double perimetro = lado+lado+lado+lado;
		return perimetro;
	}

}
