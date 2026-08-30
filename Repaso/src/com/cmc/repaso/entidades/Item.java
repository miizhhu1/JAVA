package com.cmc.repaso.entidades;

public class Item {
	
	public String nombre;
	public int productosActuales;
	public int productosDevueltos;
	public int productosVendidos; 
	
	//metodo imprimir	
	public void imprimir() {
		System.out.println("Nombre: "+ nombre );
		System.out.println("Producto actual: "+productosActuales);
		System.out.println("Producto devueltos: "+productosDevueltos);
		System.out.println("Producto vendidos: "+productosVendidos);
	}
	
	//metodo vender
	public void vender(int cantidad) {
		productosActuales = productosActuales - cantidad;
		productosVendidos = productosVendidos + cantidad;		
	}
	
	//metodo devolder
	public void devolver (int cantidad) {
		productosActuales= productosActuales+cantidad;
		productosVendidos=productosVendidos-cantidad;
		productosDevueltos= productosDevueltos+cantidad;
		
	}
}
