package desafiosJavaGit;

import java.util.Scanner;

public class ConverterTemperatura {
    //Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
    //temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
    //Fahrenheit e a variável C representa é a temperatura em graus Celsius.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe temperatura em Celcius: ");
        int celcius = entrada.nextInt();
        int fareheint = ((9*celcius)+160)/5;
        System.out.println(" Temperatura em Fareheint e de "+fareheint);

        entrada.close();
    }
}
