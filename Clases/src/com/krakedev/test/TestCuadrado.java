package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuadrado 1
		Cuadrado c1 = new Cuadrado(4);
		System.out.println("-----Cuadrado 1 -----");
		double calcularAreaCuadrado;
		double calcularPerimetroCuadrado;
		calcularAreaCuadrado=c1.calcularArea();
		calcularPerimetroCuadrado= c1.calcularPerimetro();
		System.out.println("Lado es: "+ c1.getLado());
		System.out.println("Area del cuadrado es: "+calcularAreaCuadrado);
		System.out.println("Perimetro del cuadrado es: "+calcularPerimetroCuadrado);
		
		//cuadrado 2
		Cuadrado c2 = new Cuadrado(5);
		System.out.println("-----Cuadrado 2 -----");
		double calcularAreaCuadrado2;
		double calcularPerimetroCuadrado2;
		calcularAreaCuadrado2=c2.calcularArea();
		calcularPerimetroCuadrado2= c2.calcularPerimetro();
		System.out.println("Lado es: "+ c2.getLado());
		System.out.println("Area del cuadrado es: "+calcularAreaCuadrado2);
		System.out.println("Perimetro del cuadrado es: "+calcularPerimetroCuadrado2);
			
		//cuadrado 3
		Cuadrado c3 = new Cuadrado(8);
		System.out.println("-----Cuadrado 3 -----");
		double calcularAreaCuadrado3;
		double calcularPerimetroCuadrado3;
		calcularAreaCuadrado3=c3.calcularArea();
		calcularPerimetroCuadrado3= c3.calcularPerimetro();
		System.out.println("Lado es: "+ c3.getLado());
		System.out.println("Area del cuadrado es: "+calcularAreaCuadrado3);
		System.out.println("Perimetro del cuadrado es: "+calcularPerimetroCuadrado3);		
		

	}

}
