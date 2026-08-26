package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancia de la clase
		Rectangulo r1 = new Rectangulo(5,4);
		
		System.out.println("------Rectangulo 1 ------");
		
		double resultadoArea;
		double resultadoPerimetro;
		
		resultadoArea= r1.calcularArea();
		resultadoPerimetro=r1.calcularPerimetro();
		
		System.out.println("Altura: "+r1.getAltura());
		System.out.println("Base: "+r1.getBase());
		System.out.println("Area del rectangulo es : "+ resultadoArea);
		System.out.println("Perimetro del rectangulo es : "+ resultadoPerimetro);
		
		System.out.println("------Rectangulo 2 ------");
		Rectangulo r2 = new Rectangulo(4,2);
		double resultadoArea2;
		double resultadoPerimetro2;
			
		resultadoArea2= r2.calcularArea();
		resultadoPerimetro2=r2.calcularPerimetro();
		System.out.println("Altura: "+r2.getAltura());
		System.out.println("Base: "+r2.getBase());
		System.out.println("Area del rectangulo es : "+ resultadoArea2);
		System.out.println("Perimetro del rectangulo es : "+ resultadoPerimetro2);

	}

}
