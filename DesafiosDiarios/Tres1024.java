package infernodesgraçabucetacaralho;

public class Tres1024 {
		
	public static void main (String [] args) {
		//Acima de 7, aprovado
		//Entre 5 e 7, recuperação
		//abaixo de 5, reprovado
		
		double nota1=.5;
		double nota2=4.0;
		double nota3=6.5;
		
		double media=(nota1+nota2+nota3)/3;
		
		System.out.println ("A média das notas é "+ media);
		
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
