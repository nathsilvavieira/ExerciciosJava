package desafiosJavaGit;

import java.util.Scanner;

public class ArmazenaLocalDiferente {
    //Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
    //resultado.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = entrada.nextInt();
        if(numero>=0){
            int a = numero;
            System.out.println("A = "+a);
        }else{
            int b = numero;
            System.out.println("B = "+b);
        }

        entrada.close();
    }
}
