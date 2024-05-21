package com.yannfigueiredo.models;

public interface ReprodutorVideo extends Reprodutor {
    public void selecionarVideo(String video);
    public void ativarWideScreen();
    public void desativarWideScreen();
    public void tocarVideo();
    public void pausarVideo();
    public void avancarVideo();
    public void retrocederVideo();
}
