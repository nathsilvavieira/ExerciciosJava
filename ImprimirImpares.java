package desafiosJavaGit;

public class ImprimirImpares {
    //Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.
    public static void main(String[] args) {
        for (int i = 200;i>=100; i--){
            if(i%2==1){
                System.out.println(i);
            }
        }

    }
}
