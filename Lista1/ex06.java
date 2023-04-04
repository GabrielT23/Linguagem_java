package Lista1;
import java.util.Scanner;
public class ex06 {
     public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float a, b, c;
                String alt;
		System.out.print("Digite o lado a do triangulo: \n");
                a = ler.nextFloat();
		System.out.println("Digite o lado b do triangulo: ");
                b = ler.nextFloat();
                System.out.println("Digite o lado c do triangulo: ");
                c = ler.nextFloat();
		if ((a < b+c) && (b <a+b) && (c <a+b)) {
                    if((a==b) && (b==c)){
                        System.out.println("Os lados a, b e c formam um triagulo equilatero.");
                    }
                    else if((a==b) || (b==c) || (a==c)){
                        System.out.println("Os lados a, b e c formam um triagulo isoceles.");
                    }
                    else{
                        System.out.println("Os lados a, b e c formam um triagulo escaleno.");
                    }
                }
                else{
                    System.out.println("Os lados a, b e c nao podem formar um triagulo.");
                }
	}
}
