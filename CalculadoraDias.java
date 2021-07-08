package desafiosJavaGit;

import java.util.Date;
import java.util.Scanner;

public class CalculadoraDias {
    //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
    //pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira sua idade \n");
        System.out.println("Anos: \n");
        int ano = entrada.nextInt();
        System.out.println("Meses: \n");
        int mes = entrada.nextInt();
        System.out.println("Dias: \n");
        int dia = entrada.nextInt();

        int idadeEmDias = (ano*365)+(mes*30)+dia; // 27 anos 9 meses 2 dias retorna 10127 dias
        //deu certo, precisa inputar os dados de forma correta.

        System.out.println("Voce tem "+idadeEmDias+" dias");

        entrada.close();
    }
}
