package Lista3;
import java.util.Scanner;
public class ex03 {
    public static int Q3(int num){
        System.out.print(num+" > ");
         if(num >= 100){
             return num;
         }
         return Q3(num+1);
     }
    public static void main(String[] args) {
        int num, retorno;
        Scanner ler = new Scanner(System.in);
        do{
            System.out.println("Digite um numero menor que 100: ");
            num = ler.nextInt();
        }while(num >= 100);
        retorno = Q3(num);
        System.out.println(retorno);
    }
    
}
