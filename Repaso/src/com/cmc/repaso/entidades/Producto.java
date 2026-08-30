package com.cmc.repaso.entidades;

public class Producto {
	
	/*	
		En una clase TestProducto, prueba los métodos setPrecio y calcularPrecioPromo.*/
	
	//creamos los atributos
	public String nombre;
	public double precio;
	
	//Agrega un constructor que reciba el nombre y el precio, asignándolos a sus respectivos atributos.

	public Producto (String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;		
	}
	
	//Agrega un método setPrecio:
	public void setPrecio(double precio) {
		
		if(precio<0) {
			precio= precio*-1;
		}
		this.precio = precio;

	}
	
	//Agrega un método calcularPrecioPromo:
	
	public double calcularPrecioPromo(double porcentajeDescuento) {
		double descuento = precio * porcentajeDescuento /100; 
		double precioPromo = precio - descuento;
		return precioPromo;
	}
		

}
