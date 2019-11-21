public class MyLinkList{
	public static Node bulidLinkedListHand(){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		return n1;
	}
	//遍历
	public static void printLinkedList(Node head){
		Node cur = head;
		while(cur!=null){
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
	//从第三个结点开始打印
	public static void printPartList(Node head){
		Node cur = head;
		for(int i =0;i<2;i++){
			cur = cur.next;
		}
		for(Node n= cur;n!=null;n=n.next){
			System.out.println(n.val);
		}
	}
			
	// 头插
	public static Node pushFront(Node head, int val){
		Node node = new Node(val);
		node.next = head;
		return node;
	}
	//头删
	public static Node popFront(Node head){
		if(head == null){
			throw new RuntimeException("空链表");
		}
		return head.next;
	}
	//尾插
	public static Node pushBack(Node head,int val){
		Node node = new Node(val);
		 if(head == null){
	    //链表中没有结点
			return node;
		 }
		 else{
		//链表中至少有一个结点(找到最后一个结点）
			Node cur = head;
			while(cur.next!= null){
				cur = cur.next;
			}
			cur.next = node;
		 }
		 return head;
	}
	//尾删
	public static Node popBack(Node head){
		// 没有结点
		if(head == null){
			throw new RuntimeException("空链表");
		}
		//只有一个结点
		if(head.next == null){
			return null;
		}
		// 至少有两个结点
		else{
			Node cur = head;
			while(cur.next.next!=null){
				cur = cur.next;
			}
			cur.next = null;
		}
		return head;
	}		
	//逆置链表
	public static Node reverse(Node head){
		Node newHead = null;
		Node cur = head;
		while(cur != null){
			Node next = cur.next;
			cur.next = newHead;
			newHead = cur;	
			cur = next;
		}
		return newHead;
	}
	
	public static void main(String[] args){
		Node head = bulidLinkedListHand();
		// printLinkedList(head);
		// printPartList(head);
        // Node head = null;
		// head = pushFront(head, 0);
		// head = pushFront(head, 1);
		// head = pushFront(head, 2);
		// head = pushFront(head, 3);
		// head = pushFront(head, 4);
		// printLinkedList(head);
		// head = popFront(head);
		// head = popFront(head);
		// printLinkedList(head);
		head = pushBack(head,6);
		printLinkedList(head);
		head = popBack(head);
		head = popBack(head);
		head = popBack(head);
		printLinkedList(head);
		// head = reverse(head);
		// printLinkedList(head);
	}
}
			
			
		