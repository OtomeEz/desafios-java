import java.util.Scanner;
public class Tres1704 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1= entrada.nextInt();
		System.out.println ("Digite o segundo número");
		int num2=entrada.nextInt();
		
		if (num1>num2) {
			System.out.println("O primeiro número é maior que o segundo");
		}
		else if(num1<num2){
			System.out.println("O segundo número é maior que o primeiro");
		}
		else {
			System.out.println("Os números são iguais");
		}
	}
}