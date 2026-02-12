package main;

import model.ListGenerator;
import model.ListPrinter;
import model.ListReverser;

import java.util.List;

public class Main {
    static void main(String[] args) {
        ListGenerator generator = new ListGenerator();
        ListReverser reverser = new ListReverser();
        ListPrinter printer = new ListPrinter();

        List<Integer> list1 = generator.createList();
        List<Integer> list2 = reverser.reverse(list1);

        printer.print("Elements of list1 in original order", list1);
        printer.print("Elements of list2 in reverse order", list2);
    }
}
