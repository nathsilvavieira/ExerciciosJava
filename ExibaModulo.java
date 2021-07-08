package desafiosJavaGit;

import java.util.Scanner;

public class ExibaModulo {
    //Escreva um programa que leia um número inteiro e exiba o seu módulo.
    //O módulo de um número x é:
    //x se x é maior ou igual a zero
    //x * (-1) se x é menor que zero
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira numero: ");
        double x= entrada.nextInt();
        if(x>=0){
            System.out.printf("Modulo e %f ",x);
        }if(x<=0){
            double x2=x*(-1);
            System.out.printf("Modulo e %f ", x2);
        }
        entrada.close();
    }
}
