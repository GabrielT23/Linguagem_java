package Lista4;
public class PrincipalEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        Registrar registro = new Registrar();
        registro.empregado(empregado1);
        registro.empregado(empregado2);
        empregado1.getexibir();
        empregado2.getexibir();
    }
}
