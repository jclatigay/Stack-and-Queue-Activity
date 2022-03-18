public class Demo {
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
		stack.Push(11);
		stack.Push(22);
		stack.Push(33);
		stack.Push(44);

		stack.Print();

		System.out.printf("\nTop element is %d\n", stack.Peek());

		stack.Pop();
		stack.Pop();

		stack.Print();

		System.out.printf("\nTop element is %d\n", stack.Peek());

        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Dequeue();
        q.Dequeue();
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Dequeue();
        System.out.println("Queue Front : " + q.front.Data);
        System.out.println("Queue Rear : " + q.rear.Data);

    }
}
