package desafiosJavaGit;

import java.util.Scanner;

public class Comissao {
    //Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
   // comissão será de 5% do total da venda e que você tem os seguintes dados:
    // Identificação do vendedor, Código da peça, Preço unitário da peça,Quantidade vendida
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Vendedor insira sua dentificacao: ");
        double identificacao = entrada.nextDouble();
        System.out.println("Codigo da peca vendida: ");
        double codigoPeca= entrada.nextDouble();
        System.out.println("Preco unitario em R$ ");
        double precounitario = entrada.nextDouble();
        System.out.println("Quantidade de pecas vendidas: ");
        double qtdpecasvendidas = entrada.nextDouble();

        double totalVendas = precounitario*qtdpecasvendidas;
        double comissao = (totalVendas*1.05)-totalVendas;

        System.out.printf("Comissao do vendedor id %f e de R$ %f ", identificacao, comissao);

        entrada.close();
    }
}
