package Lista4;

import java.util.Scanner;

public class PrincipalContato {
    public static void main(String[] args) {
       String nome;
       String endereco;
       String email;
       String observacao;
       float codigo;
       int telefone;
       int op;
       Scanner ler = new Scanner(System.in);
       System.out.println("Como deseja registrar o contato?");
       System.out.println("1) codigo\n2)codigo e nome\n3)codigo, nome e email\n4)telefone");
       op = ler.nextInt();
       switch (op){
           case 1:
               do{
                  System.out.println("Digite o codigo da pessoa: ");
                  codigo = ler.nextFloat();
               }while(codigo >= 1000 && codigo <= 9999);
               Contato contato = new Contato(codigo);
               contato.exibir();
               break;
           case 2:
               do{
                  System.out.println("Digite o codigo da pessoa: ");
                  codigo = ler.nextInt();
               }while(codigo >= 1000 && codigo <= 9999);
               System.out.println("Digite o nome da pessoa: ");
               nome = ler.next();
               Contato contato2 = new Contato(codigo, nome);
               contato2.exibir();
               break;
           case 3:
               do{
                  System.out.println("Digite o codigo da pessoa: ");
                  codigo = ler.nextInt();
               }while(codigo >= 1000 && codigo <= 9999);
               System.out.println("Digite o nome da pessoa: ");
               nome = ler.next();
               System.out.println("Digite o email da pessoa: ");
               email = ler.next();
               Contato contato3 = new Contato(codigo, nome, email);
               contato3.exibir();
               contato3.preenchido();
               break;
           case 4:
               do{
                  System.out.println("Digite o numero da pessoa: ");
                  telefone = ler.nextInt();
               }while(telefone >= 10000000 && telefone <= 99999999);
               Contato contato4 = new Contato(telefone);
               contato4.exibir();
               break;
       }
        
    } 
}
