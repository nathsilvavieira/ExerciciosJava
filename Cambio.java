package desafiosJavaGit;

import java.util.Scanner;

public class Cambio {
    // faca um programa que leia cotacao do dolar, leia o valor em dolares,
    // converta esse valor para reais e mostre resultado na tela
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira dolar de hoje: ");
        double dolarhoje = entrada.nextDouble();
        System.out.println("Insira valores em dolar que deseja converter para reais: ");
        double dolaresconverter = entrada.nextDouble();

        double reais = dolaresconverter*dolarhoje;

        System.out.println("Valor em  reais  e de R$ " +reais);

        entrada.close();

    }
}
