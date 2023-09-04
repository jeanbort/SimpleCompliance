package com.emvista.simplegauge;

public class SimpleGauge {

    public int nbToken(String text) {
        if (text == null || text.isEmpty())
            return 0;
        return text.split(" ").length;
    }

}
