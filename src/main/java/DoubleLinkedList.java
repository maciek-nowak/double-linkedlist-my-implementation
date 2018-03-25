public class DoubleLinkedList {
    private Node head;
    private int size = 0;

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(newNode);
            newNode.setPrevious(currentNode);
        }

        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode.getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        Node previousNode = currentNode.getPrevious();
        Node nextNode = currentNode.getNext();

        if (currentNode == head) {
            this.head = nextNode;
        }

        if (previousNode != null) {
            previousNode.setNext(nextNode);
        }

        if (nextNode != null) {
            nextNode.setPrevious(previousNode);
        }

        size--;
    }

    public static void main(String[] args) {
        DoubleLinkedList myList = new DoubleLinkedList();
        myList.add(8);
        myList.add(12);
        myList.add(84);
        myList.remove(1);
    }
}
