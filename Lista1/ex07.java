
package Lista1;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
          int col, lin;
          System.out.println("Digite o numero de linhas das matrizes: ");
          lin = ler.nextInt();
          System.out.println("Digite o numero de colunas das matrizes: ");
          col = ler.nextInt();
          System.out.println("Item A");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i == j){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item B");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i + j == col-1){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item C");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i > j){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item D");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i >= j){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item E");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i < j){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item F");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i <= j){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item G");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i == 0 || j == 0 || j == col -1 || i == lin -1){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item H");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(j % 2 == 1){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item I");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i % 2 == 1){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item J");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i == j || i + j == col-1){
                     System.out.print("*"); 
                  }
                  else{
                     System.out.print("%"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item K");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if((i == 0 && j == 0) || (i == lin-1 && j == 0) || (i == 0 && j == col-1) || (i == lin-1 && j == col-1)){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          System.out.println("Item K");
          for(int i = 0; i < lin; i++){
              for(int j = 0; j < col; j++){
                  if(i >= 2 && j >= 2 && i < lin-2 && j < col-2){
                     System.out.print("%"); 
                  }
                  else{
                     System.out.print("*"); 
                  }
                  System.out.print(" "); 
              }
              System.out.println("");
          }
          
      }  
}
