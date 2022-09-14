package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a Quantidade de Carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a Quantidade de Pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoasNumero);
		int resto = (int) (carroNumero % pessoasNumero);

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,
					"Divisão para pessoas deu " + divisao + " carros.");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sobrou " + resto + " carros.");
		}

	}

}
