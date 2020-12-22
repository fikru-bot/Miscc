package simple.java;
//A singly linked list is a type of linked list that is unidirectional, that is, it can be 
//traversed in only one direction from head to the last node (tail). Each element in a linked 
//list is called a node. A single node contains data and a pointer to the next node which helps 
//in maintaining the structure of the list. a singly linked list node contains two fields one is 
//address of next node and second one is data assigned to the present node
//unlike arraylist a LinkedList is a data structure that stores elements in a non-contiguous 
//location. It is a linear data structure.
public class SinglyLinkedList {    
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
        //constructor to create a new node
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
        
    //addNode() will add a new node to the list    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
       
  //addNode to the end
   public void addToEnd(int data) {
    	Node n = new Node(data);
    	if(head == null) {
    		head = n;
    	}
    	else {
    		Node curr = head;
    		while(curr.next != null) {
    			curr = curr.next;
    		}
    		curr.next = n;
    	}
    }
    
   //addNode to the end
   public void addToStart(int data) {
	   Node m = new Node(data);
	   m.next = head;
	   head = m;
   }
   //addNode in between the end
   public void addAfter(int insertAfter, int data) {
	   Node cur = head;
	   
	   while(cur != null) {
		   if(cur.data == insertAfter) {
			   Node v = new Node(data);
			   v.next = cur.next;
			   cur.next = v;
			   break;
		   }
	   }
	   cur = cur.next;
   }
   
   //delete node at the end
   public Node deleteAtTheEnd() {
	   Node cu = head;
	   if(cu == null || cu.next == null) {
		   head = null;
		   return cu;
	   }
	   Node nextNode = cu.next;
	   while(cu.next != null) {
		   if(nextNode.next == null) {
			   cu.next = null;
		   }
		   cu = nextNode;
		   nextNode = nextNode.next;
	   }
	   return cu;
   }
   // delete node at start
   public Node deleteStart() {
	   if(head != null) {
		   Node toDelete = head;
		   head = head.next;
		   return toDelete;
	   }
	   return null;
	   
   }
   //delete node in between 
   public Node deleteAfter(int data) {
	   Node curre = head;
	   Node toDelet = null;
	   while(curre != null) {
		   if(curre.data == data && curre.next != null) {
			   toDelet = curre.next;
			   curre.next = toDelet.next;
			   break;
		   }
		   curre = curre.next;
	   }
	   return toDelet;
   }
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;             
        }    
        System.out.println();    
    }  
    
   
        
    public static void main(String[] args) {    
            
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        //Add nodes to the list  
     
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addToEnd(3);
      
            
        //Displays the nodes present in the list    
        sList.display();    
    }    
}   
