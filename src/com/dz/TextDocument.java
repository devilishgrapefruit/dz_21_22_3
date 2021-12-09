package com.dz;

public class TextDocument implements IDocument{
    String type = "Text document";

    @Override
    public String getType() {
        return type;
    }
}
