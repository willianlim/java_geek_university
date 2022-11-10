package br.com.geekuniversity.section05;/*
 * Condição de repetição "for"
*/
import java.util.Scanner;

public class Programa09 {
	public static void main(String[] args) {
		int	idade;
		String	nome;

		/* Para receber dados do usuário via teclado */
		Scanner	teclado = new Scanner(System.in);

		/* Variável de controle; condição de parada; forma de incremento */
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");
			/* idade = teclado.nextInt(); bug */
			idade = Integer.parseInt(teclado.nextLine());

			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos");
			}
		}
		teclado.close();
	}
}
