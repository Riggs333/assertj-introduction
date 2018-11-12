package de.codecentric;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class A5_ComparableTest implements WithAssertions {

    @Test
    void compareNumbers() {
        assertThat(10)
                .isGreaterThan(1)
                .isLessThan(20)
                .isEqualByComparingTo(10);
    }

    @Test
    void compareStrings() {
        // We do not want to rely on String#compareTo here

        assertThat("infinity")
                .usingComparator(String::compareToIgnoreCase)
                .isEqualTo("INFINITY");

        assertThat("Stan Lee")
                .usingComparator((o1, o2) -> o1.length() - o2.length())
                .isEqualTo("John Doe");
    }
}
