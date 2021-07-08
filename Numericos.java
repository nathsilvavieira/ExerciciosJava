package desafiosJavaGit;

import java.util.Scanner;

public class Numericos {
    //Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
    //valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
    //A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
    //com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
    //devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
    //multiplicaçõef
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

                System.out.println("Informe o primeiro numero A:");
                double numeroA= entrada.nextDouble();
                System.out.println("Informe o segundo numero B: ");
                double numeroB= entrada.nextDouble();
                System.out.println("Informe o terceiro numero C:");
                double numeroC= entrada.nextDouble();
                System.out.println("Informe o quarto numero D:");
                double numeroD= entrada.nextDouble();

                double somaAB = numeroA+numeroB;
                double somaAC = numeroA+numeroC;
                double somaAD = numeroA+numeroD;

                System.out.printf("Soma de A e B e %f, soma de A e C e %f, Soma de A e D e %f. \n", somaAB, somaAC, somaAD);

                double multAB = numeroA*numeroB;
                double multAC = numeroA*numeroC;
                double multAD = numeroA*numeroD;

                System.out.printf("Multiplicacao de A e B e %f, multiplicacao de A e C e %f, multiplicacao de A e D e %f.\n",
                        multAB,multAC,multAD);

                double somaBC = numeroB+numeroC;
                double somaBD = numeroB+numeroD;

                System.out.printf("Soma de B e C e %f, Soma de B e D e %f. \n",  somaBC, somaBD);

                double multBC = numeroB*numeroC;
                double multBD = numeroB*numeroD;

                System.out.printf("Multiplicacao B e C e %f, multiplicacao de B e D e %f.\n", multBC,multBD);

                double somaCD = numeroC+numeroD;

                System.out.printf("Soma de C e D e %f. \n", somaCD);

                double multCD = numeroC*numeroD;

                System.out.printf("Multiplicacao de C e D e %f.\n", multCD);

                entrada.close();

    }
}
