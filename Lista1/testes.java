package Lista1;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        int QuantTimes;
        do{
            System.out.println("Quantos times irao participar?");
            QuantTimes = ler.nextInt();
        }while(QuantTimes != 4 && QuantTimes != 8 && QuantTimes != 12 && QuantTimes != 16);
        num = QuantTimes;
        for(int i = 0; i < QuantTimes; i++){
            for(int j = i; j < QuantTimes; j++){
                System.out.println(i+" x"+j);
            }
        }
    }
    
}
