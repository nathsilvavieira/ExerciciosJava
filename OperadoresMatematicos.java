package desafiosJavaGit;

import java.util.Scanner;

public class OperadoresMatematicos {
    //Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
    //1 – Adição
    //2 – Subtração
    //3 – Multiplicação
    //4 – Divisão
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Insira outro numero: ");
        double numero2 = entrada.nextDouble();
        System.out.println("Insira operador: ");
        String operador = entrada.next();

        switch (operador){
            case "+":
                System.out.println("Resultado da adição de "+numero1+" com numero "+ numero2+ " é "+(numero1+numero2));
                break;
            case "-":
                System.out.println("Resultado da subtração de "+numero1+" com numero "+ numero2+ " é "+(numero1-numero2));
                break;
            case "*":
                System.out.println("Resultado da multiplicação de "+numero1+" com numero "+ numero2+ " é "+(numero1*numero2));
                break;
            case "/":
                System.out.println("Resultado da divisão de "+numero1+" com numero "+ numero2+ " é "+(numero1/numero2));
                break;
        }

        entrada.close();
    }
}
