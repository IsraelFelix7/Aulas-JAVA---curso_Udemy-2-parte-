package entities;

public interface Funcionario {
		
	
	
	public default double calcularSalario(double horasTrabalhadas, int quantHoras) {
		return horasTrabalhadas * quantHoras;
	}

}
