package stack;

public class CustomStack extends stack{

    public CustomStack(){
        super();
    }
    public CustomStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
             int[] temp = new int[data.length * 2];
             for(int i = 0; i < data.length; i++)
                 temp[i] = data[i];
             data = temp;
            System.out.println("New array created");
        }
        return super.push(item);
    }

    public static void main(String[] args) {
        stack dynamicStack = new CustomStack(5);
        dynamicStack.push(10);
        dynamicStack.push(20);
        dynamicStack.push(30);
        dynamicStack.push(40);
        dynamicStack.push(50);
        dynamicStack.push(60);

        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
    }
}
