package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table3TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table3Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table3.class);
        Table3 table31 = getTable3Sample1();
        Table3 table32 = new Table3();
        assertThat(table31).isNotEqualTo(table32);

        table32.setId(table31.getId());
        assertThat(table31).isEqualTo(table32);

        table32 = getTable3Sample2();
        assertThat(table31).isNotEqualTo(table32);
    }
}
