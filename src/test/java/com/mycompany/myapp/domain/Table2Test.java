package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table2TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table2Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table2.class);
        Table2 table21 = getTable2Sample1();
        Table2 table22 = new Table2();
        assertThat(table21).isNotEqualTo(table22);

        table22.setId(table21.getId());
        assertThat(table21).isEqualTo(table22);

        table22 = getTable2Sample2();
        assertThat(table21).isNotEqualTo(table22);
    }
}
