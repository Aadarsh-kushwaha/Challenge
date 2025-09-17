package Day35;

public class print {
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);//create new node
        if(head==null){
            head=tail=newNode;
            size++ ;
            return ;
        }
        newNode.next =head;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);//create new node
         if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail = newNode;
        size++;


    }
    
public void print(){
    Node temp = head ;
    if(head==null){
        System.out.println("Empty ll");
        return ;
    }
    while(temp!=null){
        System.out.print(temp.data + "--->");
        temp = temp.next;
    }
    System.out.println("NULL");
}

public void add(int idx,int data){
    if(idx==0){
        addFirst(data);
        return ;
    }
    Node newNode = new Node(data);
    Node temp = head ; 
    int i = 0;
    while(i<idx-1){
        temp = temp.next;
        i++;
    }
    newNode.next= temp.next;
    temp.next = newNode;
        size++;


}

    public static void main(String[] args) {
        print ll = new print();
        ll.addFirst(2);
      //   System.out.println(ll.size);

        ll.addFirst(1);
       //  System.out.println(ll.size);

        ll.addLast(3);
         //System.out.println(ll.size);

        ll.addLast(4);
         //System.out.println(ll.size);

       ll.print();
       ll.add(2, 9);
          ll.print();
          System.out.println(ll.size);

    }
}
