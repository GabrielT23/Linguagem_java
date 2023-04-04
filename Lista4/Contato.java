package Lista4;

import java.util.Scanner;

public class Contato {
    private String nome;
    private String endereco;
    private String email;
    private String observacao;
    private float codigo;
    private int telefone;
    Scanner ler = new Scanner(System.in);
    public Contato(float codigo){
        this.codigo = codigo;
        this.nome = "nulo"; 
        this.endereco = "nulo";
        this.email = "nulo";
        this.observacao = "nulo";
        this.telefone = 0;
    }
    public Contato(float codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;    
        this.endereco = "nulo";
        this.email = "nulo";
        this.observacao = "nulo";
        this.telefone = 0;
    }
    public Contato(float codigo, String nome, String email){
        this.codigo = codigo;
        this.nome = nome; 
        this.email = email;  
        this.endereco = "nulo";
        this.observacao = "nulo";
        this.telefone = 0;

    }
    public Contato(int telefone){
        this.codigo = 0;
        this.nome = "nulo"; 
        this.endereco = "nulo";
        this.email = "nulo";
        this.observacao = "nulo";
        this.telefone = telefone;    
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void exibir(){
        System.out.println("codigo: "+getCodigo());
        System.out.println("nome: "+getNome());
        System.out.println("endereco: "+getEndereco());
        System.out.println("email: "+getEmail());
        System.out.println("observacao: "+getObservacao());
        System.out.println("telefone: "+getTelefone());
    }
    public void preenchido(){
        if(codigo == 0 || nome == "nulo" || endereco == "nulo" || email == "nulo" || observacao == "nulo" || telefone == 0){
            System.out.println("Nao preenchido");  
        }
        else{
            System.out.println("Preenchido");
        }
    }
    public Contato duplicar(){
        Contato Ncontato = new Contato(this.codigo, this.nome, this.email);
        Ncontato.setEndereco(endereco);
        Ncontato.setObservacao(observacao);
        Ncontato.setTelefone(telefone);
        return Ncontato;
    }
    
    
}
