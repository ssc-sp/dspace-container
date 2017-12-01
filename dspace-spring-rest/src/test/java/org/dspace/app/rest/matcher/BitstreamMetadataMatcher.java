package org.dspace.app.rest.matcher;

import org.hamcrest.Matcher;

import java.util.UUID;

import static com.jayway.jsonpath.matchers.JsonPathMatchers.hasJsonPath;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class BitstreamMetadataMatcher {

    public static Matcher<? super Object> matchTitle(String title) {
        return allOf(
                hasJsonPath("$.key", is("dc.title")),
                hasJsonPath("$.value", is(title))
        );
    }

    public static Matcher<? super Object> matchDescription(String description) {
        return allOf(
                hasJsonPath("$.key", is("dc.description")),
                hasJsonPath("$.value", is(description))
        );
    }
}
