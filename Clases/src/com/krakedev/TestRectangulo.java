package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intanciar de la clase
		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea;
		
		resultadoArea= r1.calcularArea();
		
		System.out.println("Resultado es : "+ resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		r2.altura =2;
		r2.base = 4;
		int resultadoArea2;
		
		resultadoArea2= r2.calcularArea();
		System.out.println("Resultado rectangulo 2 es : "+ resultadoArea2);

		//calcular el perimetro
		Rectangulo p1 = new Rectangulo();
		p1.altura=2;
		p1.base=4;
		double resultadoPerimetro;
		
		resultadoPerimetro=p1.calcularPerimetro();
		System.out.println("El perimetro es: "+ resultadoPerimetro);


	}

}
