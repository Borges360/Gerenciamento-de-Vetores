/*
 * ============================================================================
 *
 *    Description:  Implementação do algoritmo Insertion
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

package Insertion;

import java.util.Random;

public class OrdenaVetor {
    public static void main(String[] args) {
        int[] vet = new int[10];
        Random gerador = new Random();
        
        for(int i = 0; i < 10; i++){
            vet[i] = gerador.nextInt(100);
            System.out.println(vet[i]);
        }
        System.out.println("-----------------------------------------------");
        
        //Chamar Insertion
        
        vet = insertion(vet);
        
        for(int k = 0; k <= vet.length ; k++){
         System.out.println(vet[k]);
        }
        
        
    }
    
    public static int [] bubbleSort ( int [] vetorBubbleSort ) {     
		
		int i, j, temp; 
        boolean swapped; 
        
        int n = vetorBubbleSort.length;
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (vetorBubbleSort[j] > vetorBubbleSort[j + 1])  
                { 
                    temp = vetorBubbleSort[j]; 
                    vetorBubbleSort[j] = vetorBubbleSort[j + 1]; 
                    vetorBubbleSort[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            if (swapped == false) 
                break; 
        }
		return vetorBubbleSort; 
	}
    
    public static int[] insertion(int [] vetor){
        int j,aux;
        
        for(int i = 0; i < vetor.length; i++){
            j = i;
            while(j > 0 && vetor[j-1]>vetor[j]){
                aux = vetor[j];
                vetor[j] = vetor[j-1];
                vetor[j-1] = aux;
            j--;
            }
        }     
        return vetor;
    }
    
    
    
}
