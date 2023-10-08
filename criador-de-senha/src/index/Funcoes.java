package index;

import java.util.Random;

import javax.swing.JOptionPane;

public class Funcoes {
	public static void criar_senha(int n) {
		String valor = "";
		String letra = ("!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`ABCDEFGHIJKLMNOPQRSTUVWXYZ{|}~");
		int numero = n / 2;
		Random aleatorio = new Random();
		double divisao = n % 2;
		if (divisao != 0 || n < 6) {
			JOptionPane.showMessageDialog(null, "quantidade de caracteres inválida!!\na senha deve ter ou mais de 6 digitos ou ser par!", "ATENÇÃO",
					JOptionPane.ERROR_MESSAGE);

		} else {

			for (int i = 0; i < numero; i++) {

				int vl = aleatorio.nextInt(10);

				Random umletra = new Random();
				byte lt = (byte) umletra.nextInt(letra.length());
				valor += Integer.toString(vl) + letra.charAt(lt);
			}
			JOptionPane.showMessageDialog(null, valor, "sua senha", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
