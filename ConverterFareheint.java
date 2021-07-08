package desafiosJavaGit;

import java.util.Scanner;

public class ConverterFareheint {
    //Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
    //temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
    //variável C é a temperatura em graus Celsius.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe Temperatura em Fareheint: ");
        int fareheint = entrada.nextInt();
        int celcius = (fareheint-32)*5/9;
        System.out.println("Temperatura em Celcius e de  "+celcius);

        entrada.close();
    }
}
