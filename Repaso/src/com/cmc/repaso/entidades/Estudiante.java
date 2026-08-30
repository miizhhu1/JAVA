package com.cmc.repaso.entidades;

public class Estudiante {
	
	public String nombre;
	public double nota;
	public String resultado;
	
	
	//constructor
	public Estudiante (String nombre){
		this.nombre=nombre;
	}
	
	//metodo
	public void calificar(double nota) {
		this.nota = nota;
		
		if(nota<8) {
			this.resultado= "F";
		}else {
			this.resultado="A";
		}
		
	}
	
	
	

}
