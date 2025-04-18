import java.util.Scanner;
public class Dois1704 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite seu número:");
		int num= entrada.nextInt();
		
		if (num>=10 && num<=20) {
			System.out.println("Este número está dentro do intervalo");
		}
		else {
			System.out.println("Este número não está dentro do intervalo");
		}
	}
}
