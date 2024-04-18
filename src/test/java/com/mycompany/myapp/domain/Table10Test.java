package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table10TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table10Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table10.class);
        Table10 table101 = getTable10Sample1();
        Table10 table102 = new Table10();
        assertThat(table101).isNotEqualTo(table102);

        table102.setId(table101.getId());
        assertThat(table101).isEqualTo(table102);

        table102 = getTable10Sample2();
        assertThat(table101).isNotEqualTo(table102);
    }
}
