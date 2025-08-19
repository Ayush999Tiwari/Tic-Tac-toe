public class DLL {
    public class Node{
       private Node head;
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val =val;
        }
        public Node(int val,Node next,Node prev){
            this.next = next;
            this.val=val;
            this.prev=prev;
        }
        public void insertFirst(int val){
            Node node=new Node(val);
            node.next=head;
            node.prev=null;
            if(head!=null){
                head.prev=node;
            }
            head=node;

        }
        public void interlast(int val){
            Node node =new Node(val);
            Node last= head;
            if(head==null){
                node.prev=null;
                head=node;
                return;
            }
            while(last.next!=null){
                last=last.next;
            }

        }
        public void display(){
            Node node=head;
            while(node!=null){
                System.out.println(node.val+"->");
                node=node.next;
            }
            System.out.println();
        }

    }
}
