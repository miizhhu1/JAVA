package com.krakedev;

public class Rectangulo {
	
	//atributos de la clase
	private double base;
	private double altura;
	
	//creamos el metodo constructor
	public Rectangulo (double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	//creamos la funcion
	public double calcularArea() {
		double area = base*altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = base+base+altura+altura;
		return perimetro;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
