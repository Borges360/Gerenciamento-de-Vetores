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
