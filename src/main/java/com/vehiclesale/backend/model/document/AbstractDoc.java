package com.vehiclesale.backend.model.document;

import java.util.UUID;

public abstract class AbstractDoc {

    private UUID id;
    private String content;
    
    public AbstractDoc() {}

    public AbstractDoc(String content) {
        this.content = content;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
