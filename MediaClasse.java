package desafiosJavaGit;

import java.util.Scanner;

public class MediaClasse {
    //Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de
    //alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantidade de alunos :");
        int qtdalunos = entrada.nextInt();
        double[] alunos = new double[qtdalunos];
        double[] matricula = new double [qtdalunos];
        for (int i = 0; i <= alunos.length; i++) {
            System.out.println("Insira numero da matricula do aluno" +(i+1)+":");
            matricula[i]=entrada.nextInt();
            System.out.println("Insira as nota do aluno"+(i+1)+" : ");
            alunos[i] =entrada.nextInt();

            double total=0;
            for (double nota:alunos) {
                total+=nota;
            }
            System.out.println("media da sala é" + total/alunos.length);

        }

        entrada.close();
    }
}
