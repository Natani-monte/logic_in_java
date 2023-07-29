package Vetor;
public class Main {

	public static void main(String[] args) {
/*
* Crie um programa, contendo dois vetores A e B cada um com
10 elementos inteiros. Depois construa um vetor C, usando
estruturas de repetição, onde cada elemento de C é a soma
dos respectivos elementos em A e B, ou seja:

C[i] = A[i] + B[i].
*/		;
		int VetorA[] = {0,9,8,7,6,5,4,3,12,89};
		int VetorB []= {12,34,56,78,90,1,2,3,4,9};
		int VetorC[] = new int[10];
		
		for (int i=0;i<VetorA.length;i++) {
		VetorC[i] = VetorA[i] + VetorB[i];
		}
		for (int i: VetorC) {
			System.out.println(i);
		}

	}

}
