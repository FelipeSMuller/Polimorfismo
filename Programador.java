package polimorfismo;

import javax.swing.JOptionPane;

public class Programador extends Funcionario {

	@Override
	public Double calcularSalario(Double quantidadeSalarios) {

		quantidadeSalarios = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a quantidade de salários"));

		Double salario = super.calcularSalario(quantidadeSalarios) + 50;

		tratamentoErro(quantidadeSalarios);

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nCargo: " + cargo + "\nCPF: " + cpf + "\nSalário: " + df.format(salario));

		return super.calcularSalario(quantidadeSalarios) + 50;
	}

}
