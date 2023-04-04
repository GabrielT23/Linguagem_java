package Lista3;
public class ex01 {
     public static int Q1(int num){
         System.out.print(num+" > ");
         if(num >= 50){
             System.out.print("...");
             return num;
         }
         return Q1(num+1);
     }
    public static void main(String[] args) {
        Q1(1);
    }
}