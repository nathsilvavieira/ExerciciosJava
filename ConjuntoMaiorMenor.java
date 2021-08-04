package desafiosJavaGit;

import java.util.Scanner;

public class ConjuntoMaiorMenor {
    //Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o
    //número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o
    //fim dos dados.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int numeromaior;
        int numeromenor;
        System.out.println("insira um numero inteiro ou negativo para sair: ");
        numero = entrada.nextInt();
        if (numero>0){
            numeromaior =numero;
            numeromenor =numero;
            while (numero>=0){
                System.out.println("Digite outro numero: ");
                numero = entrada.nextInt();
                if(numero>numeromaior){
                    numeromaior=numero;
                }else{
                    if(numero>=0){
                        numeromenor=numero;
                    }
                }

            }
            System.out.println("Maior numero"+numeromaior+ "\nMenor numero"+numeromenor);
        }

        entrada.close();
    }
}
