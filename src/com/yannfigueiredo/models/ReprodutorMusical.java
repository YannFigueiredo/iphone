package com.yannfigueiredo.models;

public interface ReprodutorMusical extends Reprodutor {
    public void selecionarMusica(String musica);
    public void selecionarArtista(String artista);
    public void selecionarAlbum(String album);
    public void selecionarAudioBook(String audioBook);
    public void tocarMusica();
    public void pausarMusica();
    public void avancarMusica();
    public void retrocederMusica();
}
