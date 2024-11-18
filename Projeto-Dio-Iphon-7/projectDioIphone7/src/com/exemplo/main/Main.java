package com.exemplo.main;

import com.exemplo.iphone.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando o reprodutor musical
        meuIphone.getReprodutorMusical().selecionarMusica("Minha Música Favorita");
        meuIphone.getReprodutorMusical().tocar();
        meuIphone.getReprodutorMusical().pausar();

        // Testando o aparelho telefônico
        meuIphone.getAparelhoTelefonico().ligar("123456789");
        meuIphone.getAparelhoTelefonico().atender();
        meuIphone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando o navegador de internet
        meuIphone.getNavegadorInternet().exibirPagina("https://www.example.com");
        meuIphone.getNavegadorInternet().adicionarNovaAba();
        meuIphone.getNavegadorInternet().atualizarPagina();
    }
}