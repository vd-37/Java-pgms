package LinkedLists;

public class BubbleSort {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(1);
        list.display();
//        list.bubbleSort(list.getSize() -1, 0);
    }
}
