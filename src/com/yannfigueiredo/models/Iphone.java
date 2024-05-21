package com.yannfigueiredo.models;

public class Iphone implements ReprodutorMusical, ReprodutorVideo, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Site com URL " + url + " acessado");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualiazada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada");
    }

    @Override
    public void selecionarArtista(String artista) {
        System.out.println("Artista " + artista + " selecionado");
    }

    @Override
    public void selecionarAlbum(String album) {
        System.out.println("Álbum " + album + " selecionado");
    }

    @Override
    public void selecionarAudioBook(String audioBook) {
        System.out.println("Áudio Book " + audioBook + " selecionado");
    }

    @Override
    public void selecionarVideo(String video) {
        System.out.println("Vídeo " + video + " selecionado");
    }

    @Override
    public void ativarWideScreen() {
        System.out.println("WideScreen ativado");
    }

    @Override
    public void desativarWideScreen() {
        System.out.println("WideScreen desativado");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void tocarVideo() {
        System.out.println("Tocando vídeo");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void pausarVideo() {
        System.out.println("Pausando vídeo");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando música");
    }

    @Override
    public void avancarVideo() {
        System.out.println("Avançando vídeo");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo música");
    }

    @Override
    public void retrocederVideo() {
        System.out.println("Retrocedendo vídeo");
    }

    @Override
    public void ajustarVolume(int volume) {
        if(volume >= 0 && volume <= 100)
            System.out.println("Volume ajustado para " + volume);
        else
            System.out.println("Volume inválido!");
    }
}
