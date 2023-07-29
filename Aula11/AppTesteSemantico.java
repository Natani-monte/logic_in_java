package Aula11;

public class AppTesteSemantico {

	public static void main(String[] args) {
		Pessoa mae = new Pessoa("leo");
		Pessoa pai = new Pessoa("maria");
		Pessoa objeto1 = new Pessoa("leoo", pai);
		Pessoa objeto2 = new Pessoa("leoo", mae,pai);
		Pessoa objeto3 = new Pessoa("leoo", mae,pai);

		objeto2.verificarIgualdade(objeto3);

	}

}
