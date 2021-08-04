package desafiosJavaGit;

import java.util.Scanner;

public class SomaQrd {
    //Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos
    //ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        for (int i = 0; i <= 20; i++) {
            System.out.println("Insira um numero: ");
            numero = entrada.nextInt();
            if(numero<=10){
               if(numero>=0){
                   if (numero%2==1){
                       int quadrado = numero * numero;
                       System.out.println(quadrado);
                   }
               }

            }

        }

        entrada.close();
    }

}
