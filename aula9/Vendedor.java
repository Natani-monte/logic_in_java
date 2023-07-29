package aula9;

public class Vendedor extends Funcionario{
	private double vendas;
	
	public Vendedor(String nome, int rg, double salarioBase, double vendas) {
		super(nome, rg,salarioBase);
		this.vendas = vendas;
		
	}
	public void totalVendas(double valor) {
		this.vendas += valor;
	}
	private double calcularSalario () {
		return this.getSalarioBase() + (this.vendas * 0.5 );
	}
	public void imprimirSalario() {
		System.out.println("Imprimir salario: " + calcularSalario());
		this.vendas = 0;
	}
	
	
}
