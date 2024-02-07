package com.vehiclesale.backend.model.document;

import java.util.UUID;

public class DocumentHtml extends AbstractDoc {


    public DocumentHtml() {}

    public DocumentHtml(String content) {
        super(content);
    }   
   
    @Override    
    public String getContent() {
        return super.getContent();
    }   
    
    @Override
    public void setContent(String content) {
        super.setContent(content);
    }


    @Override
    public void setId(UUID id) {
        super.setId(getId());
    }

    @Override
    public UUID getId() {
        return super.getId();
    }


}
