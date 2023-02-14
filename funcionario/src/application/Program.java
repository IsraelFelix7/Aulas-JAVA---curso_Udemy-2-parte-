package application;

import entities.Funcionario;
import entities.Gerente;
import entities.Tecnico;

public class Program {

	public static void main(String[] args) {
		Funcionario tecnico = new Tecnico();
		tecnico.calcularSalario(10,120);
		System.out.println(tecnico);

		Funcionario gerente = new Gerente(2000, 500);
		gerente.calcularSalario(30, 80);
		System.out.println(gerente);
		
		
		
		
	}

}
