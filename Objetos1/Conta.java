package Objetos1;

public class Conta {
	private Cliente cliente;
	private int numero;
	private double saldo;

	
	public Conta(int numero, double saldo,Cliente cliente) {
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	}
	public void exibirDetalhes() {
		System.out.println("Nome  : " + this.cliente.getNome());
		System.out.println("Cpf   : " + this.cliente.getCpf());
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo : " + this.saldo);
	}
	public void sacar(double saque) {
		this.saldo -= saque;
	}
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	Cliente getCliente () {
		return cliente;
	}
	int getNumero () {
		return numero;
	}
	double getSaldo () {
		return saldo;	
	}
	
}
