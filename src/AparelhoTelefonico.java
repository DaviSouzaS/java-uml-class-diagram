public class AparelhoTelefonico extends Iphone {

    private Integer telefone; 

    public AparelhoTelefonico(Integer telefone) {
        super("Iphone 2007");
        this.telefone = telefone;
    }

    protected void ligar() {
        String nome = this.nome; 
 
        System.out.println("Aparelho " + '"' + nome + '"' + " ligando para " + telefone);
    }
 
    protected void atender() {
        System.out.println("Atendendo ligação de " + telefone);
    }
 
    protected void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
