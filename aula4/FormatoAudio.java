//Implementação de interface Crie uma interface chamada "FormatoAudio" com os
//seguintes métodos:
//● abrir(String arquivo): abre o arquivo de áudio especificado.
//● reproduzir(): reproduz o arquivo de áudio.
//● pausar(): pausa a reprodução do arquivo de áudio.
//● parar(): interrompe a reprodução do arquivo de áudio. 
//Implemente a
//interface "FormatoAudio" em duas classes chamadas "MP3Player" e
//"WAVPlayer". Forneça uma implementação adequada para cada
//método em ambas as classes. Em seguida, crie instâncias de
//MP3Player e WAVPlayer e teste os métodos implementados

package aula4;
//Implementação de interface Crie uma interface chamada "FormatoAudio" 
public interface FormatoAudio {
	//métodos:
	//● abrir(String arquivo): abre o arquivo de áudio especificado.
	//● reproduzir(): reproduz o arquivo de áudio.
	//● pausar(): pausa a reprodução do arquivo de áudio.
	//● parar(): interrompe a reprodução do arquivo de áudio.
    void abrir(String arquivo);
    void reproduzir();
    void pausar();
    void parar();
}

