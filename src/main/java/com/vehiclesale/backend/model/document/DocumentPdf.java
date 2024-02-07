package com.vehiclesale.backend.model.document;

import java.io.File;

public class DocumentPdf {
   
    private File content;


    public DocumentPdf() {}

    public DocumentPdf(File content) {
        this.content = content;
    }

    public File getContent() {
        return content;
    }   

    public void setContent(File content) {
        this.content = content;
    }   
}
