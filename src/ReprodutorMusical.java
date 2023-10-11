public class ReprodutorMusical extends Iphone {

    public String musica;

    protected ReprodutorMusical(String musica) {
        super("Iphone 2007");
        this.musica = musica;
    }

    protected void tocar() {
       String nome = this.nome; 

       System.out.println("Música " + '"' + musica + '"' + " tocando no dispositivo " + nome);
    }

    protected void pausar() {
       System.out.println("Música pausada");
    }

    protected void selecionarMusica() {
       System.out.println("Música " +'"' + musica +'"'+ " selecionada");
    }
}
