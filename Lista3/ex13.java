package Lista3;

import java.util.Scanner;

public class ex13 {
     public static int Q13(int n1, int n2){
        if (n2 == 0){
            return n1;
        }
        
        return Q13(n2, n1%n2);
     }
    public static void main(String[] args) {
        int num1, num2, retorno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        num1 = ler.nextInt();
        System.out.println("Digite outro qualquer: ");
        num2 = ler.nextInt();
        retorno = Q13(num1, num2);
        System.out.println("O maior divisor entre esses numeros eh: "+retorno);
    }
}
