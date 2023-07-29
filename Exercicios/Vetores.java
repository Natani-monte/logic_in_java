package Exercicios;

public class Vetores {

	public static void main(String[] args) {
		int vetorA [] = {5,6,4,8,10};
		int vetorB [] = new int [5];
		// i = 0/ i =1 
		for (int i = 0; i < vetorA.length;i++) {
			vetorB[i] = vetorA[i]*2;
		}
		for(int i : vetorB) {
			System.out.print(i + " ");
		}
	}

}
