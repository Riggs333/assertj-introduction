package de.codecentric;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.net.URI;

class UriTest implements WithAssertions {

    @Test
    void uri() {
        URI uri = URI.create("http://localhost?myParam=123");
        assertThat(uri)
                .hasParameter("myParam", "123");
    }

}
