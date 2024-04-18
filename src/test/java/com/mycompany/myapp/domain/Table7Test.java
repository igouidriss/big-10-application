package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table7TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table7Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table7.class);
        Table7 table71 = getTable7Sample1();
        Table7 table72 = new Table7();
        assertThat(table71).isNotEqualTo(table72);

        table72.setId(table71.getId());
        assertThat(table71).isEqualTo(table72);

        table72 = getTable7Sample2();
        assertThat(table71).isNotEqualTo(table72);
    }
}
