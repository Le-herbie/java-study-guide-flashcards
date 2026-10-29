package com.studyguide;

import java.util.Objects;

public class Flashcard {
    private final String term;
    private final String definition;

    public Flashcard(String term, String definition) {
        this.term = term;
        this.definition = definition;
    }

    public String getTerm() {
        return term;
    }

    public String getDefinition() {
        return definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flashcard flashcard = (Flashcard) o;
        return Objects.equals(term, flashcard.term) && Objects.equals(definition, flashcard.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(term, definition);
    }
}
