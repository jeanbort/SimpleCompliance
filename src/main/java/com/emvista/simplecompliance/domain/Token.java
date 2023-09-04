package com.emvista.simplecompliance.domain;

public class Token {

    public int nbToken(String text) {
        if (text == null || text.isEmpty())
            return 0;
        return text.split(" ").length;
    }

}
