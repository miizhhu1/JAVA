package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Mishell");
		e1.calificar(10);
		
		System.out.println(" ----Nota 1---- ");
		
		System.out.println("Estudiante : "+ e1.nombre);
		System.out.println("Su nota es : "+ e1.nota);
		System.out.println("El resultado es : "+ e1.resultado);
		
		e1.calificar(5);
		System.out.println(" ----Nota 2---- ");
		
		System.out.println("Estudiante : "+ e1.nombre);
		System.out.println("Su nota es : "+ e1.nota);
		System.out.println("El resultado es : "+ e1.resultado);
		
	
	}

}
