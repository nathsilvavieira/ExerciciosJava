package desafiosJavaGit;

import java.util.Scanner;

public class TrocaVariavel {
    //Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
    //possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um valor para A ");
        int A = entrada.nextInt();
        System.out.println("Insira um valor para B");
        int B = entrada.nextInt();
        int intermediaria;
        int outraintermediaria;
        intermediaria = A;
        outraintermediaria = B;
        B=intermediaria;
        A=outraintermediaria;

            System.out.println("Valor de A  agora e " + A);
            System.out.println("Valor de B agora e " + B);

        entrada.close();
    }
}
