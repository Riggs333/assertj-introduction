package de.codecentric;

import org.assertj.core.api.AbstractAssert;

public class MarvelCharacterHandWrittenAssert
        extends AbstractAssert<MarvelCharacterHandWrittenAssert, MarvelCharacter> {

    public MarvelCharacterHandWrittenAssert(MarvelCharacter actual) {
        super(actual, MarvelCharacterHandWrittenAssert.class);
    }

    public static MarvelCharacterHandWrittenAssert assertThat(MarvelCharacter actual) {
        return new MarvelCharacterHandWrittenAssert(actual);
    }

    public MarvelCharacterHandWrittenAssert hasRealName(String name) {
        isNotNull();

        if (!actual.getRealName().equals(name)) {
            failWithMessage(
                    "Expected character's real name to be <%s>, but it was <%s>",
                    name,
                    actual.getRealName());
        }
        return this;
    }
}
