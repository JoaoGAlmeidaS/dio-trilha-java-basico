package main;
import funcionalidades.IPhone;

public class Main {

	public static void main(String[] args) {
		IPhone meuIphone = new IPhone();

        // Testando Aparelho Telefônico
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Bohemian Rhapsody");

        // Testando Navegador na Internet
        meuIphone.exibirPagina("www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
	}

}
