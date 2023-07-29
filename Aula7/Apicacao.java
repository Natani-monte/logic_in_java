package Aula7;

public class Apicacao {

	public static void main(String[] args) {
		Pessoa isaacNewnton = new Pessoa("Isaac Newton",4,1,1643);
		Pessoa albertEinstein = new Pessoa ("Albert Einstein",14,3,1879);
		
		isaacNewnton.calcularIdade(15,7, 2023);
		System.out.println(isaacNewnton.informaIdade());
		albertEinstein.calcularIdade(15,7, 2023);
		System.out.println(albertEinstein.informaIdade());

	}

}
