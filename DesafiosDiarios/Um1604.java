import java.util.Scanner;
public class Um1604 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite um número:");
		double numero= entrada.nextDouble();
		
		if(numero<0) {
			System.out.println("O número "+numero+(" é negativo"));
		}
		else if (numero>0) {
			System.out.println("O número "+numero+(" é positivo"));
		}
		else {
			System.out.println("Esse número é Zero");
		}
	}

}
