package Lista4;
public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Registrar registrar = new Registrar();
        registrar.produto(produto);
        produto.ComprarProduto();
        
    }
    
}
