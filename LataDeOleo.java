package desafiosJavaGit;

import java.util.Scanner;

public class LataDeOleo {
    //Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
    //V = 3.14159 * R * R * A
    //Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Infome o raio: ");
        int raio = entrada.nextInt();
        System.out.println("Informe altura: ");
        int altura = entrada.nextInt();

        double volume = 3.14159 * raio*raio*altura;
        System.out.println("O volume da lada e de "+volume);


        entrada.close();

    }
}
