package de.codecentric;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class A4_OptionalTest extends MarvelCharacterTestData implements WithAssertions {

    @Test
    void dont_get_inside_assertThat() {
        Optional<String> foo = Optional.empty();
        //FIXME this will fail
        assertThat(foo.get()).isEqualTo("bar");
    }

    @Test
    void be_idiomatic() {
        Optional<String> foo = Optional.of("bar");
        assertThat(foo)
                .isPresent()
                .isNotEmpty()
                .contains("bar")
                .hasValue("bar");
    }

    @Test
    void complexObjectWrappedInOptional() {
        Optional<MarvelCharacter> hero = Optional.of(ironMan);

        assertThat(hero)
                .hasValue(ironMan);

        assertThat(hero)
                .get()
                .isEqualToComparingFieldByFieldRecursively(ironMan);

        assertThat(hero)
                .usingFieldByFieldValueComparator()
                .contains(ironMan);
    }

}
