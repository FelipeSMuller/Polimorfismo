package polimorfismo;

import javax.swing.JOptionPane;

public class FolhaPagamento {

	public static void main(String[] args) {

		int userInput = 0;

		do {

			try {

				userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Calcule o salário de um funcionário \n1-Salário do Vendedor \n2-Salário do Programador \n3-Salário do Gerente"));

				if (userInput <= 0) {

					JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a zero");
				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você inseriu dados inválidos ou finalizou o programa incorretamente!!!");
			}

			switch (userInput) {

			case 1:

				Vendedor v = new Vendedor();

				v.nome = "Felipe";

				v.cpf = (long) 1234567891;

				v.cargo = "Vendedor";

				v.calcularSalario(0.0);

				break;

			case 2:

				Programador p = new Programador();

				p.nome = "João";

				p.cargo = "Programador";

				p.cpf = (long) 123456789;

				p.calcularSalario(0.0);

				break;

			case 3:

				Gerente g = new Gerente();

				g.cargo = "Gerente";

				g.cpf = (long) 12345678;

				g.nome = "José";

				g.calcularSalario(0.0);

				break;

			default:
				JOptionPane.showMessageDialog(null,
						"Nenhuma opção foi selecionada, portanto a aplicação foi finalizada");

				break;
			}

		} while (userInput > 0);

	}

}
