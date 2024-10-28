package collections.linkedList;

public class MyLinkedList {

    private LinkedListNode head = null;

    public MyLinkedList() {

    }

    public void insert(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (this.head == null) {
            head = newNode;
        } else {
            LinkedListNode currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void insertHead(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void insertAt(int index, int data) {
        LinkedListNode nodeToBeInserted = new LinkedListNode(data);
        LinkedListNode node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        nodeToBeInserted.setNextNode(node.getNextNode());
        node.setNextNode(nodeToBeInserted);
    }

    public void deleteNodeAt(int index) {
        LinkedListNode node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
    }

    public void display() {
        if (head != null) {
            LinkedListNode currentNode = head;
            while (currentNode.getNextNode() != null) {
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }


}
