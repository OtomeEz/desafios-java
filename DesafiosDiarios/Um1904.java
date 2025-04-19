import java.util.Scanner;
public class Um1904 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println ("Digite seu número:");
		int num= entrada.nextInt();
		
		if(num % 2 == 0 && num % 7 == 0) {
			System.out.println("O número é multiplo por ambos!");
			
		}
		else if (num % 2 == 0) {
			System.out.println("O número é multiplo de Dois!");
		}
		else if (num % 7 == 0) {
			System.out.println("O número é multiplo de Sete!");
		}
		else {
			System.out.println("O número não é múltiplo de nenhum!");
		}
	}

}
