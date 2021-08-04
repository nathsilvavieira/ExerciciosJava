package desafiosJavaGit;

public class Multiplo100 {
    public static void main(String[] args) {
        for(int i=0;i<=100; i++){
            if (i%10==0){
                System.out.println(i+ " é multiplo de 10");
            }else{
                System.out.println(i);
            }
        }
    }
}
