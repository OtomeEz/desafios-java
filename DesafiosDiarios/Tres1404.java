package infernodesgraçabucetacaralho;
import java.util.Scanner;
public class Tres1404 {
	public static void main(String[]args) {
		
		System.out.println("Digite sua primeira nota");
			Scanner entrada= new Scanner(System.in);
		double nota1=entrada.nextDouble();
		System.out.println("Digite sua segunda nota");
		double nota2=entrada.nextDouble();
		System.out.println("Digite sua terceira nota");
		double nota3=entrada.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;
		String resultado= String.format("Sua média final é %.2f ", media);
		System.out.println(resultado);
		
		if (media>=7) {
			System.out.println ("Aprovado");
		}
		else if(media>=5){
			System.out.println("Recuperação");
		}
		
		else {
			System.out.println ("Reprovado");
		}
		
	}
}
