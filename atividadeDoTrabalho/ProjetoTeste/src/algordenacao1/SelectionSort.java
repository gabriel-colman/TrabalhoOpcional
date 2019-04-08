package algordenacao1;

import java.util.Scanner;

public class SelectionSort {
	/*
	 * SelectionSort
	 * Varre o inteiro em busca do menor elemento, guardando a posi��o dele em uma vari�vel
	 * Quando termina a varredura, troca a posi��o do menor com o in�cio do vetor.
	 * 
	 */
	public SelectionSort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min]) {
					min = j;
				}
			}
			int aux = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = aux;
		}
	}
        public static void main(String[] args) {
            //int[] vetor = {2,3,45,5,67,7,8,89,23,1,4} ;
            Scanner r = new Scanner(System.in);
            int [] vetor = new int[100];
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Digite valores");
                vetor[i] = r.nextInt();
            }
            SelectionSort selectionSort = new SelectionSort(vetor);
            for (int i = 0; i < 10; i++) {
                System.out.println("Resut " + vetor[i]);
            }
            
} 
}
