package com.dz;

public class MusicDocument  implements IDocument{
    String type = "Music document";

    @Override
    public String getType() {
        return type;
    }
}
