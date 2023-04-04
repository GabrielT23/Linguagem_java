package Lista3;

import java.util.Scanner;

public class ex06 {
    public static int fatorial(int num, int n){
        if(n > num){
            return 1;
        }
        return n*fatorial(num, n+1);
     }
    public static int Q6(int num, int n){
        if(n > num){
            return 1;
        }
        return fatorial(n, 1)*Q6(num, n+1);
     }
    public static void main(String[] args) {
        int num, retorno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        num = ler.nextInt();
        retorno = Q6(num, 1);
        System.out.println("O superfatorial de "+num+"eh: "+retorno);
    }
}
