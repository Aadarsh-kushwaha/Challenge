

package Day37;

public class search {
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
            size++ ;
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


    public int removeF(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeL(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE ;

        } else if (size==1){
            int val = head.data ; 
            head = tail=null;
            size =0;
            return val;
        }
        Node prev = head ;
        for(int i =0;i<size-2;i++){
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail=prev ;
        size--;
        return val;
    }

    public int ItrSearch(int key){  //o(n)
        Node temp = head;
        int i=0;
        while(temp !=null){
            if(temp.data ==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key is not available
        return -1;


    }

    public int helper(Node head , int key){
        if(head ==null){
            return -1;
        }
        if(head.data ==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx +1;
    }

    public int recursiveSearch(int key){
        return helper(head,key);

    }




    public static void main(String[] args) {
        search ll = new search();
      
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
         ll.addLast(5);
        ll.addLast(6);
        
        ll.print();
        System.out.println(ll.recursiveSearch(45));

    }
}
