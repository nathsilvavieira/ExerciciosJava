package desafiosJavaGit;

import java.util.Scanner;

public class MaiorMenorNumero {
    //Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
    //menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira primeiro numero ");
        double num1 = entrada.nextDouble();
        System.out.println("Insira segundo numero");
        double num2 = entrada.nextDouble();

        if (num1 > num2) {
            System.out.println("Primeiro numero e maior");
        }else if(num1==num2){
            System.out.println("Numeros sao iguais");
        }else{
            System.out.println("Segundo numero e maior");
        }

        entrada.close();

    }
}

