package Lista3;

import java.util.Scanner;

public class ex10 {
    public static int Q10(int n1, int r, int quant, int cont){
        System.out.print(n1+" > ");
        if(cont >= quant-1){
            System.out.print("...");
            return n1;
        }
        return Q10(n1+r, r+2, quant, cont+1);
     }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quant;
        System.out.println("Digite a quantidade elementos para mostrar: ");
        quant = ler.nextInt();
        Q10(1, 3,quant, 0);
    }
}
