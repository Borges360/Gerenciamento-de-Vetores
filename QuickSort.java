/*
 * ============================================================================
 *
 *    Description:  Implementação do algoritmo QuickSort
 *
 *        Version:  1.2
 *        Created:  09/04/2020
 *       Compiler:  NetBeans
 *
 *         Author:  Guilherme Anacleto Ferreira (guilhermeanacleto@hotmail.com)
 *   Organization:  Universidade Anhembi Morumbi
 *
 * ============================================================================
 */

package QuickSort;

import java.util.Random;

public class QuickSort {
    
        public static void main(String args[]) {

        int[] vet = new int[10];
        //int[] vetor = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            vet[i] = gerador.nextInt(10);            
        }        
        
        
        //int[] vet = {12, 11, 13, 5, 6, 7}; 
          
        System.out.println("Vetor Original"); 
        printArray(vet); 
  
        quickSort(vet, 0, vet.length - 1);
  
        System.out.println("\nVetor Organizado"); 
        printArray(vet);

	}
        
        public static void printArray(int []vet){
        for (int k = 0; k < vet.length; k++) {
            System.out.println("" + vet[k]);
        }        
        }

	public static void quickSort(int v[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
		int troca;

		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq = esq + 1;
			}
			while (v[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda)
			quickSort(v, esquerda, dir);

		if (esq < direita)
			quickSort(v, esq, direita);

	}
	
   }
