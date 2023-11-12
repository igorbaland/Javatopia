package com.bal.advanced.collectionsframework.iterable.collectioninterface.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterfaceDemo {
    /*
    Every queue is collection as well. We use queues in situation where we want to process jobs based on the order we
    receive them.
    Queue<E>
        > subinterfaces
            > BlockingDequeue<E>
            > BlockingQueue<E>
            > Deque<E>
            > Transfer<E>
            these are for special purposes and chance  we are not going to use them for the most of our career.

        > implementing classes the most use
            > ArrayDeque
                deck is short for double ended queue. It's special type of queue that has two ends. Items can enter the
                queue  from each end. This is different from the queue that we have in real life. For example, when we
                go into queue for a concert or a movie, we always enter the queue from the back. With double ended
                queue or dx, items can enter either end
            > PriorityQueue
                It is special type of Queue, where each items get a priority. This priority determines the position of
                this item in the queue. Items with higher priority move to the front of the queue. A common application
                of this is the queue that our operating system uses to manage processes. Some processes have a higher
                priority, they get more CPU time.
            > ...

    Difference between add() and offer()
    The difference depends on the implementation of the queue that we are using.
        > In case of an ArrayDeque, there is no difference, but in some implementation, the queue might have a
            > limited size. In those cases, if the queue gets for the add() method throws an exception, where is the
            offer method returns false, its kind of less aggressive.

    Difference between peek() and element()
        > peek returns null if empty
        > element throws an exception
            > NoSuchElementException

    Difference between remove() and poll()
        > poll() > returns null if the queue is empty
        > remove()  > throws an exception

     */
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");

        queue.poll();
//        queue.remove();     //remove the item at the front of the queue and return the removed item
//        var front = queue.peek();   //get the first index, peek (comp > nachsehen)
//        queue.offer("d");   //another method for adding queues
        System.out.println(queue);
    }
}
