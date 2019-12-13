class Node {
    char value;
    Node left;
    Node right;
     public Node(char value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }
}
//前序遍历//ABDEHCFG
public class BinaryTree {
    public  static int size = 0;
    public  static int leafsize = 0;
    public void preOrder(Node root) {
        //终止条件
        if (root == null) {
            return;
        } else {
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历//DBEHAFCG
    public void middleOrder(Node root) {
        if (root != null) {
            middleOrder(root.left);
            System.out.println(root.value);
            middleOrder(root.right);
        }
    }

    //后序遍历//DHEBFGCA
    public void backOrder(Node root) {
        if (root != null) {
            backOrder(root.left);
            backOrder(root.right);
            System.out.println(root.value);
        }
    }

    //遍历思路求结点个数
    public void getSize1(Node root) {
        if (root != null) {
            getSize1(root.left);
            getSize1(root.right);
            size++;
        }
    }

    public int getsize2(Node root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return getsize2(root.left) + getsize2(root.right) + 1;
        }
    }
    //叶子的数目
    public void getLeafSize1(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            leafsize++;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);

    }

    public int getLeafSize2(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;
        return getLeafSize2(root.left) + getLeafSize2(root.right);

    }

    //获取第k层的结点数
    public int getSize(Node root, int k) {
        if (root == null)
            return 0;
        if (k == 1)
            return 1;
        return getSize(root.left, k - 1) + getSize(root.right, k - 1);
    }

    public Node buildTree() {
        Node root = new Node('A');
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
        node2.left = node5;
        node2.right = node6;
        node4.right = node7;
        return root;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree();
        tree.preOrder(root);
        System.out.println();
        tree.middleOrder(root);
        System.out.println();
        tree.backOrder(root);
        System.out.println();
        tree.getSize1(root);
        System.out.println(BinaryTree.size);
        System.out.println(tree.getsize2(root));
        tree.getLeafSize1(root);
        System.out.println(BinaryTree.leafsize);
        System.out.println(tree.getLeafSize2(root));
        System.out.println(tree.getSize(root,3));
        System.out.println(tree.getSize(root,2));

    }
}