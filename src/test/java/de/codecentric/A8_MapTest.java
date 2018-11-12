package de.codecentric;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class A8_MapTest extends MarvelCharacterTestData implements WithAssertions {

    @Test
    void mapChecks() {
        Map<MarvelCharacter, String> colorsOfAvengers = Map.of(
                capAmerica, "blue",
                ironMan, "red",
                hulk, "green");

        assertThat(colorsOfAvengers)
                .hasSize(3)
                .contains(entry(ironMan, "red"))
                .containsKeys(capAmerica, hulk)
                .containsValues("green", "blue");
    }
}
