package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        list.insertRec(7,5);
        list.display();
    }

}
