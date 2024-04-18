package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table1TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table1Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table1.class);
        Table1 table11 = getTable1Sample1();
        Table1 table12 = new Table1();
        assertThat(table11).isNotEqualTo(table12);

        table12.setId(table11.getId());
        assertThat(table11).isEqualTo(table12);

        table12 = getTable1Sample2();
        assertThat(table11).isNotEqualTo(table12);
    }
}
