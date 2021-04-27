package iterator;

import java.util.Iterator;

public class CharIterator implements Iterator<Character> {

    private final String content;
    private int current;
    public CharIterator(String content) {
        this.content = content;
        current = -1;
    }

    @Override
    public boolean hasNext() {
        int next = current + 1;
        return content.length() > next;
    }

    @Override
    public Character next() {
        current += 1;
        return content.charAt(current);
    }
}
