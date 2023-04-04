package Lista4;
public class Fatura {
    private int numero;
    private String descricao;
    private int quantidade;
    private double preco;
    public Fatura(){
        numero = 0;
        descricao = "Admin";
        preco = 0;
        quantidade = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        if(quantidade < 0){
            this.quantidade = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        if(preco < 0){
            this.preco = 0;
        }
    }
    public double getFatura(){
        return quantidade*preco;
    }
    public void getexibir(){
        System.out.println("numero: "+numero);
        System.out.println("descricao: "+descricao);
        System.out.println("preco: "+preco);
        System.out.println("quantidade: "+quantidade);
        System.out.println("fatura: "+getFatura());
    }
    
}
