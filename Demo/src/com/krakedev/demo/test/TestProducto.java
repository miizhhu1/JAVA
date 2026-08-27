package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(1,"Mesa");
		
		p1.setDescripcion("Color cafe");
		p1.setPeso(100);
		
		System.out.println("Id:" + p1.getCodigo());
		System.out.println("Nombre del producto: " + p1.getNombre());
		System.out.println("Descripcion del producto: " + p1.getDescripcion());
		System.out.println("Peso del producto: " + p1.getPeso()+" Kg");
		

	}

}
