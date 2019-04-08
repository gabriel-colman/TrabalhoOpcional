package algordenacao1;

public class QuickSort {
	
	private int particao(int[] vetor, int esq, int dir) {
		int i = esq, j = dir;
		int tmp;
		int pivo = vetor[(esq+dir)/2];
		while(i <= j) {
			while (vetor[i] < pivo)
				i++;
			while(vetor[j] > pivo)
				j--;
			if (i<=j) {
				tmp=vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	public QuickSort(int [] vetor, int esq, int dir){
		int indice = particao(vetor, esq, dir);
		if (esq < indice-1)
			new QuickSort(vetor, esq, indice -1);
		if (indice <dir)
			new QuickSort(vetor, indice, dir);
	}

public static void main(String[] args) {
            int[] vetor = {2,3,45,5,67,7,8,89,23,1,4} ;
            
            QuickSort quickSort = new QuickSort(vetor, 4, 5);
            for (int i = 0; i < 10; i++) {
                System.out.println("Resut " + vetor[i]);
            }
            
}
}
