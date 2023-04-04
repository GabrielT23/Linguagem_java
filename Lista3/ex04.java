package Lista3;
import java.util.Scanner;
public class ex04 {
    public static int Q4(int num){
        if(0 >= num){
            System.out.print("0");
            return num;
        }
        if(num%2 == 0){
            System.out.print(num+" > ");
            return Q4(num-2);
        }
        else{
            return Q4(num-1);
        }
     }
    public static void main(String[] args) {
        int num, retorno;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        num = ler.nextInt();
        Q4(num);
    }
    
}
