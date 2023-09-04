package com.emvista.simplecompliance;

import com.emvista.simplecompliance.spark.domain.Token;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleGaugeSpec {
    @Step("with all text count nb token in <table>")
    public void nbTokenTest(Table table) {
        Token simpleGauge = new Token();
        for (TableRow tableRow : table.getTableRows()) {
            assertThat(Integer.parseInt(tableRow.getCell("nb_token"))).isEqualTo(simpleGauge.nbToken(tableRow.getCell("text")));
        }
    }
}
