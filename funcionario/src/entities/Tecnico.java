package entities;

public class Tecnico implements Funcionario {
		private double salarioBase = 1000;
		private double salarioMensal;
		
		
		public double getSalarioMensal() {
			return salarioMensal;
		}




		public double getSalarioBase() {
			return salarioBase;
		}



		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}



		public Tecnico(double salarioBase) {
			this.salarioBase = salarioBase;
		}
		public Tecnico() {
		}


		
		public  double calcularSalario(double horasTrabalhadas, int quantHoras) {
		return salarioMensal = salarioBase + (horasTrabalhadas * quantHoras);
		
		
	}




		@Override
		public String toString() {
			return "Tecnico salario Mensal = " + salarioMensal ;
		}
	


	
}
