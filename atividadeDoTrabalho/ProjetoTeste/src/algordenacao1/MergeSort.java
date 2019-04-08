package megesort;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int v[], int start, int middle, int end) {
        int i, p1, p2;
        int aux[] = new int[end + 1];

        p1 = start;     
        p2 = middle + 1;
        i = start;    
        while (p1 <= middle && p2 <= end) {            
            if (v[p1] <= v[p2]) {
                aux[i++] = v[p1++];  
            } else {
                aux[i++] = v[p2++];
            }
        }
        while (p1 <= middle) {
            aux[i++] = v[p1++];     
        }
        while (p2 <= end) {
            aux[i++] = v[p2++];
        }

        for (i = start; i <= end; i++) {
            v[i] = aux[i];  
        }
    }
    public static void mergesort(int v[], int start, int end) {
        int middle;
        if (start < end) {                 
            middle = (start + end) / 2;       
            mergesort(v, start, middle);   
            mergesort(v, middle + 1, end);  
            merge(v, start, middle, end);  
        }
    }

    public static void main(String args[]) {

        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = stdin.nextInt();
        }
 
        mergesort(v, 0, n - 1);

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(' ');
            }
            System.out.print(v[i]);
        }
        System.out.println();
    }
}
