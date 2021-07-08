package desafiosJavaGit;

import java.util.Scanner;

public class MaiorMenor {
    //Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira numero");
        int num1 = entrada.nextInt();
        System.out.println("Insira numero");
        int num2 = entrada.nextInt();

        if(num1>num2){
            System.out.println(num1-num2);
        }else{
            System.out.println(num2-num1);
        }


        entrada.close();

    }
}
