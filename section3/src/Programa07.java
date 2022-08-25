import java.util.Scanner;

/*
 * Receba dados do usuario enquanto a idade for maior que 0
 *
 * while
*/
public class Programa07 {

	public static void main(String[] args) {
		int		idade;
		String	nome;

		idade = 1;
		/* Para receber dados do usuário via teclado */
		Scanner	teclado = new Scanner(System.in);
		while (idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());

			System.out.println(nome + " tem " + idade + " anos");
		}
		teclado.close();
	}
}
