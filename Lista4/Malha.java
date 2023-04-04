package Lista4;
public class Malha {
    private char letra;
    public Malha(){
        this.letra = ' ';
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        if(this.letra == ' '){
            this.letra = letra;
        }
        else{
            System.out.println("Não eh possivel fazer essa jogada");
        }
    }
}
