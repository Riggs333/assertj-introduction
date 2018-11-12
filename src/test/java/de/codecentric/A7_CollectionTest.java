package de.codecentric;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util.List;

import static de.codecentric.Location.EARTH;
import static org.assertj.core.api.Assertions.assertThat;

class A7_CollectionTest extends MarvelCharacterTestData {

    @Test
    void simpleContains() {
        List<String> strings =
                List.of("foo", "bar", "foobar", "foo");

        assertThat(strings)
                .contains("bar", Index.atIndex(1));
    }

    @Test
    void collectionTest() {
        Iterable<MarvelCharacter> avengers =
                List.of(capAmerica, ironMan, thor);

        assertThat(avengers)
                .isNotEmpty()
                .hasSize(3)
                .contains(capAmerica, ironMan)
                .doesNotContain(loki)
                .containsExactly(capAmerica, ironMan, thor)
                .containsExactlyInAnyOrder(ironMan, thor, capAmerica);

        assertThat(avengers)
                .first()
                .isEqualTo(capAmerica);
    }

    @Test
    void extractingTests() {
        Iterable<MarvelCharacter> avengers =
                List.of(capAmerica, ironMan, hulk);

        assertThat(avengers)
                .extracting(MarvelCharacter::getRealName)
                .contains("Steve", "Tony", "Bruce")
                .doesNotContain("Clark");
    }

    @Test
    void filtering() {
        Iterable<MarvelCharacter> avengers =
                List.of(capAmerica, ironMan, thor);

        assertThat(avengers)
                .filteredOn(mv -> mv.getHome() == EARTH)
                .containsOnly(ironMan, capAmerica);
    }

}
