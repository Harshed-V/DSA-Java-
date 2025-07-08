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
        System.out.println("Right View Using Level Method");
        tree.RightViewlevel(tree.root);
        System.out.println();
        System.out.println("Left View Using Level Method");
        tree.LeftViewlevel(tree.root);
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
    public void RightViewlevel(NodeT node){
        ArrayList<Character>RV = new ArrayList<>();
        Queue<NodeT> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i = 0; i < level; i++){
                NodeT temp = q.poll();
                if(i == level-1){
                    RV.add(temp.data);
                }if(temp.left !=null) q.offer(temp.left);
                if(temp.right !=null) q.offer(temp.right);
            }
        }for(int i =0;i<RV.size();i++){
            System.out.print(RV.get(i)+" ");
        }
    }public void LeftViewlevel(NodeT node){
        ArrayList<Character>RV = new ArrayList<>();
        Queue<NodeT> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i = 0; i < level; i++){
                NodeT temp = q.poll();
                if(i == 0){
                    RV.add(temp.data);
                }if(temp.left !=null) q.offer(temp.left);
                if(temp.right !=null) q.offer(temp.right);
            }
        }for(int i =0;i<RV.size();i++){
            System.out.print(RV.get(i)+" ");
        }
    }
}
