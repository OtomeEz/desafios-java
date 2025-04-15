package infernodesgraçabucetacaralho;
import java.util.Scanner;
public class Um1504 {
	public static void main (String[]args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
			double numero1= entrada.nextDouble();
		System.out.println("Digite o segundo número:");
			double numero2= entrada.nextDouble();
		System.out.println("Digite a operação(+, -, *, /):");
			String operador = entrada.next();
		
		if (operador.equals("+")) {
			System.out.println(numero1+numero2);
		}
		else if (operador.equals("-")) {
			System.out.println(numero1-numero2);
		}
		else if (operador.equals("*")) {
			System.out.println(numero1*numero2);
		}
		else if (operador.equals("/")) {
			System.out.println(numero1/numero2);
		}
		else {
			System.out.println("Operação ínvalida");
		}
	}
}
