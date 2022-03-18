public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public void Push(int data) {
        Node node = new Node(data);

        node.Data = data;
    
        node.next = top;
    
        top = node;
    }

    public void Pop() {
        if (top == null) {
            System.out.println("Stack has no elements");
        }
        top = top.next;
    }


    public int Peek() {
        if (top != null) {
			return top.Data;
		}
		else {
			System.out.println("Stack has no elements");
			return 0;
		}
    }

    public void Print()
	{
		if (top == null) {
			System.out.println("Stack has no elements");
		}
		else {
			Node temp = top;
			while (temp != null) {

				System.out.printf("%d->", temp.Data);

				temp = temp.next;
			}
		}
	}

}
