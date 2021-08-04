package desafiosJavaGit;

import java.util.Scanner;

public class VariaveisInt {
    //Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada
    //variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido
    //multiplicado pelo maior e o maior valor dividido pelo menor.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        do {
            System.out.println("Insira um valor valido: ");
            a = entrada.nextInt();
        } while(a<0);
        do {
            System.out.println("Insira um novo valor: ");
            b = entrada.nextInt();
        }while(b<0);
        do {
            System.out.println("Insira ultimo valor: ");
            c = entrada.nextInt();
        }while(c<0);
        if(a<b || a<c) {
            if(b<c){
                System.out.println(a*c);
                System.out.println(c/a);
            }else{
                System.out.println(a*b);
                System.out.println(b/a);
            }
        }if(b<a || b<c) {
            if(a<c){
                System.out.println(b*c);
                System.out.println(c/b);
            }else{
                System.out.println(a*b);
                System.out.println(a/b);
            }
        }if(c<a || c<b) {
            if(a<b){
                System.out.println(b*c);
                System.out.println(b/c);
            }else{
                System.out.println(a*b);
                System.out.println(b/a);
            }
        }
        entrada.close();
    }
}
