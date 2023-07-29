package aula8;

public class AppProduto {

	public static void main(String[] args) {
		Produto objeto1 = new Produto();
		objeto1.setDescricao("Maca");
		objeto1.setValor(4.30);
		objeto1.setEstoque(55700);
		
		Produto objeto2 = new Produto();
		objeto2.setDescricao("Arroz");
		objeto2.setValor(2.30);
		objeto2.setEstoque(78);
		System.out.println("Descricao: " + objeto1.getDescricao());
		System.out.println("Valor: " + objeto1.getValor());
		System.out.println("Estoque: " + objeto1.getEstoque());
		
		System.out.println("\nDescricao: " + objeto2.getDescricao());
		System.out.println("Valor: " + objeto2.getValor());
		System.out.println("Estoque: " + objeto2.getEstoque());

	}

}
