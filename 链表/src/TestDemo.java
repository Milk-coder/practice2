public class TestDemo {
    // 逆置链表
//    public static Node reverse(Node head){
//        Node cur = head;
//        Node newhead = null;//新建一个链表，newhead 为第一个结点
//        while(cur!=null){
//            Node node = cur.next;
//            cur.next = newhead;
//            newhead = cur;
//            cur = node;
//        }
//        return newhead;
//    }
    //合并两个有序链表
    public static Node comList(Node List1,Node List2){
        if(List1 == null){
            return List1;
        }
        if(List2 == null){
            return List2;
        }
        Node cur1 = List1;
        Node cur2 = List2;
        Node nHead = null;
        Node nLast = null;
        while(cur1!= null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                if (nHead == null) {
                    nHead = cur1;
                } else {
                    nLast.next = cur1;
                }
                nLast = cur1;
                cur1 = cur1.next;
            } else {
                if (nHead == null) {
                    nHead = cur2;
                } else {
                    nLast.next = cur2;
                }
                nLast = cur2;
                cur2 = cur2.next;
            }
        }
        if(cur1!= null) {
            nLast.next= cur1;
        }
        else{
            nLast.next = cur2;
        }
        return nHead;
    }
    //链表分割
    public  static Node partition(Node head,int x) {
        Node cur = head;
        Node sHead = null;
        Node sLast = null;
        Node bHead = null;
        Node bLast = null;
        while (cur != null) {
            if (cur.val < x) {
                if (sHead == null) {
                    sHead = cur;
                }
                else {
                    sLast.next = cur;
                }
                sLast = cur;
            }
            else {
                if (bHead == null) {
                    bHead = cur;
                } else {
                    bLast.next = cur;
                }
                bLast = cur;
            }
            cur = cur.next;
        }
        if(sHead == null){
            return bHead;
        }
        if(bHead == null){
            return sHead;
        }
        sLast.next = bHead;
        bLast.next = null;
        return sHead;
    }
    //寻找链表中间结点（两种方法）
//    public static Node middleNode(Node head){
//        Node cur = head;
//        int count = 0;
//        while(cur!= null){
//           count++;
//           cur = cur.next;
//        }
//        int middle = count/2;
//        Node result = head;
//        for(int i = 0; i<middle;i++ ){
//            result = result.next;
//        }
//        return result;
//    }

    private static void printList(Node head){
        for(Node cur = head; cur!= null;cur = cur.next){
            System.out.println(cur);
        }
    }
    //判断链表是否为回文结构
    public static Node getMiddle(Node head){
        Node cur = head;
        int count = 0;
        while(cur!= null){
            cur = cur.next;
            count++;
        }
        int middle = count/2;
        Node result = head;
        for(int i = 0; i<middle;i++ ){
            result = result.next;
        }
        return result;
    }
    public static Node reverse(Node head){
        Node cur = head;
        Node newHead = null;
        while(cur!= null){
            Node next = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = next;
        }
        return  newHead;
    }
    public static boolean chkPalindrome(Node A) {
        Node middle = getMiddle(A);
        Node node = reverse(middle);
        Node c1 = A;
        Node c2 = node;
        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(n5, 6);
        Node n3 = new Node(n4, 2);
        Node n2 = new Node(n3, 8);
        Node n1 = new Node(n2, 1);
        Node head = partition(n1,4);
        printList(head);
//        Node m3 = new Node(13);
//        Node m2 = new Node(m3,9);
//        Node m1 = new Node(m2,6);
//
//        Node result = comList(n1, m1);
//        printList(result);
    }
}
