package de.codecentric;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class A6_ExceptionTest extends MarvelCharacterTestData implements WithAssertions {

    @Test
    void expectException_StyleA() {
        assertThatThrownBy(() -> grabTheHammer(ironMan))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("You are not worthy");
    }

    @Test
    void expectException_StyleB() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> grabTheHammer(capAmerica))
                .withMessage("You are not worthy");
    }

    @Test
    void convenience_methods() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> grabTheHammer(loki))
                .withMessage("You are not worthy");

        // assertThatIllegalStateException
        // assertThatNullPointerException
        // assertThatIOException
    }

    @Test
    void bdd_style() {
        // given
        ThrowingCallable callable = () -> grabTheHammer(hulk);

        // when
        Throwable thrown = catchThrowable(callable);

        // then
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("You are not worthy");
    }

    private void grabTheHammer(MarvelCharacter character) {
        if (!character.equals(thor)) {
            throw new IllegalArgumentException("You are not worthy");
        }
        System.out.println("Almighty God! You are Thor! :-O");
    }
}
