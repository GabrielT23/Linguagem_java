package Lista4;

import java.util.Scanner;

public class Empregado {
    private String PrimeiroNome;
    private String Sobrenome;
    private double SalarioMensal;
    Scanner ler = new Scanner(System.in);
    public Empregado(){
        PrimeiroNome = "Admin";
        Sobrenome = "Admin";
        SalarioMensal = 0;
        
    }
    public void setPrimeiroNome(String nome){
        PrimeiroNome = nome;
    }
    public String getPrimeiroNome(){
        return PrimeiroNome;
    }
    public void setSobrenome(String sobrenome){
        Sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return Sobrenome;
    }
    public void setSalarioMensal(double salario){
        SalarioMensal = salario;
        if(SalarioMensal < 0){
            SalarioMensal = 0;
        }
    }
    public double getSalarioMensal(){
        return SalarioMensal;
    }
    public void getexibir(){
        System.out.println("primeira nome: "+PrimeiroNome);
        System.out.println("sobrenome: "+Sobrenome);
        System.out.println("salario anual: "+SalarioMensal*12);
        System.out.println("salario anual com aumento: "+SalarioMensal*12*1.1);
    }
    
}
