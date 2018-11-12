package de.codecentric;

import org.junit.jupiter.api.Test;

import static de.codecentric.MarvelCharacterHandWrittenAssert.assertThat;

class A10_MarvelCharacterTest extends MarvelCharacterTestData {

    @Test
    void customAssertions() {
        assertThat(capAmerica)
                .hasRealName("Steve");
    }

}