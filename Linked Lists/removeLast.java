public class removeLast {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public int size() {
            return size;
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else {
                if (size == 1) {
                    head = tail = null;
                } else {
                    Node temp = head;
                    for (int i = 0; i < size - 2; i++) {
                        temp = temp.next;
                    }
                    temp.next = null;
                    tail = temp;
                }
                size--;
            }
        }
    }
}
