package Lista1;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cod, nas, ing, idade, tempoT;
                String alt;
		System.out.println("Qual o codigo do funcionario? ");
                cod = ler.nextInt();
		System.out.println("data de nascimento do funcionario: ");
                nas = ler.nextInt();
                idade = 2021 - nas;
                System.out.println("data de ingresso do funcionario na empresa: ");
                ing = ler.nextInt();
                tempoT = 2021 - ing;
		if ((idade >= 65) || (tempoT >= 30) || ((idade >= 60) && (tempoT >= 25))) {
                    System.out.println("Requerer aposentadoria");
                }
                else{
                    System.out.println("Nao requerer");
                }
	}
}
