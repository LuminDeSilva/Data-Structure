import java.util.Scanner;

public class Stack {

    int maxSize, top;
    char stackArray[];

    Stack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new char[maxSize];
    }

    public void push(char x) {
        if (isFull()) {
            System.out.println("the stack is full");
        } else {
            stackArray[++top] = x;
        } 
    }

    public char pop() {
        char temp = ' ';
        if (isEmpty())
            System.out.println("the stack is Empty");
        else {
            temp = stackArray[top];
            top--;
        }
        return temp;
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void displayS() {
        for (int i = 0; i <= top; i++)
            System.out.print(stackArray[i] + " ");
    }

    public static void main(String args[]) {
        Stack s1 = new Stack(5);

        s1.push('a');
        s1.push('o');
        s1.push('c');
        s1.push('c');
        s1.push('d');

        s1.pop();
        // s1.pop();

        // System.out.println(s1.peek());

        s1.displayS();
        // System.out.println(s1.isEmpty());
        // System.out.println(s1.isFull());

    }
}
