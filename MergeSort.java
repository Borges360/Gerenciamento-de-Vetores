/*
 * ============================================================================
 *
 *    Description:  Implementação do algoritmo MergeSort
 *
 *        Version:  1.8
 *        Created:  09/04/2020
 *       Compiler:  NetBeans
 *
 *         Author:  Guilherme Anacleto Ferreira (guilhermeanacleto@hotmail.com)
 *   Organization:  Universidade Anhembi Morumbi
 *
 * ============================================================================
 */

package MergeSort;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] vet = new int[10];
        //int[] vetor = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            vet[i] = gerador.nextInt(10);            
        }        
                                
        System.out.println("Vetor Original"); 
        printArray(vet); 
  
        mergeSort(vet, 0, vet.length - 1); 
  
        System.out.println("\nVetor Organizado"); 
        printArray(vet);     

    }
    
    public static void printArray(int []vet){
        for (int k = 0; k < vet.length; k++) {
            System.out.println("" + vet[k]);
        }        
    }
    
    public static int[] mergeSort(int vetor[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            intercala(vetor, inicio, meio, fim);
        }
        return vetor;
    }
    
    public static void intercala(int vetor[], int l, int m, int r ){
        int i, j, k; 
        int n1 = m - l + 1; 
        int n2 =  r - m; 
  
         /* create temp arrays */
        int[] R = new int[n2];
        int[] L = new int[n1];
  
        /* Copy data to temp arrays L[] and R[] */
        for (i = 0; i < n1; i++) 
            L[i] = vetor[l + i]; 
        for (j = 0; j < n2; j++) 
            R[j] = vetor[m + 1+ j]; 
  
        /* Merge the temp arrays back into arr[l..r]*/
        i = 0; // Initial index of first subarray 
        j = 0; // Initial index of second subarray 
        k = l; // Initial index of merged subarray 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                vetor[k] = L[i]; 
                i++; 
            } 
            else
            { 
                vetor[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy the remaining elements of L[], if there 
        are any */
        while (i < n1) 
        { 
            vetor[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy the remaining elements of R[], if there 
        are any */
        while (j < n2) 
        { 
            vetor[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
}

