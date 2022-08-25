/*
 * foreach (para cada)
*/
public class Programa10 {
	public static void main(String[] args) {
		String	nome = "Geek University";

		/* Para cada um dos caracteres da string, imprima o caractere */
		for (char letra: nome.toCharArray()) {
			// System.out.println(letra); // para imprimir com o '\n'
			System.out.print(letra); // para imprimir sem o '\n'
		}
		System.out.println("");
	}
}
