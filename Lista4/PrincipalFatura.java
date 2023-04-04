package Lista4;
public class PrincipalFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        Registrar registrar = new Registrar(); 
        registrar.fatura(fatura);
        fatura.getexibir();
    }
}
