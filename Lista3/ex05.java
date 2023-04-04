package Lista3;
import java.util.Scanner;
public class ex05 {
    public static int Q5(int num, int n){
        if(n > num){
            return 1;
        }
        return n*Q5(num, n+2);
     }
    public static void main(String[] args) {
        int num, retorno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        num = ler.nextInt();
        retorno = Q5(num, 1);
        System.out.println("O fatorial duplo de "+num+"eh: "+retorno);
    }
}
