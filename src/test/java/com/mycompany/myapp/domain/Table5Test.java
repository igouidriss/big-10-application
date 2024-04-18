package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table5TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table5Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table5.class);
        Table5 table51 = getTable5Sample1();
        Table5 table52 = new Table5();
        assertThat(table51).isNotEqualTo(table52);

        table52.setId(table51.getId());
        assertThat(table51).isEqualTo(table52);

        table52 = getTable5Sample2();
        assertThat(table51).isNotEqualTo(table52);
    }
}
