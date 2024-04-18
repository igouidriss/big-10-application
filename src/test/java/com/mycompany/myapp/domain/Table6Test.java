package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table6TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table6Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table6.class);
        Table6 table61 = getTable6Sample1();
        Table6 table62 = new Table6();
        assertThat(table61).isNotEqualTo(table62);

        table62.setId(table61.getId());
        assertThat(table61).isEqualTo(table62);

        table62 = getTable6Sample2();
        assertThat(table61).isNotEqualTo(table62);
    }
}
