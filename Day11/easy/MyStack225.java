import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack225 {

    class MyStack {

        Queue<Integer> queue;


        public MyStack() {
            queue = new LinkedList<Integer>();
        }

        public void push(int x) {
            queue.add(x);
            for (int i = 1; i < queue.size(); i++)
                queue.add(queue.remove());
        }

        public int pop() {

            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

}
