package org.example;

import java.io.IOException;

public interface Handler {

    void setProximoHandler(Handler handler);
    void validarDocument(Documento documento) throws IOException;

}
