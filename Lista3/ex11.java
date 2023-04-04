package Lista3;
import java.util.Scanner;
public class ex11 {
    public static int Q11(int n1, int n2, int quant, int cont){
        System.out.print(n1+" > "+n2+" > "+n2+" > ");
        if(cont+1 > quant/4){
            System.out.print("...");
            return n1;
        }
        return Q11(n1+1, n2+1, quant, cont+1);
     }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quant;
        System.out.println("Digite a quantidade elementos para mostrar: ");
        quant = ler.nextInt();
        Q11(1, 4,quant, 0);
    }
    
}
