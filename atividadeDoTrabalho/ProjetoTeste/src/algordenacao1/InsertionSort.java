package algordenacao1;

public class InsertionSort {

	public InsertionSort(int[] v, int tam) {

		int i;
		for (int j = 1; j < tam; j++) { 
			int x = v[j]; 
			for (i = j - 1; i >= 0 && v[i] > x; i--) 
				v[i + 1] = v[i];
			v[i + 1] = x;
		}
	}
        public static void main(String[] args) {
            int[] vetor = {2,3,45,5,67,7,8,89,23,1,4} ;
            
            InsertionSort insertionSort = new InsertionSort(vetor, 8);
            for (int i = 0; i < 10; i++) {
                System.out.println("Resut " + vetor[i]);
            }
            
        }
}
