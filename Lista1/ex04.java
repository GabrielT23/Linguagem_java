package Lista1;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sexo;
		int anoi, mesi, diai, anof, mesf, diaf, horai, mini, horaf, minf, tempi, tempf, dtemp;
		System.out.println("data inicial");
                
                System.out.println("ano: ");
		anoi = ler.nextInt(); 
                anoi = anoi*525600;
                
                System.out.println("mes: ");
		mesi = ler.nextInt();
                mesi = mesi*43800;
                
                System.out.println("dia: ");
		diai = ler.nextInt();
                diai = diai*1440;
                
                System.out.println("hora: ");
		horai = ler.nextInt();
                horai = horai*60;
                
                System.out.println("minuto: ");
		mini = ler.nextInt();
                
                tempi = anoi+mesi+diai+horai+mini;
                
                System.out.println("data final");
                
                System.out.println("ano: ");
		anof = ler.nextInt();
                anof = anof*525600;
                
                System.out.println("mes: ");
		mesf = ler.nextInt();
                mesf = mesf*43800;
                
                System.out.println("dia: ");
		diaf = ler.nextInt();
                diaf = diaf*1440;
                
                System.out.println("hora: ");
		horaf = ler.nextInt();
                horaf = horaf*60;
                
                System.out.println("minuto: ");
		minf = ler.nextInt();
		
                tempf = anof+mesf+diaf+horaf+minf;
                dtemp = tempf-tempi;
                if(dtemp < 0){
                    System.out.println("intervalo invalido");
                }
                else{
                    System.out.println("Quantidade de minutos passados: " + dtemp);
                }
	}
}
