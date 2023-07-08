package primeiroTeste;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int  fatorial,mult = 0 ,result= 0;
		System.out.print("Insire o valor da fatorial: ");
		fatorial = entrada.nextInt();
		result = fatorial * --fatorial;
		System.out.println(result);
		for(int i = fatorial -1; i > 1; i-- ) {
			result *=i;
			System.out.println(result);
			
		}
	}

}
