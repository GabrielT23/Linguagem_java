package Lista1;
import java.util.Scanner;
public class ex03 {
      public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
          int num, soma =0;
          System.out.println("Digite um numero qualquer: ");
          num = ler.nextInt();
          if(num > 0){
              while(num > 0){
                  soma += num%10;
                  num /= 10;
              }
              System.out.println("Soma dos algarismo do numero digitado eh: "+ soma);   
          }
          else{
              System.out.println("O numero digitado nao eh valido.");   
          }
      }
}
