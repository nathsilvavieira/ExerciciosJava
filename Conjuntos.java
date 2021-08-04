package desafiosJavaGit;

import java.util.Scanner;

public class Conjuntos {
    //Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba
    //ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o
    //número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o
    //fim dos dados.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int numeropar = 0;
        int numerosimpar = 0;
        while(numero>=0) {
            System.out.println("Insira um numero inteiro para começar: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                numeropar++;
                System.out.println("Qtd de pares são: " + numeropar);
            } else {
                numerosimpar++;
                System.out.println("Qtd de impares: " + numerosimpar);
            }
        }
        entrada.close();
    }
}
