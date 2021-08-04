package desafiosJavaGit;

import java.util.Scanner;

public class Cenarios {
    //Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
    //realizar:
    //1 – Verificar se um dos números lidos é ou não múltiplo do outro
    //2 – Verificar se os dois números lidos são pares
    //3 – Verificar se a média dos dois números é maior ou igual a 7.
    //4 – Sair
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int numero1 = entrada.nextInt();
        System.out.println("Insira um numero:");
        int numero2 = entrada.nextInt();
        System.out.println("Insira qual funcao quer executar:");
        int verificar = entrada.nextInt();

        switch (verificar){
            case 1:
                if(numero1%numero2==0 || numero2%numero1==0){
                    System.out.println("Um dos numeros são divisiveis um pelo outro");
                }else {
                    System.out.println("Numeros não são divisiveis um pelo outro");
                }
                break;
            case 2:
                if (numero1%2==0 || numero2%2==0){
                    System.out.println("Um dos numeros é par");
                }else{
                    System.out.println("Ambos são impares");
                }
                break;
            case 3:
                double media = (numero1+numero2)/2;
                if (media>=7){
                    System.out.println("Média dos numero é maior que 7");
                }else{
                    System.out.println("Média dos numero é menor que 7");
                }
                break;
            case 4:
                System.out.println("Você optou por sair");
                break;
        }

        entrada.close();
    }
}
