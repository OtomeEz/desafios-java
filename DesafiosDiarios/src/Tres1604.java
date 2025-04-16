import java.util.Scanner;
public class Tres1604 {

	public static void main(String[]args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite seu número:");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println ("O número é Par!");
		}
		else {
			System.out.println ("O número é Ímpar!");
		}
		if (numero % 10 == 0) {
			System.out.println ("O número é divisivel por 10!");
		}
		else {
			System.out.println ("O número não é divisivel por 10!");
		}
	}
	
}
