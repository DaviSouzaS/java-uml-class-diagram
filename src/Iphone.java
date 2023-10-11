public class Iphone {

    public String nome;

    public Iphone(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {

        System.out.println("------------------------------------------");

        AparelhoTelefonico aparelhoTel = new AparelhoTelefonico(99999999);
        aparelhoTel.ligar();
        aparelhoTel.atender();
        aparelhoTel.iniciarCorreioVoz();

        System.out.println("------------------------------------------");

        ReprodutorMusical playMusica = new ReprodutorMusical("Música 1");
        playMusica.tocar();
        playMusica.pausar();
        playMusica.selecionarMusica();

        System.out.println("------------------------------------------");

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        System.out.println("------------------------------------------");
    }
}
