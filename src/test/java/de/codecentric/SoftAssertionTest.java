package de.codecentric;

import org.assertj.core.api.JUnitJupiterSoftAssertions;
import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.assertj.core.api.Assertions.assertThat;

class SoftAssertionTest {

// JUnit 4 way
//    @Rule
//    public final JUnitSoftAssertions softly = new JUnitSoftAssertions();

    @RegisterExtension
    JUnitJupiterSoftAssertions softly =
            new JUnitJupiterSoftAssertions();

    @Test
    void junitWay() {
        Assertions.assertAll(
                () -> assertThat("foo").isEqualTo("bar"),
                () -> assertThat("bam").isEqualTo("baz")
        );
    }

    @Test
    void collectAllErrors_Using_SoftAssertions() {
        String foo = "foo";

        softly.assertThat(foo).isEqualTo("bar");
        softly.assertThat(foo).hasSize(4);
    }
}
