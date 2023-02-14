package entities;

public class Gerente implements Funcionario {
	private double salarioBase = 2000;
	private double bonus = 500;
	private double salarioMensal;
	
	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public Gerente(double salarioBase, double bonus) {
		this.salarioBase = salarioBase;
		this.bonus = bonus;
	}


	public  double calcularSalario(double horasTrabalhadas, int quantHoras) {
		return salarioMensal = bonus + salarioBase + ( horasTrabalhadas * quantHoras);
	
	}


	@Override
	public String toString() {
		return "Gerente salario Mensal = " + salarioMensal;
	}


	public double getSalarioMensal() {
		return salarioMensal;
	}



}
