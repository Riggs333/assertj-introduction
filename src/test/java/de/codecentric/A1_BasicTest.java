package de.codecentric;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class A1_BasicTest implements WithAssertions {

    @Test
    void nullability() {
        String nothing = null;
        String universe = "Marvel";
    }

    @Test
    void booleans() {
        boolean marvelIsCool = true;

        assertThat(marvelIsCool).isTrue();
    }

    @Test
    void what_is_wrong_with_that() {
        assertThat("Iron Man").isEqualTo("Batman");
    }

    @Test
    void withCustomMessage() {
        assertThat("Ant Man")
                .as("Check real cool superhero name")
                .isEqualTo("Spider Man");
    }
}
