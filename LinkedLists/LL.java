package LinkedLists;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size += 1;
        if(tail == null){
            tail = head;
        }
    }

    public int getNodeVal(int n){
        int count = 0;
        Node temp = head;
        while(count < n){
            temp = temp.next;
            count++;
        }
        return temp.val;
    }

    public Node getNode(int n){
        int count = 0;
        Node temp = head;
        while(count < n){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public void insertLast(int val){
        Node node = new Node(val);

        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;      
    }

    public void insertAtPos(int val, int pos){
        int count = 1;
        if(head == null) {
            insertFirst(val);
            return;
        }
        if(pos == 0){
            insertFirst(val);
            return;
        }
        if(pos == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        while(count < pos && temp.next != null) {
            temp = temp.next;
            count++;
        }
        temp.next = new Node(val, temp.next);
        size += 1;
    }

    public void insertRec(int val, int index){
            Node temp = head;
            insertRecursion(val, index, temp);
    }

    private void insertRecursion(int val, int index, Node temp){
        if(index == 1){
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            size += 1;
            return;
        }
        insertRecursion(val, index- 1, temp.next);
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List empty");
            return;
        }
        head = head.next;
        size -= 1;
    }

    public void deleteLast(){
        if(head == null || tail == null){
            System.out.println("List empty");
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size -= 1;
    }

    public void deleteAtPos(int pos){
        if(pos == 0) {
            deleteFirst();
            return;
        }
        if(pos == size - 1) {
            deleteLast();
            return;
        }
        Node temp = head;
        int count = 1;
        while(count < pos){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        size -= 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println("\nSize is : " + size);
    }
    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col){
        if(row == 0)
            return;
        if(col < row){
            Node first = getNode(col);
            Node second = getNode(col + 1);
            if(first.val > second.val){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail){
                    Node prev = getNode(col - 1);
                    tail = first;
                    second.next = tail;
                    prev.next = second;
                    first.next = null;
                }
                else{
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }
        else{
            bubbleSort(row - 1, 0);
        }
    }


    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    private void reverseList(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.display();
        list.bubbleSort(list.getSize() - 1,  0);
        list.display();
    }

    public Node reverseBetween(Node head, int left, int right) {
        if(left == right)
            return head;
        Node cur = head;
        Node prev = null;
        for (int i = 0; cur != null && i < left - 1; i++) {
            prev = cur;
            cur = cur.next;
        }

        Node last = prev;
        Node newEnd = cur;
        Node next = cur.next;
        for(int i = 0;cur != null && i < right - left + 1; i++){
            cur.next = prev;
            prev = cur;
            cur= next;
            if(next != null)
                next = next.next;
        }
        if(last != null)
            last.next = prev;
        else
            head = prev;
        newEnd.next = cur;
        return head;
    }
}
