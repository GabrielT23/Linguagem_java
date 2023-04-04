package Lista3;
public class ex02 {
    public static void Imprimir(int [] vet){
        for(int i =0 ; i < vet.length; i++){
            System.out.println(" " + i + ": "+ vet[i]);
        }
   }
    public static void PreencherVet(int [] vet){
        for(int i =0 ; i < vet.length; i++){
            vet[i] = (int) ((Math.random()* 150) -30);
        }
   }
    public static int Q2(int vet[], int n){
         if(n < vet.length){
             return vet[n]+Q2(vet, n+1);
         }
         else{
         return 0;
         }
     }
    public static void main(String[] args) {
        int retorno;
        int vet[] = new int[50];
        PreencherVet(vet);
        Imprimir(vet);
        retorno = Q2(vet, 0);
        System.out.println("A soma dos numeros do vetor eh: "+retorno);
    }
}
