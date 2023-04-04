package Lista3;

import java.util.Scanner;

public class ex09 {
    public static int Q9(int n1, int n2, int quant, int cont){
        int n3;
        if(cont%2 == 0){
        n3 = n1+n2;
        }
        else{
           n3 = n1-n2; 
        }
        System.out.print(n3+" > ");
        if(cont == quant){
            System.out.print("...");
            return n3;
        }
        return Q9(n2, n3, quant, cont+1);
     }
    public static void main(String[] args) {
        int num1, num2, quant ;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero da sequencia de Fetuccine: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo numero da sequencia de Fetuccine: ");
        num2 = ler.nextInt();
        System.out.println("Digite a quantidade elementos para mostrar: ");
        quant = ler.nextInt();
        System.out.print(num1+" > "+num2+" > ");
        Q9(num1, num2, quant, 3);
    }
    
}
