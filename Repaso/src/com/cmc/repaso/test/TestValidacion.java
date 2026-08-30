package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		
		//instanciamos el objeto
		
		Validacion v1 = new Validacion ();
		System.out.println(v1.validarMonto(25.25));
	    System.out.println(v1.validarMonto(-1));
	    System.out.println(v1.validarMonto(-50));
		System.out.println(v1.validarMonto(8));
	}

}
