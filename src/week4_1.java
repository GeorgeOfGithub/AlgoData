import java.util.Scanner;

public class week4_1 {

    public static class Node {
        public Node next;
        public int key;

        public Node(int key){
            next = null;
            this.key = key;
        }  

    }


    public static class LinkedList {
        private Node head;
        private Node tail;

        public LinkedList(){
            this.head = null;
            this.tail = null;
        }

        public void pushFront(int key) {
            Node n = new Node(key);


            if(this.head == null) {
                this.head = n;
                this.tail = n;
            } else {
                n.next = this.head;
                this.head = n;
            }
        }

        public void pushBack(int key) {
            Node n = new Node(key);

            if(this.head == null) {
                this.head = n;
                this.tail = n;
            } else {
                this.tail.next = n;
                this.tail = n;
            }

        }

        public int pop(){
            if(this.head == null){
                System.out.println(0);
            }
            int res = this.head.key;
            if(this.tail == this.head){
                this.tail = null;
                this.head = null;
            } else {
                this.head = this.head.next;
            }
            return res;
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        LinkedList l = new LinkedList();

        for(int i = 0; i<N; i++) {
            String op = input.next();
            if(op.equals("PU")){
                l.pushFront(input.nextInt());
            } else {
                System.out.println(l.pop());
            }
        }

        input.close();
        
    }


}