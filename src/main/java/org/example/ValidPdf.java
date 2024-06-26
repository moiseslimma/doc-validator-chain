package org.example;

import org.apache.tika.Tika;

import java.io.IOException;

public class ValidPdf implements Handler{

    private Handler proximoHandler;


    @Override
    public void setProximoHandler(Handler handler) {
        this.proximoHandler = handler;
    }

    @Override
    public void validarDocument(Documento documento) throws IOException {
        Tika tika = new Tika();
        String mime = tika.detect(documento.getArquivo());
        if(mime.equals("application/pdf")) {
            System.out.println("Documento em formato PDF válido.");
        }
        else if (proximoHandler != null) {
            proximoHandler.validarDocument(documento);
        }
        else {
            System.out.println("Formato de documento não suportado.");
        }
    }

}
