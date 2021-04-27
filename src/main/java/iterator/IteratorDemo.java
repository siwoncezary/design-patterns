package iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = List.of("ALA", "ADAM", "EWA");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String current = iterator.next();
            System.out.println(current);
        }
        Iterator<Character> characterIterator = new CharIterator("ABCDEF");
        while(characterIterator.hasNext()){
            System.out.println(characterIterator.next());
        }
    }
}
