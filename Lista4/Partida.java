package Lista4;

import java.util.Scanner;

public class Partida {
    private char simbolo;
    private Malha malha [][];
    private int linha;
    private int coluna;
    private String vencedor;
    private boolean game;
    Scanner ler = new Scanner(System.in);
    public Partida(){
        malha = new Malha[3][3];
        game = true;
        simbolo = 'X';
    }
    public void Jogar(){
        Inicio();
        while(game){
            Desenhar();
            vencedor = VerificarVitoria();
            System.out.println("Rodada do: "+simbolo);
            if(!vencedor.equals("")){
                System.out.println(vencedor);
                break;
            }
            if(VerificarJogada()){
                if(simbolo == 'X'){
                    simbolo = 'O'; 
                }
                else{
                    simbolo = 'X';
                }
            }
            
        }
        
    }
    public int JogadaLinha(){
        System.out.println("Digite a linha que deseja fazer a jogada: ");
        return ler.nextInt();
    }
    public int JogadaColuna(){
        System.out.println("Digite a coluna que deseja fazer a jogada: ");
        return ler.nextInt();
    }
    public String VerificarVitoria(){
        int cont;
        char letra;
        int cont2;
        char letra2;
        int quant;
        for(int i = 0; i < 3; i++){
            cont = 0;
            letra = malha[i][0].getLetra();
            for(int j = 0; j < 3; j++){
                 if(malha[i][j].getLetra() == letra && malha[i][j].getLetra()!= ' '){
                     cont++;
            }
             }
             if(cont == 3){
                 return "O resultada da partida eh: vitoria de "+letra;
             }
        }
        for(int j = 0; j < 3; j++){
            cont = 0;
            letra = malha[j][0].getLetra();
             for(int i = 0; i < 3; i++){
                 if(malha[i][j].getLetra() == letra && malha[i][j].getLetra()!= ' '){
                     cont++;
                 }   
             }
             if(cont == 3){
                 return "O resultada da partida eh: vitoria de "+letra;
             }
        }
        cont = 0;
        cont2 = 0;
        letra = malha[0][0].getLetra();
        letra2 = malha[0][2].getLetra();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(j == i){
                    if(malha[i][j].getLetra() == letra && malha[i][j].getLetra()!= ' '){
                        cont++;
                    }
                }
                else if(j+i == 2){
                    if(malha[i][j].getLetra() == letra && malha[i][j].getLetra()!= ' '){
                        cont2++;
                    }
                }
            }
             if(cont == 3 || cont2 == 3){
                 return "O resultada da partida eh: vitoria de "+letra;
             }
        }
        quant = 0;
        for(int j = 0; j < 3; j++){
             for(int i = 0; i < 3; i++){
                 if(malha[i][j].getLetra()!= ' '){
                     quant++;
                 }   
             }
        }
        if(quant == 9){
            return "O resultada da partida eh: empate";
        }
        return "";
    }
    public void Desenhar(){
        LimparTela();
        System.out.println("     0    1    2 ");
        System.out.printf("  0  %c | %c | %c \n", malha[0][0].getLetra(), malha[0][1].getLetra(), malha[0][2].getLetra());
        System.out.println("     ------------");
        System.out.printf("  1  %c | %c | %c \n", malha[1][0].getLetra(), malha[1][1].getLetra(), malha[1][2].getLetra());
        System.out.println("     ------------");
        System.out.printf("  2  %c | %c | %c \n", malha[2][0].getLetra(), malha[2][1].getLetra(), malha[2][2].getLetra());
    }
     public void LimparTela(){
         for(int c = 0; c < 200; c++){
             System.out.println("");   
         }
     }
     public boolean VerificarJogada(){
         int l = JogadaLinha();
         int c = JogadaColuna();
         if(malha[l][c].getLetra() == ' '){
             malha[l][c].setLetra(simbolo);
             return true;
         }
         else{
             return false;
         }
     }
     public void Inicio(){
         for(int i = 0; i < 3; i++){
             for(int j = 0; j < 3; j++){
                 malha[i][j]=new Malha();
             }
             
         }
     }
}
