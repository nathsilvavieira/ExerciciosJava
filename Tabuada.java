package desafiosJavaGit;

import java.util.Scanner;

public class Tabuada {
    //Faça um programa para imprimir uma tabuada.
    public static void main(String[] args) {

        /*for (double i =0;i<=10;i++){
            System.out.printf("Tabuada do %f", i);
            for (double j =0; i<=10;i++){
                System.out.println(i +"X"+j+"="+(i*j));
            }
        }*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero para calcular tabuada");
        int multiplacador = entrada.nextInt();
        System.out.println("Tabuada do "+ multiplacador);
        for (int i =0; i<=10; i++){
            int resultado = multiplacador*i;
            System.out.println(multiplacador +"x"+ i +"="+ resultado);
        }
        entrada.close();

    }
}
