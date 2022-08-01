package br.com.dio;

import br.com.dio.model.Ravioli;

public class ItalianaPrimeiroPrograma {

	public static void main(String[] args) {
		Ravioli ravioli = new Ravioli ();
		ComJaponesa comjaponesa = new ComJaponesa ();
		
		System.out.println(ravioli);
		System.out.println(comjaponesa);
		
	/*int a = 2;
		int b = 3;
		System.out.println("Hello World!" + (a+b));*/
		
	}

}

class ComJaponesa{
	private String nome;
	private String tipo;
}