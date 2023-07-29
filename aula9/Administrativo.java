package aula9;

public class Administrativo extends Funcionario{
	private int horasExtras;
	
	public Administrativo( String nome, int rg, double salarioBase, int horasExtras) {
		super (nome,rg,salarioBase);
		this.horasExtras = horasExtras;
	}
	public double calcularSalario() {
		return this.getSalarioBase() + (this.horasExtras *( this.getSalarioBase() * 0.010));
	}
	public void imprimirSalario() {
		System.out.println("Imprimir salario: " + calcularSalario());
		this.horasExtras = 0;
	}
	public int getHorasExtras() {
		return horasExtras;
	}

}
