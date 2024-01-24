package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        ArrayList<String> collect = new ArrayList<String>();
        collect.add("Java");
        collect.add("is");
        collect.add("awesome");

        LinkedList<String> list2 = new LinkedList<>();
        System.out.println("The new linked list is: " + list2);

        list2.add("Learning");
        list2.addFirst("Welcome");
        list2.addLast("DataStructures");

        list2.remove("Learning");
        list2.removeFirst();
        list2.removeLast();

        System.out.println("Updated linked list: " + list2);

        System.out.println("First element: " + list2.getFirst());
        System.out.println("Last element: " + list2.getLast());

        list2.clear();
        System.out.println("Cleared linked list: " + list2);

        LinkedList<String> clonedList = (LinkedList<String>) list2.clone();
        System.out.println("Cloned linked list: " + clonedList);

        System.out.println("Peek: " + list2.peek());
        System.out.println("Peek First: " + list2.peekFirst());
        System.out.println("Peek Last: " + list2.peekLast());

        System.out.println("Size: " + list2.size());

        // Adding more elements for demonstration
        list2.add("Hello");
        list2.add("World");

        System.out.println("Updated linked list: " + list2);

        System.out.println("Element at index 1: " + list2.get(1));
        System.out.println("Element (head not removed): " + list2.element());
    }
}
