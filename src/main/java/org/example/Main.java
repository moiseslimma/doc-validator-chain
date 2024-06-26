package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Handler pdfHandler = new ValidPdf();
        Handler docxHandler = new ValidDocx();
        Handler txtHandler = new ValidTxt();

        pdfHandler.setProximoHandler(docxHandler);
        docxHandler.setProximoHandler(txtHandler);

        Documento doc1 = new Documento("caminho/para/arquivo.pdf");
        Documento doc2 = new Documento("caminho/para/arquivo.docx");
        Documento doc3 = new Documento("caminho/para/arquivo.txt");
        Documento doc4 = new Documento("caminho/para/arquivo.xls");

        pdfHandler.validarDocument(doc1);
        pdfHandler.validarDocument(doc2);
        pdfHandler.validarDocument(doc3);
        pdfHandler.validarDocument(doc4);
    }
}