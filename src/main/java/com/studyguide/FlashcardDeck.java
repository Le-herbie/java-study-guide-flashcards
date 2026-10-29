package com.studyguide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FlashcardDeck {
    private final List<Flashcard> cards;
    private final Random random;
    private int index;

    public FlashcardDeck(List<Flashcard> cardList) {
        this.cards = new ArrayList<>(cardList);
        this.random = new Random();
        this.index = 0;
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards, random);
        index = 0;
    }

    public boolean hasNext() {
        return index < cards.size();
    }

    public Flashcard drawNext() {
        if (!hasNext()) {
            return null;
        }
        return cards.get(index++);
    }

    public int size() {
        return cards.size();
    }
}
