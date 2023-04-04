package Lista2;

import java.util.Scanner;

public class CalculadoraEspecial {
    
    public static void PreencherVet(int [] vet){
        for(int i =0 ; i < vet.length; i++){
            vet[i] = (int) ((Math.random()* 150) -30);
        }
   }
     public static void Imprimir(int [] vet){
        for(int i =0 ; i < vet.length; i++){
            System.out.print(" " + i + ": "+ vet[i]+" ");
        }
        System.out.println("");
   }
    public static int Pesquisa(int [] vet, int num){
        int cont = 0;
        while(cont < vet.length){
            if(vet[cont] == num){
                return cont;
            }
            cont++;
        }
        return -1;
   }
    public static int PesquisaIn(int [] vet, int num){
        return vet[num];
   }
    public static void Separar(int [] vet1, int [] vet2, int [] vet3){
        int negativo = 0;
        int positivo = 0;
        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i]<0) {
		vet2[negativo] = vet1[i];
		negativo++;
            }
            else if (vet1[i]>0) {
            vet3[positivo] = vet1[i];
            positivo++;
            }
	}
        Imprimir(vet2);
        Imprimir(vet3);
   }
    public static int Somatorio(int [] vet){
        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
   }
    public static int Produto(int [] vet){
        int mult = 1;
        for (int i = 0; i < vet.length; i++) {
            mult *= vet[i];
        }
        return mult;
   }
    public static int ProdutoEscalar(int [] vet1, int [] vet2){
        int prodvet = 0;
        for (int i = 0; i < vet1.length; i++) {
            prodvet += vet1[i]*vet2[i];
        }
        return prodvet;
   }
    public static int[] Completazero(int [] vet1, int num){
        int vet2 [] = new int[vet1.length];
        int cont = 0;
        int cont2;
        while(cont < vet1.length){
            vet2[cont] = vet1[cont];
            if(vet1[cont] == num){
                cont++;
                vet2[cont] = vet1[cont];
                cont2 = cont;
                while(cont2 < vet1.length){
                    vet2[cont2] = 0;
                    cont2++;
                }
                return vet2;
            }
            cont++;
        }
        return vet2;
   }
    public static void Quadrado(int [] vet){
        for (int i = 0; i < vet.length; i++) {
            vet[i] = vet[i]*vet[i];
        }
   }
    public static double Media(int [] vet){
        double media;
        media = Somatorio(vet)/vet.length;
        return media;
   }
    public static int Max(int [] vet){
        int maior = 0;
        for (int i = 0; i < vet.length; i++) {
            if(i == 0){
                maior = vet[i];
            }
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        return maior;
   }
    public static int Min(int [] vet){
        int menor = 0;
        for (int i = 0; i < vet.length; i++) {
            if(i == 0){
                menor = vet[i];
            }
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        return menor;
   }
    public static int Unimodal(int [] vet){
        int moda = 0;
        int rep = 0;
        int valModa = 0;
        for (int i = 0; i < vet.length; i++) {
            rep = 0;
            for (int j = 0; j < vet.length; j++) {
                if(vet[i] == vet[j]){
                    rep++;
                }
            }
            if(rep > valModa){
                valModa = rep;
                moda = vet[i];
            }
        }
        return moda;
   }
    public static double Mediana(int [] vet){
        vet = Ordenacao(vet);
        Imprimir(vet);
        double mediana;
        if(vet.length/2 % 2 == 0){
            mediana = (vet[vet.length/2-1]+vet[vet.length/2])/2;
        }
        else{
            mediana = vet[vet.length/2];
        }
        return mediana;
   }
    public static double DesvioPadrao(int [] vet){
        double media = Media(vet);
        int variancia = 0;
        double desviopadrao;
        for (int i = 0; i < vet.length; i++) {
            variancia += Math.abs(vet[i] - media)*Math.abs(vet[i] - media);
        }
        variancia /= vet.length;
        desviopadrao = Math.sqrt(variancia);
        return desviopadrao;
   }
    public static int [] Uniao(int [] vet, int [] vet2){
        int vet3[] = new int [2*vet.length];
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
          vet3[cont] = vet[i];
          cont++;
        }
        for (int i = 0; i < vet.length; i++) {
          vet3[cont] = vet2[i];
          cont++;
        }
        return vet3;
   }
    public static int [] Inversao(int [] vet){
        int vet2 [] = new int [vet.length];
        int inverso = vet.length - 1;
        for (int i = 0; i < vet.length; i++) {
          vet2[inverso] = vet[i];
          inverso--;
        }
        
        return vet2;
   }
     public static int [] Intersecao(int [] vet, int [] vet2){
        int vet3[] = new int [vet.length];
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if(vet[i] == vet2[j]){
                    vet3[cont] = vet[i];
                    cont++;
                }
            }
        }
        if(cont == 0){
            int vazio[] = {}; 
            return vazio;
        }
        return vet3;
   }
     public static int [] Diferenca(int [] vet, int [] vet2){
        int vet3[] = new int [vet.length];
        int cont = 0;
        int contD = 0;
        for (int i = 0; i < vet.length; i++) {
            contD = 0;
            for (int j = 0; j < vet.length; j++) {
                if(vet[i] == vet2[j]){
                    contD++;
                }
            }
            if(contD == 0){
                vet3[cont] = vet[i];
                cont++;
            }
        }
        if(cont == 0){
            int vazio[] = {}; 
            return vazio;
        }
        return vet3;
   }
     public static int [] Ordenacao(int [] vet){
        int ord = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if(vet[i] < vet[j]){
                    ord = vet[i];
                    vet[i] = vet[j];
                    vet[j] = ord;
                }
            }
        }
        return vet;
   }
     public static int [] Primos(int [] vet){
        int contE = 0;
        int cont;
        int contP = 0;
        int vetP [] = new int[vet.length];
        while(contE < vet.length){
            cont = 0;
            for(int i = 1; i <= Math.abs(vet[contE]); i++){
                if(vet[contE] % i == 0){
                    cont++;
                }
            }
            if(cont == 2){
                vetP[contP] = vet[contE];
                contP++;
            }
        contE++;
        }
        return vetP;
   }
    public static int [] Fibonacci(int [] vet){
        int[] fibonacci = new int[vet.length];
	int n1=1, n2=1, result=0, quant=0;
	while (result<=150) {
            result = n1+n2;
            n1 = n2;
            n2 = result;
            for (int i = 0; i < vet.length; i++) {
		if (vet[i]==n2) {
                    fibonacci[quant]=vet[i];
                    quant++;
		}
            }
	}
		if (quant == 0) {
			int[] vetvazio= {};
			return vetvazio;
		}
        return fibonacci;
      }
     public static void Agrupamento(int [] vet, int num){
        int cont = 0;
        vet = Ordenacao(vet);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < vet.length/num; j++) {
                System.out.print(" " + j + ": "+ vet[cont]+" ");
                cont++;
            }
            System.out.println("");
        }
   }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetA [] = new int [100];
        int vetB [] = new int [100];
        int vetC [] = new int [100];
        int vetD [] = new int [200];
        int opcao;
        int retorno, i;
        double retorno2;
        System.out.println("CALCULADORA ESPECIAL\n\n");
        System.out.println("1) pesquisa");
        System.out.println("2) pesquisa por indice");
        System.out.println("3) separação");
        System.out.println("4) somatorio");
        System.out.println("5) produto");
        System.out.println("6) produto escalar");
        System.out.println("7) completar com zero");
        System.out.println("8) quadrado");
        System.out.println("9) media");
        System.out.println("10) maximo");
        System.out.println("11) minimo");
        System.out.println("12) moda unimodal");
        System.out.println("13) mediana");
        System.out.println("14) desvio padrao");
        System.out.println("15) uniao");
        System.out.println("16) inversao");
        System.out.println("17) intersecao");
        System.out.println("18) diferenca-a");
        System.out.println("19) ordenacao");
        System.out.println("20) primos");
        System.out.println("21) fibonacci");
        System.out.println("22) agrupamento");
        System.out.println("Digite a opção:");
        opcao = ler.nextInt();
        switch (opcao){
            case 1:
                PreencherVet(vetA);
                Imprimir(vetA);
                System.out.println("Digite o numero que deseja pesquisar");
                retorno = ler.nextInt();
                i = Pesquisa(vetA, retorno);
                System.out.println("o numero " + retorno + " se encontra na posicao " + i);
                break;
            case 2:
                PreencherVet(vetA);
                Imprimir(vetA);
                System.out.println("Digite o indice que deseja pesquisar");
                i = ler.nextInt();
                retorno = Pesquisa(vetA, i);
                System.out.println("o numero " + retorno + " se encontra na posicao " + i);
                break;
            case 3:
                PreencherVet(vetA);
                Imprimir(vetA);
                Separar(vetA, vetB, vetC);
                break;
            case 4:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno = Somatorio(vetA);
                System.out.println("A soma dos elementos do vetor eh: "+retorno);
                break;
            case 5:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno = Produto(vetA);
                System.out.println("O produto dos elementos do vetor eh: "+retorno);
                break;
            case 6:
                PreencherVet(vetA);
                PreencherVet(vetB);
                Imprimir(vetA);
                Imprimir(vetB);
                retorno = ProdutoEscalar(vetA, vetB);
                System.out.println("O produto escalar entre os vetores eh: "+retorno);
                break;
            case 7:
                PreencherVet(vetA);
                Imprimir(vetA);
                System.out.println("Digite um numero para a partir dele preencher o vetor com zero: ");
                retorno = ler.nextInt();
                vetB = Completazero(vetA, retorno);
                Imprimir(vetB);
                break;
            case 8:
                PreencherVet(vetA);
                Imprimir(vetA);
                Quadrado(vetA);
                Imprimir(vetA);
                break;
            case 9:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno2 = Media(vetA);
                System.out.println("\nA media dos elementos do vetor eh: "+retorno2);
                break;
            case 10:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno = Max(vetA);
                System.out.println("\nO maior numero dentre os elementos do vetor eh: "+retorno);
                break;
            case 11:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno = Min(vetA);
                System.out.println("\nO menor numero dentre os elementos do vetor eh: "+retorno);
                break;
            case 12:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno = Unimodal(vetA);
                System.out.println("\nA moda dentre os elementos do vetor eh: "+retorno);
                break;
            case 13:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno2 = Mediana(vetA);
                System.out.println("\nA mediana dos elementos do vetor eh: "+retorno2);
                break;
            case 14:
                PreencherVet(vetA);
                Imprimir(vetA);
                retorno2 = DesvioPadrao(vetA);
                System.out.println("\nO desvio padrao dos elementos do vetor eh: "+retorno2);
                break;
            case 15:
                PreencherVet(vetA);
                Imprimir(vetA);
                PreencherVet(vetB);
                Imprimir(vetB);
                vetD = Uniao(vetA, vetB);
                Imprimir(vetD);
                break;
            case 16:
                PreencherVet(vetA);
                Imprimir(vetA);
                vetB = Inversao(vetA);
                Imprimir(vetB);
                break;
            case 17:
                PreencherVet(vetA);
                Imprimir(vetA);
                PreencherVet(vetB);
                Imprimir(vetB);
                vetC = Intersecao(vetA, vetB);
                if(vetC.length == 0){
                    System.out.println("Não ha intersecao");
                }
                else{
                    i =0;
                    while(i < vetC.length && (vetC[i] != 0 && vetC[i+1] != 0) ){
                    System.out.println(" " + i + ": "+ vetC[i]);
                    i++;
                }
                }
                break;
            case 18:
                PreencherVet(vetA);
                Imprimir(vetA);
                PreencherVet(vetB);
                Imprimir(vetB);
                vetC = Diferenca(vetA, vetB);
                if(vetC.length == 0){
                    System.out.println("Não ha diferenca");
                }
                else{
                    i =0;
                    while(i < vetC.length && (vetC[i] != 0 && vetC[i+1] != 0) ){
                    System.out.println(" " + i + ": "+ vetC[i]);
                    i++;
                }
                }
                break;
            case 19:
                PreencherVet(vetA);
                Imprimir(vetA);
                vetB = Ordenacao(vetA);
                Imprimir(vetB);
                break;
            case 20:
                PreencherVet(vetA);
                Imprimir(vetA);
                vetB = Primos(vetA);
                if(vetB.length == 0){
                    System.out.println("Não ha diferenca");
                }
                else{
                    i =0;
                    while(i < vetB.length && (vetB[i] != 0 && vetB[i+1] != 0) ){
                    System.out.println(" " + i + ": "+ vetB[i]);
                    i++;
                }
                }
                break;
            case 21:
                PreencherVet(vetA);
                Imprimir(vetA);
                vetB = Fibonacci(vetA);
                if(vetB.length == 0){
                    System.out.println("Não ha numeros pertencentes a Fibonacci");
                }
                else{
                    i =0;
                    while(i < vetB.length && (vetB[i] != 0 && vetB[i+1] != 0) ){
                    System.out.println(" " + i + ": "+ vetB[i]);
                    i++;
                }
                }
                break;
            case 22:
                PreencherVet(vetA);
                Imprimir(vetA);
                System.out.println("Digite o numero de partes que deseja separar o vetor");
                retorno = ler.nextInt();
                Agrupamento(vetA, retorno);
                break;
        }
    }
}
