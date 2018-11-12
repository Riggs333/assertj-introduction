package de.codecentric;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class A3_FieldByFieldTest implements WithAssertions {

    @Test
    void expectToBeEqual() {
        var ironMan =
                new MarvelCharacter("Iron Man", "Tony", Location.EARTH);
        var ironMan2 =
                new MarvelCharacter("Iron Man", "Tony", Location.EARTH);

        assertThat(ironMan)
                .isEqualToComparingFieldByField(ironMan2);
    }

}
