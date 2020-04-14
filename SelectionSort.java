/*
 * ============================================================================
 *
 *    Description:  Implementação do algoritmo SelectionSort
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

package SelectionSort;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        int[] vet = new int[10];
        int[] vetor = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            vetor[i] = vet[i] = gerador.nextInt(10);            
        }        

        vet = selection(vet);
                
        for (int k = 0; k < vet.length; k++) {
            System.out.println("" + vetor[k] + " | " + vet[k]);
        }

    }

    public static int[] selection(int[] vet) {
        int minimo, temp;
        for (int i = 0; i != (vet.length - 1); i++) {
            minimo = vet[i];
            for (int j = (i + 1); j < vet.length; j++) {
                if (vet[j] <= vet[minimo]) {
                    minimo = j;
                }
            }
            temp = vet[i];
            vet[i] = vet[minimo];
            vet[minimo] = temp;
        }
        return vet;
    }

}
