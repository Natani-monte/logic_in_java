package aula9;

public class AppTeste {

	public static void main(String[] args) {
		Vendedor Jose = new Vendedor("Jose",1233454,1200.52,23000);
		Jose.totalVendas(50000);
		Jose.imprimirSalario();
		
		Administrativo Paula = new Administrativo ("Paula", 987653,88888,24);
		Paula.imprimirSalario();
	}

}
