package Aula12;

public class App {

	public static void main(String[] args) {
		Estagiario lua = new Estagiario("Lua",9568);
		Administrativo sol = new Administrativo("Sol",99999);
		lua.imprimir_Relatorio();
		sol.imprimir_Relatorio();
	}

}
