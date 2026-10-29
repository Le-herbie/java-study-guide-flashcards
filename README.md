# Java Study Guide Flashcards

A terminal-based Java flashcard app for studying core object-oriented programming and Java concepts.

## Features
- Randomized flashcard order using a true shuffle before each review session
- Enter to reveal the answer
- `k` to mark a card as known
- `u` to mark a card as missed
- `n` to skip to the next card
- `q` to quit the session
- Final score summary at the end

## Run it

```bash
mvn clean compile exec:java -Dexec.mainClass=com.studyguide.StudyGuideApp
```

If `exec-maven-plugin` is not installed, you can compile and run directly:

```bash
mvn clean package
java -jar target/java-study-guide-flashcards-1.0.0.jar
```

## Notes
The deck is built from your Java/OOP vocabulary list and is randomized as closely as possible using a shuffled order with no repeats.
