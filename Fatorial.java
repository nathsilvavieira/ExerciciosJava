package desafiosJavaGit;

import java.util.Scanner;

public class Fatorial {
    // Escreva um programa que leia:
    //- a quantidade de números que deverá processar;
    //- os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial.
    //Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        int fatorial = entrada.nextInt();
        int multiplicador =1; //nota errei primeira tentativa tive que pesquisar, precisava de uma nova variavel para salvar resultado e multiplicar novamente.
        for(int i=fatorial; i>=1; i--){
            multiplicador*=i;
        }
        System.out.println(multiplicador); //5! = 120*/


        entrada.close();
    }
}
