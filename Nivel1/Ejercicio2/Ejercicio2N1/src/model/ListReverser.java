package model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListReverser {

    public List<Integer> reverse(List<Integer> original) {
        List<Integer> reversed = new ArrayList<>();

        ListIterator<Integer> iterator = original.listIterator(original.size());

        while (iterator.hasPrevious()) {
            reversed.add(iterator.previous());
        }

        return reversed;
    }

}
