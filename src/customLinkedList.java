public class customLinkedList {

    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public int indexOf(int value) {
        int index = 0;
        var currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return index;
            } else {
                index++;
                currentNode = currentNode.next;
            }
        }
        return -1;

    }

    public boolean contains(int value) {
        int number = indexOf(value);
        if (number != -1) {
            return true;
        }
        return false;
    }

}
