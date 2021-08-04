package desafiosJavaGit;

import java.util.Scanner;

public class NumerosUsuario {
    //Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é
    //positivo ou negativo. Pare a execução do programa quando o usuário requisitar.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        do{
            System.out.println("Insira numero: ");
            int a = entrada.nextInt();
            if(a<0){
                System.out.println("Numero negativo ");
            }else{
                System.out.println("Numero positivo");
            }
        }while (continuar==true);


        entrada.close();
    }
}
