public class LoopDetection {
    public static void main(String[] args) {
        int[] check = {1,3,4,5};
        LinkedList List = new LinkedList();
        for(int i=0; i< check.length; i++){
            List.append(check[i]);
        }List.CheckLoop();
    }
}class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }Node current = head;
        while(current.next!=null){
            current = current.next;
        }current.next = newNode;
    }public void CheckLoop(){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Loop Detected");
                return;
            }
        }System.out.print("Loop Not Detected");
    }
}
