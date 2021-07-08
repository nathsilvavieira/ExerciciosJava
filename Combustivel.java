package desafiosJavaGit;

import java.util.Scanner;

public class Combustivel {
    //Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
    //12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
    //Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
    //Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
    //fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
    //tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        System.out.println("Qual velocidade  media usada");
        double velocidade = entrada.nextDouble();
        System.out.println("Qual tempo total da viagem ");
        double tempo = entrada.nextDouble();
        double kmlitro = 12;
        double distancia = tempo*velocidade;
        double litrosUsados = distancia/kmlitro;
        System.out.println(" Gasolina  em litros total gasta e de "+litrosUsados);

      entrada.close();
    }
}
