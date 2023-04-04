package Lista1;
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sexo;
		double altura, peso, estaturaBR, estaturaAl;
		System.out.println("Qual o seu sexo?[M/F]");
		sexo = ler.nextLine();
		System.out.println("Digite sua altura em metros:");
		altura = ler.nextDouble();
		if (sexo.equals("m")) {
			peso = (72.7 * altura)-58;
			estaturaBR = Math.abs(altura - 1.743);
			estaturaAl = Math.abs(altura - 1.813);
			System.out.println("Seu peso ideal eh: " + peso);
			if (estaturaBR < estaturaAl){
				System.out.println("Sua estatura eh mais proxima da estatura brasileira.");
			}
			else {
				System.out.println("Sua estatura eh mais proxima da estatura da alemanha.");
			}
		}
		else {
			peso = (62.1 * altura)-44.7;
			estaturaBR = Math.abs(altura - 1.67);
			estaturaAl = Math.abs(altura - 1.611);
			System.out.println("Seu peso ideal eh: " + peso + "kg");
			if (estaturaBR < estaturaAl){
				System.out.println("Sua estatura eh mais proxima da estatura brasileira.");
			}
			else {
				System.out.println("Sua estatura eh mais proxima da estatura da alemanha.");
			}
		}
	}
}
