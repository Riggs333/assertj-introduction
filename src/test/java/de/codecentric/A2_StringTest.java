package de.codecentric;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class A2_StringTest implements WithAssertions {

    @Test
    void all_Things_With_Strings() {
        assertThat("Marvel")
                .isEqualToIgnoringCase("MARVEL")
                .isNotBlank()
                .hasSize(6)
                .startsWith("Mar")
                .endsWith("vel")
                .contains("arv")
                .isInstanceOf(String.class);
    }
}
