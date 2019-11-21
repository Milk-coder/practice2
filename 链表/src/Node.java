public class Node {
    int val;
    Node next;
    Node(Node next , int val){
        this.next = next;
        this.val = val;
    }
    Node(int val){
        this(null,val);
    }
    @Override
    public String toString() {
        return String.format("Node(%d)",val);
    }
}
