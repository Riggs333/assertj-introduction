package de.codecentric;

import org.junit.jupiter.api.Test;

import static de.codecentric.MarvelCharacterAssert.assertThat;

class A11_MarvelCharacterUsingGeneratedAssertionTest extends MarvelCharacterTestData {

    @Test
    void useGeneratedAssertions() {
        assertThat(capAmerica)
                .hasHome(Location.EARTH)
                .hasRealName("Steve");
    }

}
