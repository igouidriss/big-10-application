package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table9TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table9Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table9.class);
        Table9 table91 = getTable9Sample1();
        Table9 table92 = new Table9();
        assertThat(table91).isNotEqualTo(table92);

        table92.setId(table91.getId());
        assertThat(table91).isEqualTo(table92);

        table92 = getTable9Sample2();
        assertThat(table91).isNotEqualTo(table92);
    }
}
