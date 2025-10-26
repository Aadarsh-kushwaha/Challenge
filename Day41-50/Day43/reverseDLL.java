package Day43;

public class reverseDLL {
    public static void main(String[] args) {
        Node prev =null;
        Node curr =head ;
        Node next  ;
        while(curr !=null){
            next = curr.next;
            curr.next = prev ;
            curr.prev = next ;
             
            prev = curr ;
            curr = next ;
        }
        head = prev ;
        

    }
}
