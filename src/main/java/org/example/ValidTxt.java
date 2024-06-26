package org.example;

import org.apache.tika.Tika;

import java.io.IOException;

public class ValidTxt implements Handler{

    private Handler proximoHandler;

    @Override
    public void setProximoHandler(Handler handler) {
        this.proximoHandler = handler;
    }

    @Override
    public void validarDocument(Documento documento) throws IOException {
        Tika tika = new Tika();
        String mimeType = tika.detect(documento.getArquivo());
        if (mimeType.equals("text/plain")) {
            System.out.println("Documento em formato TXT válido.");
        } else if (proximoHandler != null) {
            proximoHandler.validarDocument(documento);
        } else {
            System.out.println("Formato de documento não suportado.");
        }
    }
}
