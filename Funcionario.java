package polimorfismo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Classe abstrata é conhecida como uma classe fábrica.
public abstract class Funcionario {

	// Na classe abstrata não instanciamos nada, ela é só um modelo
	public Long cpf;

	public String nome;

	public String cargo;

	DecimalFormat df = new DecimalFormat("R$ ####.##");

	public Double calcularSalario(Double quantidadeSalarios) {

		return quantidadeSalarios * 1000;

	}

	public void tratamentoErro(Double quantidade) {

		try {

			if (quantidade <= 0) {

				JOptionPane.showMessageDialog(null, "Não é possível inserir um salário negativo ou igual a 0");

			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,

					"O programa foi encerrado incorretamente ou dados inválidos foram inseridos");

		}

	}

}
