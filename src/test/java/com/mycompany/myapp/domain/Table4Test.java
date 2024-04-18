package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table4TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table4Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table4.class);
        Table4 table41 = getTable4Sample1();
        Table4 table42 = new Table4();
        assertThat(table41).isNotEqualTo(table42);

        table42.setId(table41.getId());
        assertThat(table41).isEqualTo(table42);

        table42 = getTable4Sample2();
        assertThat(table41).isNotEqualTo(table42);
    }
}
