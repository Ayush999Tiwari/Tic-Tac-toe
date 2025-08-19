public class Linkedlist {
    private node head;
    private node tail;
    private int size;
    public Linkedlist(){ // default constructor
        this.size=0;
    }
    public void insertFirst(int val){
        node  node= new  node(val);
        node.next= head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        node node= new node(val);
        tail.next =node;
        tail=node;
        size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        node temp=head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        node node= new node(val,temp.next);
        temp.next=node;
        size++;
    }
    public int deleteFirst(){
        int  val=head.value;
         head=head.next;
         if(head==null){
             tail=null;
         }
         size--;
         return val;
    }
    public node get(int index){
        node node=head;
        for(int i =0; i<index; i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        node Secondlast=get(size-2);
        int val=tail.value;
        tail=Secondlast;
        tail.next=null;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.print("END");
    }
    private class node{
        private int value;
        private node next;
        private node(int value){
            this.value= value;
        }
        public node(int value,node next){
            this.value=value;
            this.next= next;
        }
    }
}
