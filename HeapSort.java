/*
 * ============================================================================
 *
 *    Description:  Implementação do algoritmo HeapSort
 *
 *        Version:  1.3
 *        Created:  09/04/2020
 *       Compiler:  NetBeans
 *
 *         Author:  Guilherme Anacleto Ferreira (guilhermeanacleto@hotmail.com)
 *   Organization:  Universidade Anhembi Morumbi
 *
 * ============================================================================
 */

package HeapSort;

import java.util.Random;

public class HeapSort {
    public static void main(String[] args) {
        int[] vet = new int[10];
        //int[] vetor = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            vet[i] = gerador.nextInt(10);            
        }        
        
        
        //int[] vet = {12, 11, 13, 5, 6, 7}; 
          
        System.out.println("Vetor Original"); 
        printArray(vet); 
  
        sort(vet);
  
        System.out.println("\nVetor Organizado"); 
        printArray(vet);
        
        
        
    }
    
    public static void printArray(int []vet){
        for (int k = 0; k < vet.length; k++) {
            System.out.println("" + vet[k]);
        }        
        }

    public static int[] sort(int[] vetor) {

        for (int i = vetor.length / 2 - 1; i >= 0; i--) {
            heapify(vetor, vetor.length, i);
        }

        for (int i = vetor.length - 1; i >= 0; i--) {

            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            heapify(vetor, i, 0);
        }
        return vetor;
    }

    public static void heapify(int arr[], int arrayLength, int rootElementIndex) {

        int leftIndex = 2 * rootElementIndex + 1;
        int rightIndex = 2 * rootElementIndex + 2;

        int largest = rootElementIndex;

        if (leftIndex < arrayLength && arr[leftIndex] > arr[largest]) {
            largest = leftIndex;
        }

        if (rightIndex < arrayLength && arr[rightIndex] > arr[largest]) {
            largest = rightIndex;
        }

        if (largest != rootElementIndex) {

            int swap = arr[rootElementIndex];
            arr[rootElementIndex] = arr[largest];
            arr[largest] = swap;

            heapify(arr, arrayLength, largest);
        }
    }
}
