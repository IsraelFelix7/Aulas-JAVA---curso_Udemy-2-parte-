package entities;

public interface Funcionario {

	default double calcularSalario(double horasTrabalhadas, int quantHoras) {
		return horasTrabalhadas * quantHoras;
	}

}
