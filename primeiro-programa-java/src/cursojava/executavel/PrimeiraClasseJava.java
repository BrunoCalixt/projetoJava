package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a Quantidade de Carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a Quantidade de Pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoasNumero);
		int resto = (int)(carroNumero % pessoasNumero); 
		
		JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros");

	}

}
