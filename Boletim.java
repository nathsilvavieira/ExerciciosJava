package desafiosJavaGit;

import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        //Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
        //aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
        //do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
        //apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
        //apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
        //aluno.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira nota  do primeiro Bimestre");
        double bim1=entrada.nextDouble();

        System.out.println("Insira nota  do segundo Bimestre");
        double bim2 = entrada.nextDouble();

        System.out.println("Insira nota  do terceiro Bimestre");
        double bim3=entrada.nextDouble();

        System.out.println("Insira nota  do quarto Bimestre");
        double bim4=entrada.nextDouble();
         double media = (bim1+bim2+bim3+bim4)/4;
        if(media>=7){
            System.out.println("Aluno aprovado media "+ media);
        }if(media<7){
            System.out.println("Informe nota de recuperacao");
            double rec = entrada.nextDouble();
            double novamedia= (media + rec)/2;
            if(novamedia>=7){
                System.out.println("Aluno aprovado na recuperacao media "+novamedia);
            }else{
                System.out.println("Aluno reprovado na recuperacao media "+novamedia);
            }
        }

        entrada.close();
    }
}
