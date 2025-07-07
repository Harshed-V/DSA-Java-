import java.util.*;

public class MergeList{
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {5, 6, 7, 8, 9};
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        for(int ele:list1){
            ll1.append(ele);
        }for(int ele:list2){
            ll2.append(ele);
        } LinkedList merged = LinkedList.listMerge(ll1, ll2);
        merged.printList();
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}class LinkedList{
    Node Head;
    public void append(int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head = newNode;
            return;
        }Node current = Head;
        while (current.next!=null){
            current = current.next;
        }current.next = newNode;
    }
    public static LinkedList listMerge(LinkedList ll1, LinkedList ll2){
        LinkedList merged = new LinkedList();
        Node current1 = ll1.Head;
        Node current2 = ll2.Head;
        while(current1!=null){
            merged.append(current1.data);
            current1 = current1.next;
        }while(current2!=null){
            merged.append(current2.data);
            current2 = current2.next;
        }return merged;

    }public void printList() {
        Node current = Head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
