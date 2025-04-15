package infernodesgraçabucetacaralho;
import java.util.Scanner;

public class Tres1504 {
	public static void main(String[]args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int numero1= entrada.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2= entrada.nextInt();
		System.out.println("Digite o terceiro número:");
		int numero3= entrada.nextInt();
		
		int maior = Math.max(Math.max(numero1, numero2), numero3);
		
		System.out.println("O maior número é: " + maior);
	}
}
