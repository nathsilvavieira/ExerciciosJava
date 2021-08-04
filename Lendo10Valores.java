package desafiosJavaGit;

import java.util.Scanner;

public class Lendo10Valores {
    //Faça um programa que leia 10 valores inteiros e positivos e:
    //- Encontre o maior valor
    //- Encontre o menor valor
    //- Calcule a média dos números lidos
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int numeromaior=0;
        int numeromenor=0;

        for (int i = 0; i <=10; i++) {
            System.out.println("Insira um numero");
            numero = entrada.nextInt();
            if (numero > 0){
                numeromaior = numero;
                numeromenor = numero;
                if(numero>numeromaior){
                    numeromaior=numero;
                }else{
                    if(numero>=0) {
                        numeromenor = numero;
                    }
                }
            }

        }
        int media=(numeromaior+numeromenor)/2;
        System.out.println("Maior Numero "+numeromaior+"\nMenor numero"+numeromenor+ "\nMédia dos numero"+media);
        entrada.close();

    }
}
