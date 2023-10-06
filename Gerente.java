package polimorfismo;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {

	@Override
	public Double calcularSalario(Double quantidadeSalarios) {

		quantidadeSalarios = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a quantidade do salário"));

		tratamentoErro(quantidadeSalarios);

		Double salario = super.calcularSalario(quantidadeSalarios) + 400;

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nCPF: " + cpf + "\nCargo: " + cargo + "\nSalário: " + df.format(salario));

		return super.calcularSalario(quantidadeSalarios) + 400;
	}

}
