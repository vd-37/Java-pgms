package stack;

public class stack {

    private static final int DEFAULT_SIZE = 10;
    int head = -1;
    protected int[] data;

    public stack(int size){
        this.data = new int[size];
    }

    public stack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            data[++head] = item;
            return true;
        }
    }

    public boolean isFull() {
        return head == data.length -1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return data[head--];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public int peek(){
        if(head < 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        return data[head];
    }
    public static void main(String[] args) {
        stack s1 = new stack(5);
        System.out.println(s1.pop());
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        System.out.println(s1.pop());
        System.out.println(s1.peek());
    }
}
