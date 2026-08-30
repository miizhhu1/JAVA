package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		Item i1 = new Item ();
		
		System.out.println("----PRODUCTO 1----");
		
		i1.nombre = "Mouse";
		i1.productosActuales= 25	;
		i1.productosDevueltos=2;
		i1.productosVendidos=3;

        System.out.println("\nValores iniciales");
		i1.imprimir();
		
		i1.vender(20);
		System.out.println("\nVenta 20 unidades ");
		i1.imprimir();
		
		i1.devolver(10);
		System.out.println("\nDevolucion 10 unidades");
		i1.imprimir();
		
		Item i2 = new Item ();
		
		System.out.println("\n----PRODUCTO 2----");
		
		i2.nombre = "Teclado";
		i2.productosActuales= 10	;
		i2.productosDevueltos=5;
		i2.productosVendidos=8;

        System.out.println("\nValores iniciales");
		i2.imprimir();
		
		i2.vender(5);
		System.out.println("\nVenta 5 unidades ");
		i2.imprimir();
		
		i2.devolver(3);
		System.out.println("\nDevolucion 3 unidades");
		i2.imprimir();
		

	}

}
