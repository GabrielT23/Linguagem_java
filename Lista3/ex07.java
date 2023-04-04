package Lista3;

import java.util.Scanner;

public class ex07 {
    public static int Q7(int n){
        if(n == 0){
            return n;
        }
        else if(n == 1){
            return n;
        }
        else{
            return 2*Q7(n-1)+Q7(n-2);
        }
     }
    public static void main(String[] args) {
        int num, retorno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        num = ler.nextInt();
        retorno = Q7(num);
        System.out.println("O numero de pell de "+num+" eh: "+retorno);
    }
    
}
