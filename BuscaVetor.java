/*
 * ============================================================================
 *
 *    Description:  Implementação do algoritmo BuscaBinaria
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

package BuscaBinaria;
import java.util.Random;

public class BuscaVetor {
    public static void main(String[] args) {
        
        int[] vet = new int[10];
        Random gerador = new Random();
        
        for(int i = 0; i < 10; i++){
            vet[i] = gerador.nextInt(10);
            System.out.println(vet[i]);
        }
        System.out.println("-----------------------------------------------");
        OrdenaVetor.bubbleSort(vet); //Organiza o Vetor
        
        if((buscaBinaria(3,vet)) == -1){
            System.out.println("Valor não encontrado");
        } else {
            System.out.println("O valor esta na posição :  " + buscaBinaria(3,vet));
        }
                
    }
    
    public static int buscaBinaria(int x,int[] vet){
        int n = vet.length;
        int esq, dta,i;
        esq = 0;
        dta = n - 1;
        
        while(esq <= dta){
            i = (esq+dta)/2;
            if(x == vet[i]){
                return i;
            }else if(x < vet[i]){
                return dta = (i - 1);
            }else if(x > vet[i]){
                return esq = (i + 1);
            }
            i++;
        }
    return -1;
    }
    
}
