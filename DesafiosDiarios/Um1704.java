import java.util.Scanner;
public class Um1704 {
	public static void main (String[]args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println ("Digite o primeiro número:");
		int num1= entrada.nextInt();
		System.out.println ("Digite o segundo número:");
		int num2= entrada.nextInt();
		System.out.println ("Digite o terceiro número:");
		int num3= entrada.nextInt();
		if( (num1 + num2 > num3) && (num1 + num3 > num2) && (num2 + num3 > num1) ) {
			System.out.println("É possível fazer um triangulo com esses números!");
		}
		else {
			System.out.println("Não é possível fazer um triangulo com esses números!");
		}
	}
}