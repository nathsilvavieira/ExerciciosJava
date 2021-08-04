package desafiosJavaGit;

import java.util.Scanner;

public class CalculaIMC {
    //Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
    //utilizando as seguintes fórmulas: (h = altura)
    //- Para homens: (72.7*h) - 58
    //- Para mulheres: (62.1 *h) - 44.7
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira sua altura: ");
        double h = entrada.nextDouble();
        System.out.println("Insira seu sexo, masculino ou feminino1");
        String sexo = entrada.next();
        if (sexo =="masculino"){
            System.out.println("Seu peso ideal é "+ ((72.7*h) - 58));
        }else{
            System.out.println("Seu peso ideal é " +((62.1 *h) - 44.7));
        }
        entrada.close();
    }
}
