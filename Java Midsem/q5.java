interface StackADT {
    void push(int element);
    int pop();
    boolean isEmpty();
    boolean isFull();
}

class ArrayStack implements StackADT {
    int[] stack;
    int top;
    int capacity;

    ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element) {
        if (isFull()) throw new StackOverflowError("Stack is full");
        stack[++top] = element;
    }

    public int pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return stack[top--];
    }

    public boolean isEmpty() { return top == -1; }

    public boolean isFull() { return top == capacity - 1; }
}

public class StackMain {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
    }
}
