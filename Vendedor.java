package polimorfismo;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {

	@Override
	public Double calcularSalario(Double quantidadeSalarios) {

		quantidadeSalarios = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a quantidade do salário"));

		tratamentoErro(quantidadeSalarios);

		Double salario = super.calcularSalario(quantidadeSalarios) + 300;

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nCargo: " + cargo + "\nCPF:  " + cpf + "\nSalário: " + df.format(salario));

		return super.calcularSalario(quantidadeSalarios) + 300;
	}

}