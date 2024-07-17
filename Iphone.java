public class Iphone implements AparelhoTelefonico,Navegador,ReprodutorMusical  {
    public static void main(String[] args) {

    }

    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    public void exibirPagina(String URL) {
        System.out.println("Exibindo pagina " + URL);
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
    public void adicionarAba() {
        System.out.println("Adicionando aba");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }
    public void tocar() {
        System.out.println("Tocando musica");
    }
    public void pausar() {
        System.out.println("Pausando musica");
    }
}