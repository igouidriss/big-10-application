package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table8TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table8Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table8.class);
        Table8 table81 = getTable8Sample1();
        Table8 table82 = new Table8();
        assertThat(table81).isNotEqualTo(table82);

        table82.setId(table81.getId());
        assertThat(table81).isEqualTo(table82);

        table82 = getTable8Sample2();
        assertThat(table81).isNotEqualTo(table82);
    }
}
