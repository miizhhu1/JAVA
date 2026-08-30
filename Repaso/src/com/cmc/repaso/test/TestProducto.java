package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto("Laptop", 25);
		
		p1.setPrecio(-8);
		
		double precioPromo=p1.calcularPrecioPromo(10);
		
		System.out.println("Nombre del produto : "+ p1.nombre);
		System.out.println("Precio : "+ p1.precio);
		System.out.println("Descuento : "+ precioPromo);
		
		
				

	}

}
