package com.krakedev;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	//creamos metedos para poder obtener los atributos
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	//creamos metodos para poder asignar valores a los atributos
	public void setDia (int dia) {
		//this hace referencia al obeto actual
		this.dia=dia;
	}
	
	public void setMes (int mes) {
		this.mes=mes;
	}
	
	public void setAnio(int anio) {
		this.anio=anio;
	}
	

}
