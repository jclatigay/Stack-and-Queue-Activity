public class Node {
    public Node next;
    public int Data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Node(int data) {
        Data = data;
        next = null;
    }
}
