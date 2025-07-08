import java.util.*;
import java.util.LinkedList;

public class RightLeftView {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeT('A');
        tree.root.left = new NodeT('B');
        tree.root.right = new NodeT('C');
        tree.root.left.left = new NodeT('D');
        tree.root.left.right = new NodeT('E');
        tree.root.left.right.left = new NodeT('F');
        tree.root.left.right.right = new NodeT('G');
        tree.root.left.right.left.left = new NodeT('H');
        tree.root.left.right.left.right = new NodeT('J');
        tree.root.right.left = new NodeT('J');
        tree.root.right.right = new NodeT('K');
        tree.root.right.right.right = new NodeT('L');
        tree.root.right.right.right.left = new NodeT('M');
        tree.root.right.right.right.right = new NodeT('N');
        System.out.println("Right View: ");
        tree.RightView(tree.root);
        System.out.println();
        System.out.println("Left View: ");
        tree.LeftView(tree.root);
    }
}
class NodeT{
    char data;
    NodeT left, right;
    public NodeT(char data){
        this.data = data;
        left = right = null;
    }
}class BinaryTree{
    NodeT root;
    public void RightView(NodeT Node){
        if(Node==null){
            return;
        }
        System.out.print(Node.data+" ");
        RightView(Node.right);
    }public void LeftView(NodeT Node){
        if(Node==null){
            return;
        }
        System.out.print(Node.data+" ");
        RightView(Node.left);
    }
}
