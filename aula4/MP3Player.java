
//Implemente a
//interface "FormatoAudio" em duas classes chamadas "MP3Player" e
//"WAVPlayer". Forneça uma implementação adequada para cada
//método em ambas as classes. Em seguida, crie instâncias de
//MP3Player e WAVPlayer e teste os métodos implementados
package aula4;

public class MP3Player implements FormatoAudio {
    private String arquivo;

    @Override
    public void abrir(String arquivo) {
        this.arquivo = arquivo;
        System.out.println("MP3Player abrindo o arquivo: " + arquivo);
    }

    @Override
    public void reproduzir() {
        System.out.println("MP3Player reproduzindo o arquivo: " + arquivo);
    }

    @Override
    public void pausar() {
        System.out.println("MP3Player pausando a reprodução do arquivo: " + arquivo);
    }

    @Override
    public void parar() {
        System.out.println("MP3Player interrompendo a reprodução do arquivo: " + arquivo);
    }
}

class WAVPlayer implements FormatoAudio {
    private String arquivo;

    @Override
    public void abrir(String arquivo) {
        this.arquivo = arquivo;
        System.out.println("WAVPlayer abrindo o arquivo: " + arquivo);
    }

    @Override
    public void reproduzir() {
        System.out.println("WAVPlayer reproduzindo o arquivo: " + arquivo);
    }

    @Override
    public void pausar() {
        System.out.println("WAVPlayer pausando a reprodução do arquivo: " + arquivo);
    }

    @Override
    public void parar() {
        System.out.println("WAVPlayer interrompendo a reprodução do arquivo: " + arquivo);
    }
}



