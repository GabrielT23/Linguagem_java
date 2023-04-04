package Lista1;
import java.util.Scanner;
public class ex02 {
     public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, notaf, media;
                int frequencia;
		System.out.println("Qual o indice de frequencia do aluno?");
                frequencia = ler.nextInt();
		if (frequencia >=  75) {
			System.out.println("Digite a primeira nota do aluno");
                        nota1 = ler.nextDouble();
                        System.out.println("Digite a segunda nota do aluno");
                        nota2 = ler.nextDouble();
                        media = (nota1+nota2)/2;
			if (media >= 4 && media < 7){
                            System.out.println("Digite a nota da AF do aluno");
                            notaf = ler.nextDouble();
                            media = (media+notaf)/2;
                            if(media >= 5){
                                System.out.println("O aluno esta aprovado");
                            }
                            else{
                                System.out.println("O aluno esta reprovado");
                            }
			}
			else {
                             System.out.println("O aluno esta aprovado");
			}
		}
		else {
                    System.out.println("O aluno esta reprovado");
		}
	}
}
