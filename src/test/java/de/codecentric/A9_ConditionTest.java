package de.codecentric;

import org.assertj.core.api.Condition;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class A9_ConditionTest extends MarvelCharacterTestData implements WithAssertions {

    @Test
    void conditions() {
        var heroes = List.of(capAmerica, ironMan, thor, loki);
        var villains = List.of(loki, thanos);

        Condition<MarvelCharacter> hero = new Condition<>(heroes::contains, "hero");
        Condition<MarvelCharacter> villain = new Condition<>(villains::contains, "villain");

        assertThat(capAmerica)
                .is(hero)
                .is(not(villain));
        
        assertThat(loki)
                .is(allOf(villain, hero));
    }
}
