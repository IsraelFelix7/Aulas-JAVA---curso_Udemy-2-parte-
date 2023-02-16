package application;

import entities.Funcionario;
import entities.Gerente;
import entities.Tecnico;

public class Program {

	public static void main(String[] args) {
		Funcionario tecnico = new Tecnico();
		tecnico.calcularSalario(10,120);
		System.out.println(tecnico);

		Funcionario gerente = new Gerente(3000, 500);
		gerente.calcularSalario(30, 80);
		Funcionario gerente01 = new Gerente(2000, 500);
		gerente01.calcularSalario(30, 90);
		
		System.out.println(gerente.equals(tecnico));
		System.out.println();
		
		System.out.println(gerente);
		System.out.println(gerente01);
		
		
		
		
	}

}
