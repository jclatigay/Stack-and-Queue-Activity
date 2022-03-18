
public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void Enqueue(int data) {
        Node temp = new Node(data);

        if (rear == null) {
            front = rear = temp;
        }
        rear.next = temp;
        rear = temp;
    }

    public void Dequeue() {
        if (front == null) {
            System.out.println("Error! Queue is empty.");
        }

        front = front.next;
        //sets the next in queue therefore removing the current
        if (front == null) {
            rear = null;
        }
        
    }
    
}
