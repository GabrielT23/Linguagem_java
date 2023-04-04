package Lista1;
import java.util.Scanner;
public class ex10 {
     public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
          int n1 = 0;
          int n2 =1;
          int n3 = 0;
          System.out.println(n1);
          System.out.println(n2);
          while(n3 < 1000){
              n3 = n1+n2;
              if(n3 < 1000)
                System.out.println(n3);
              n1 = n2;
              n2 = n3;
             }
     }
}
