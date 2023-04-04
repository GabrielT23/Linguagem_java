package Lista4;

import java.util.Scanner;

public class Registrar {
    Empregado empregado = new Empregado();
    Scanner ler = new Scanner(System.in);
    public void empregado(Empregado empregado){
       String nome;
       String sobrenome;
       double salario;
       System.out.println("Digite o primeiro nome do empregado: ");
       nome = ler.next();
       empregado.setPrimeiroNome(nome);
       System.out.println("Digite o sobrenome do empregado: ");
       sobrenome = ler.next();
       empregado.setSobrenome(sobrenome);
       System.out.println("Digite o salario mensal do empregado: ");
       salario = ler.nextDouble();
       empregado.setSalarioMensal(salario);
    }
    public void fatura(Fatura faturaProd){
       System.out.println("Digite o numero do produto: ");
       faturaProd.setNumero(ler.nextInt());
       System.out.println("Digite A descricao do produto: ");
       faturaProd.setDescricao(ler.next());
       System.out.println("Digite o preco do produto: ");
       faturaProd.setPreco(ler.nextDouble());
       System.out.println("Digite o primeiro a quantidade do produto: ");
       faturaProd.setQuantidade(ler.nextInt());  
    }
    public void produto(Produto produto){
       System.out.println("Digite o nome do produto: ");
       produto.setNome(ler.next());
       System.out.println("Digite o preco do produto: ");
       produto.setPreco(ler.nextDouble());
       System.out.println("Digite o primeiro a quantidade do produto: ");
       produto.setQuantidade(ler.nextInt());   
    }
   
}
