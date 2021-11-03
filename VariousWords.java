package by.overone.lesson21;

import java.util.LinkedHashSet;

/**
 * @author Karina Narbutovich
 */

public class VariousWords {
    private String text;

    public VariousWords(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "VariousWords{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (text == null ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        VariousWords otherVarious = (VariousWords) obj;
        return this.text == otherVarious.text;
    }

    public void wordSeparator() {
        String[] words = text.split(" |\\W |\\b\\.");
        System.out.println("List of words: ");
        for (String word : words) {
            System.out.print(word + ", ");
        }
        System.out.println("\nList of  unique words: ");
        LinkedHashSet<String> LinkHashSet2 = new LinkedHashSet<>();
        for (String word : words) {
            LinkHashSet2.add(word);
        }
        for (String unique : LinkHashSet2) {
            System.out.print(unique + " ");
        }

    }
}
