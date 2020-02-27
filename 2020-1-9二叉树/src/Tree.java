import java.util.Stack;

public class Tree {
    class Node {
        char val;
        Node left;
        Node right;

        public Node(char val) {
            this.val = val;
            left = right = null;
        }
    }

    //递归前序遍历
    public static void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //非递归前序遍历
    public static void preOrderno(Node root) {
        Stack<Node> st = new Stack<>();
        Node curNode = root;
        while (curNode != null || !st.isEmpty()) {
            while (curNode != null) {
                System.out.println(curNode.val + " ");
                st.push(curNode);
                curNode = curNode.left;
            }
            curNode = st.pop();
            curNode = curNode.right;
        }
    }

    //递归中序遍历
    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    //非递归中序遍历
    public static void inOrderno(Node root) {
        Stack<Node> s = new Stack<>();
        Node curNode = root;
        while (curNode != null || !s.isEmpty()) {
            while (curNode != null) {
                s.push(curNode);
                curNode = curNode.left;
            }
            curNode = s.pop();
            System.out.println(curNode.val);
            curNode = curNode.right;

        }
    }
    //递归后序遍历
    public static void postOrder(Node root){
       if(root != null){
           postOrder(root.left);
           postOrder(root.right);
           System.out.println(root.val);
       }
    }
    //非递归后序遍历
    public static void postOrderno(Node root) {
        Stack<Node> s = new Stack<>();
        Node curNode = root;
        Node prev = null;
        while (curNode != null || !s.isEmpty()) {
            while (curNode != null) {
                s.push(curNode);
                curNode = curNode.left;
            }
            curNode = s.peek();
            if (curNode.right == null || curNode.right == prev) {
                System.out.println(curNode.val);
                prev = curNode;
                 s.pop();
                 curNode = null;
            }
            else{
                curNode = curNode.right;
            }
        }
    }


    public Node buildTree(){
        Node root  = new Node('A');
        Node node1 = new Node('B');
        Node node2 = new Node('C');
        Node node3 = new Node('D');
        Node node4 = new Node('E');
        Node node5 = new Node('F');
        Node node6 = new Node('G');
        Node node7 = new Node('H');
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.right = node7;
        node2.left = node5;
        node2.right = node6;
        return  root;
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.buildTree();
        preOrder(root);
        System.out.println( );
        preOrderno(root);
        System.out.println( );
        inOrder(root);
        System.out.println( );
        inOrderno(root);
        System.out.println( );
        postOrder(root);
        System.out.println( );
        postOrderno(root);
        System.out.println( );
    }
}

