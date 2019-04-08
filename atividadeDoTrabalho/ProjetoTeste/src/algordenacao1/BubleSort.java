package algordenacao1;
public class BubleSort {
	public  BubleSort(int [] vetor) {
		
		for (int i = vetor.length -1; i>0; i--) { 
			for (int j = 0; j < i; j++) {
				if (vetor[j] > vetor[j+1])  {
					int temp = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temp;
               
                                }
			}				
		}
               
	}
        public static void main(String[] args) {
            int[] vetor = {2,3,45,5,67,7,8,89,23,1,4} ;
            
            BubleSort bubleSort = new BubleSort(vetor);
            for (int i = 0; i < 10; i++) {
                System.out.println("Resut " + vetor[i]);
            }
            
            
            
    }
}
