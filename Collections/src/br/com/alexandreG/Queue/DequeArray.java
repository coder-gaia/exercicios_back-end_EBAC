/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray {

    public static void main(String[] args) {
        acessingQueue();
        insertingInTheQueue();
        removingFromQueue();

    }

    private static void acessingQueue() {
        System.out.println("***** Accessing *****");
        Deque<String> ad = new ArrayDeque<String>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<String>();
        d.add("Green");
        d.add("Orange");

        ad.addAll(d);

        System.out.println(ad);
        System.out.println(ad.contains("White"));
        System.out.println(d.contains("Brown"));
        System.out.println(d.containsAll(d));

        System.out.println("Output of element: " + ad.element());
        System.out.println("Get first element using getFirst: " + ad.getFirst());
        System.out.println("Get last element using getLast: " + ad.getLast());
        System.out.println("Output of peek: " + ad.peek()); //same as element() and getFirst()
        System.out.println("Get first element using peekFirst: " + ad.peekFirst()); //same as peek(), getFirst() and element()
        System.out.println("Get last element using peekLast: " + ad.peekLast()); //same as getLast()
        System.out.println();
    }

    private static void removingFromQueue() {
        System.out.println("***** Removing *****");
        Deque<String> ad = new ArrayDeque<String>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<String>();
        d.add("Pink");
        d.add("Green");
        d.add("Purple");
        d.add("Orange");
        d.add("Brown");

        ad.addAll(d);
        System.out.println("Elements in the ArrayDeque: " + ad);

        String val = ad.remove();
        ad.remove("Black");

        System.out.println("Elements in the ArrayDeque after remove: " + ad);

        ad.removeFirst();
        ad.removeLast();

        System.out.println("Elements in the ArrayDeque after removeFirst and removeLast: " + ad);

        ad.poll();
        ad.pollFirst();
        ad.pollLast();

        System.out.println("Elements in the ArrayDeque after poll, pollFirst, pollLast: " + ad);

        ad.pop();
        System.out.println("Elements in the ArrayDeque after pop: " + ad);

        ad.retainAll(d);
        System.out.println("Elements in the ArrayDeque after retainAll: " + ad);

        ad.removeAll(d);
        System.out.println("Elements in the ArrayDeque after removeAll: " + ad);
        System.out.println("");
    }

    private static void insertingInTheQueue() {
        System.out.println("***** Inserting *****");

        Deque<String> d = new ArrayDeque<String>();
        d.add("Delhi");
        d.addFirst("Bangalore");
        d.addLast("Chennai");

        System.out.println("Elements in the Deque after add, addFirst and addLast: " + d);

        Deque<String> dq = new ArrayDeque<String>();
        dq.add("Hyderabad");
        dq.add("Trivandrum");

        d.addAll(dq);

        System.out.println("Elements in the Deque after addAll: " + d);

        boolean val = d.offer("Jaipur");
        d.offerFirst("Goa");
        d.offerLast("Mumbai");

        System.out.println("Elements in the Deque after offer, offerFirst and offerLast: " + d);

        d.push("Kolkata");

        System.out.println("Elements in the Deque after push: " + d);
        System.out.println("");
    }
}
