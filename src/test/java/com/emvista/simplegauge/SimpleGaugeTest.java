package com.emvista.simplegauge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleGaugeTest {

    @Test
    void nbTokenTest() {
        SimpleGauge simpleGauge = new SimpleGauge();

        Assertions.assertEquals(0, simpleGauge.nbToken(""));
        Assertions.assertEquals(0, simpleGauge.nbToken(null));
        Assertions.assertEquals(1, simpleGauge.nbToken("Hello"));
        Assertions.assertEquals(3, simpleGauge.nbToken("Hello my world"));

    }

}
