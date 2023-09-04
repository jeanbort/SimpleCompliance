package com.emvista.simplecompliance;

import com.emvista.simplecompliance.domain.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DomainTest {

    @Test
    void nbTokenTest() {
        Token simpleGauge = new Token();

        Assertions.assertEquals(0, simpleGauge.nbToken(""));
        Assertions.assertEquals(0, simpleGauge.nbToken(null));
        Assertions.assertEquals(1, simpleGauge.nbToken("Hello"));
        Assertions.assertEquals(3, simpleGauge.nbToken("Hello my world"));

    }

}
