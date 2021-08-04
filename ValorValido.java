package desafiosJavaGit;

import java.util.Scanner;

public class ValorValido {
    //Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
    //entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
    //Caso contrário, apresentar a mensagem “valor inválido”.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um numero valido ");
        int num = entrada.nextInt();
        switch (num){
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("Valor valido");
                break;
            default:
                System.out.println("Valor invalido");
        }


        entrada.close();
    }
}
