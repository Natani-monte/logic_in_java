package primeiroTeste;

public class Comparacao {

	public static void main(String[] args) {
		int x = 1; 
		int y = 50;
		int z = 10;
		int maior= 0,meio = 0,menor = 0;
		// X maior
		if( x>y && x>z) {
			maior = x;
			meio = y>z? y:z;
			menor = y<z? y:z;
		}
		//Y maior
		else if (y > x && y>z) {
			maior = y;
			meio = x>z ? x:z;
			menor = x>z ? z:x;
		}
		// Z maior
		else if (z > x && z>y) {
			maior = z;
			meio  = y>x ? y:x;
			menor = x>y ? x:y;		
		}
		System.out.println("maior: " + maior + "\nmeio: " + meio + "\nmenor: " + menor);
	}

}
