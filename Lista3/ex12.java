package Lista3;
import java.util.Scanner;
public class ex12 {
    public static int Q8(int n1, int n2, int n3, int n4, int quant, int cont){
        int n5 = n1+n2+n3+n4;
        System.out.print(n5+" > ");
        if(cont == quant-3){
            System.out.print("...");
            return n5;
        }
        return Q8(n2, n3, n4, n5, quant, cont+1);
     }
    public static void main(String[] args) {
        int quant ;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade elementos para mostrar: ");
        quant = ler.nextInt();
        System.out.print(0+" > "+0+" > "+0+" > "+1+" > ");
        Q8(0, 0, 0, 1, quant, 0);
    }
    
}
