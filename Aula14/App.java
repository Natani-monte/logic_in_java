package Aula14;

public class App {

	public static void main(String[] args) {

		Diretor d1 = new Diretor ("sl",12,20);
		d1.CalcularRendimento();
		
		DiretorEstatutario dE1 = new DiretorEstatutario ("Nome", 123,50,20);
		dE1.CalcularRendimento();
		
		Gerente g1 = new Gerente ("Nome", 546,10);
		g1.CalcularRendimento();
		
	}

}
