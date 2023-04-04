package Lista4;

import java.util.Scanner;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    Scanner ler = new Scanner(System.in);
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        if(preco < 0){
            preco = 0;
        }
    }
    public void ComprarProduto(){
        int quant;
        getexibir();
        System.out.println("Quantos produtos deseja comprar? ");
        quant = ler.nextInt();
        quantidade -= quant;
        if(preco > 100 && preco <= 200){
            preco *= 0.9;
        }
        else if(preco > 200 && preco <= 500){
            preco *= 0.8;
        }
        else{
            preco *= 0.75;
        }
        System.out.println("Quantidade vendida: "+quant+"\npreco unitario com desconto: "+preco);
        System.out.println("preco a ser pago no total: "+quant*preco);
    }
    public void getexibir(){
        System.out.println("nome: "+nome);
        System.out.println("preco: "+preco);
        System.out.println("quantidade: "+quantidade);
    }
}
