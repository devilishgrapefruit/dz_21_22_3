package com.dz;

public class ImageDocument  implements IDocument{
    String type = "Image document";

    @Override
    public String getType() {
        return type;
    }
}
