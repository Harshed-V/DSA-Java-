import java.util.*;
import java.util.LinkedList;

public class LevelOrderTreeTraversal {
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
        tree.levelOrder(tree.root);
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
    public void levelOrder(NodeT root){
        Queue<NodeT> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            NodeT current = q.poll();
            System.out.print(current.data+" ");
            if(current.left!=null)q.offer(current.left);
            if (current.right != null) q.offer(current.right);
        }

    }
}
