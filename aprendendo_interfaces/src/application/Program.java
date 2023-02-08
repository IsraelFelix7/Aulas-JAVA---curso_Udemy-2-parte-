package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		System.out.println("Entre com a datav(dd/mm/yyyy): ");
		LocalDate  date = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(numero, date, totalValue);
		
		System.out.println("Entre com o numero de parcelas: ");
		
		
		sc.close();
	}

}
