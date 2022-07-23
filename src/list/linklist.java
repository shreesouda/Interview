package list;

public class linklist {
	
	Node head;
	
	linklist () {
		this.head = null;
	}
	
	public void add (int data) {
		Node temp = new Node(data);
		if (head == null)
			head = temp;
		else {
			Node cur = head;
			while (cur.next != null) 
				cur = cur.next;
			cur.next = temp;
		}
	}
	
	public void display () {
		if (head == null)
			System.out.println("no data");
		else {
			System.out.print("list : ");
			Node cur = head;
			while (cur!= null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
			System.out.println();
		}
	}
	
	/*public Node reverse (Node start, int b) {
		Node cur = start;
		if (start.data == b) {
			cur.next = start.next;
			return start;
		}
		Node temp = reverse(start.next, b);
		start.next.next = start;
		start.next = null;
		return temp;
		
	}*/
	
	//reverse a part of list. can also be done based on position.
	public void reverseseg (int a, int b) {
		int flag = 0;
		Node cur = head;
		Node prev = head;
		while (cur != null) {
			if (cur.data != a) {
				prev = cur;
				cur = cur.next;
			}
			else
				break;
		}
		if (cur == null)
			return;
		if (prev == cur)
			flag = 1;
		Node temp1 = prev;
		Node start = cur;
		cur = cur.next;
		//temp1.next = null;
		while (cur != null) {
			if(cur.data != b)
				cur = cur.next;
			else
				break;
		}
		if (cur == null)
			return;
		Node end = cur;
		Node temp2 = end.next;
		end.next = null;
		Node hd = reverselist(start);
		if (flag != 1)
			temp1.next = hd;
		else
			head = hd;
		while (hd.next != null)
			hd = hd.next;
		hd.next = temp2;
		
	}
	
	//reverse entire list.
	public Node reverselist (Node head) {
		if (head.next == null)
			return head;
		Node temp = reverselist(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
		
	}
	
	public void newlist (linklist list, int d) {
		Node cur = head;
		int num = 0;
		while (cur != null ) {
			num = (num * 10) + cur.data;
			cur = cur.next;
		}
		System.out.println(num + d);
		StringBuffer sb = new StringBuffer(String.valueOf(num + 9));
		sb.reverse();
		System.out.println(sb);
		int temp = Integer.valueOf(sb.toString());
		System.out.println(temp);
		
		while (temp > 0) {
			int l = temp % 10;
			temp = temp / 10;
			list.add(l);
		}
		
	}

	public static void main(String[] args) {
		
		linklist list1 = new linklist();
		linklist list2 = new linklist();
		linklist list3 = new linklist();
		linklist list4 = new linklist();
		
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(4);
		list1.add(9);
		list1.display();
		list1.reverseseg(4, 4);
		//list1.head = list1.reverselist(list1.head);
		list1.display();
		
		/*list1.newlist(list2, 9);
		list2.display();
		
		list3.add(1);
		list3.add(2);
		list3.add(9);
		list3.add(9);
		list3.newlist(list4, 9);
		list4.display();*/

	}

}
