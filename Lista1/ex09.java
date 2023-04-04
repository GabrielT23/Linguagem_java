package Lista1;
import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
          int op, cont;
          int num = 1;
          System.out.println("Escolha uma opçao para imprimir na tela: ");
          System.out.println("1) Divisíveis por 4 ou 5\n2) Números pares\n3) Números impares\n4) Números primos\n ");
          op = ler.nextInt();
          if(op == 1){
            while(num < 1000){
                if(num % 5 == 0 || num % 4 == 0){
                    System.out.println(""+num);
                }
                num++;
               }
          }
          else if(op == 2){
            num++;
            while(num < 1000){
                System.out.println(""+num);
                num += 2;
               }
          }
          else if(op == 3){
               while(num < 1000){
                System.out.println(""+num);
                num += 2;
               }
          }
          else if(op == 4){
              num = 50;
               while(num < 1000){
                   cont = 0;
                   for(int i = 1; i <= num; i++){
                       System.out.println(num);
                       if(num % i == 0){
                           cont++;
                       }
                   if(cont == 2){
                       System.out.println(""+num);
                   }
               }
               num++;
          }
        }
    }
}
