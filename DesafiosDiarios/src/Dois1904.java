import java.util.Scanner;
public class Dois1904 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite seu número!");
		
		int num= entrada.nextInt();
		
	       int divisores = 0;

	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                divisores++;
	            }
	        }

	        if (divisores == 2) {
	            System.out.println("Seu número é primo!");
	        } else {
	            System.out.println("Seu número não é primo!");
	        }
	    }
	}