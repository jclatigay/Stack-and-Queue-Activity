public class Demo {
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
		stack.Push(34);
		stack.Push(234);
		stack.Push(536);
		stack.Push(985);

		stack.Print();

		System.out.printf("\nElement on top of the stack is %d\n", stack.Peek());

		stack.Pop();
		stack.Pop();

		stack.Print();

		System.out.printf("\nElement on top of the stack is %d\n", stack.Peek());

        Queue q = new Queue();

        q.Enqueue(23);
        q.Enqueue(45);
        q.Dequeue();
        q.Dequeue();
        q.Enqueue(65);
        q.Enqueue(78);
        q.Enqueue(94);
        q.Enqueue(99);
        q.Dequeue();
        q.Dequeue();

        System.out.println("\nElement at front the of queue is : " + q.front.Data);
        System.out.println("Element at the rear is : " + q.rear.Data);

    }
}
