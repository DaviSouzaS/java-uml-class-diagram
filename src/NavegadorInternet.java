public class NavegadorInternet extends Iphone {

    public NavegadorInternet() {
        super("Iphone 2007");
    }

    protected void exibirPagina() {
        String nome = this.nome; 
 
        System.out.println("Página aberta no dispositivo " + nome);
    }
 
    protected void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }
 
    protected void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
