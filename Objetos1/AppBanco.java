package Objetos1;

public class AppBanco {

	public static void main(String[] args) {
		Cliente natani = new Cliente ("natani monte", "256.552.652-65");
		Conta contaNatani = new Conta(8,5000.000,natani);
		contaNatani.exibirDetalhes();
		contaNatani.depositar(99999);
		contaNatani.exibirDetalhes();
		contaNatani.sacar(1234);
		contaNatani.exibirDetalhes();
		contaNatani.exibirDetalhes();
	}

}
