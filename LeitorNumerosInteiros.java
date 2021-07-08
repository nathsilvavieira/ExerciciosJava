package desafiosJavaGit;

import java.util.Scanner;

public class LeitorNumerosInteiros {
    //Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
    //entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um Numero: ");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Insira outro Numero: ");
        int segundoNumero = entrada.nextInt();
        boolean igualdade = (primeiroNumero==segundoNumero);
        boolean naoigual = (primeiroNumero!=segundoNumero);
        boolean maiorque = (primeiroNumero>segundoNumero);
        boolean menorque = (primeiroNumero<segundoNumero);
        boolean maiorigual = (primeiroNumero>=segundoNumero);
        boolean menorigual = (primeiroNumero<=segundoNumero);

        System.out.println(" Os numeros sao iguais? "+igualdade);
        System.out.println(" Os numeros nao sao iguais? "+naoigual);
        System.out.println(" Primeiro numero e maior que segundo?"+maiorque);
        System.out.println(" Primeiro numero e menor que segundo?"+menorque);
        System.out.println(" Primeiro numero e maior ou igual que segundo?"+maiorigual);
        System.out.println(" Primeiro numero e menor ou igual que segundo?"+menorigual);

        entrada.close();
    }
}
