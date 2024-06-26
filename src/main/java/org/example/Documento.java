package org.example;

import java.io.File;

public class Documento {

    private File arquivo;

    public Documento(String caminhoArquivo) {
        this.arquivo = new File(caminhoArquivo);
    }

    public File getArquivo() {
        return arquivo;
    }

}
