import javax.swing.tree.TreeNode;
import java.util.Stack;

/*public class BinaryTree{
    public static  int size = 0;
    public static  int leafSize = 0;
   //二叉链
    class Node{
        char val;
        Node left;
        Node right;
        public Node(char val){
            this.val = val;
            left = right = null;
        }
    }
    public void preOrder(Node root) {
        //终止条件：空树
       if(root != null){
            System.out.println(root.val);
            //左子树
            preOrder(root.left);
            //右子树
            preOrder(root.right);
        }
    }



    public void inOrder(Node root){
        if(root!= null){
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public void backOrder(Node root){
        if(root != null){
            backOrder(root.left);
            backOrder(root.right);
            System.out.println(root.val);
        }
    }
    public void getSize1(Node root){
        if(root != null){
            getSize1(root.left);
            getSize1(root.right);
            ++size;
        }
    }
    public  int getSize2(Node root){
        if(root == null){
            return  0;
        }
        if(root.left == null && root.right == null){
            return  1;
        }
        return getSize2(root.left)+getSize2(root.right)+1;
    }
    public void getLeafSize1(Node root){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            ++leafSize;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    public int getLeafSize2(Node root){
        if(root == null)
            return  0;
        if(root.left == null && root.right == null){
            return  1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }
    public  int getLevelSize(Node root,int k){
        if(root == null)
            return  0;
        if(k == 1) {
            return 1;
        }
        return getLevelSize(root.left,k-1)+getLevelSize(root.right,k-1);
    }



    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();//创建对象
        Node root = bTree.buildTree(); //接收返回值
        bTree.preOrder(root);//调用函数
        System.out.println();
        bTree.inOrder(root);
        System.out.println();
        bTree.backOrder(root);
        System.out.println();
        bTree.getSize1(root);
        System.out.println(size);
       int ret = bTree.getSize2(root);
        System.out.println(ret);
        System.out.println(bTree.getLeafSize2(root));
        System.out.println(bTree.getLevelSize(root,3));

    }
}*/
