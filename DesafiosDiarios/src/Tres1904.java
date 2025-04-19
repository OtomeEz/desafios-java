import java.util.Scanner;

public class Tres1904 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu número!");
		int num = entrada.nextInt();
		int soma = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				soma += i;
			}
		}

		if (soma == num) {
			System.out.println("Seu número é perfeito!");
		} else {
			System.out.println("Seu número não é perfeito!");
		}
	}
}