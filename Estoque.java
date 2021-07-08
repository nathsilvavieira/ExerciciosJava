package desafiosJavaGit;

import java.util.Scanner;

public class Estoque   {
    //Faca um programa para calcular o estoque medio de uma peca, sendo que?
    // estoque medio = (quantidade_minima + quantidade_maxima)/2
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
           System.out.println(" Vamos calucular estoque medio da peca! ");
           System.out.println(" Insira nome da peca : ");
           String peca = entrada.nextLine();
           System.out.println(" Qual quantidade minima da peca? ");
           double qtdminima = entrada.nextDouble();
           System.out.println(" Por ultimo qual quantidade maxima?  ");
           double qtdmaxima = entrada.nextDouble();

           double estoquemedio = (qtdminima+qtdmaxima)/2;

           System.out.println("O estoque medio da peca "+ peca +" e de "+estoquemedio);

        entrada.close();
    }

}
