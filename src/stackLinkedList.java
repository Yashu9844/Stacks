public class stackLinkedList {

    public static class Node{
        int data;
          Node  next;


        public Node(int data){
            this.data = data;
            this.next = null;
        }}
    public  static Node head = null;
        public static class Stacka{


            public  boolean isEmpty(){
                return  head == null;
            }
            public   void push(int data){
                Node newNode = new Node(data);

                if(isEmpty()){
                    head = newNode;
                    return;
                }

                newNode.next = head;
                head = newNode;
            }

            public int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            public int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }

        }

        public static void main(String[] args) {


        Stacka s =new Stacka();


            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            while(!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }


}}
