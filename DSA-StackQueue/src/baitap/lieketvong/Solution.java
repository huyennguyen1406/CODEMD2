package baitap.lieketvong;

public class Solution {
    private final Queue queue = new Queue();
    public void enQueue (int data) {
        Node node = new Node(data);
        if (queue.font == null) {
            queue.font = node;
        } else {
            queue.rear.link = node;
        }
        queue.rear = node;
        queue.rear.link = queue.font;
    }

    public Node deQueue() {
        Node node = null;
        if (queue.font != null) {
            node = queue.font;
            if (queue.font.equals(queue.rear)) {
                queue.font = null;
                queue.rear = null;
            } else {
                queue.font = queue.font.link;
                queue.rear.link = queue.font;
            }
        }
        return node;
    }

    public void displayQueue() {
        Node temp = queue.font;
        do {
            System.out.println(temp.data);
            temp = temp.link;
        }
        while (temp.link != queue.font.link);
    }
}
