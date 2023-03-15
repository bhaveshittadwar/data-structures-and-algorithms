public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  // Create Single Linked List
  public Node createSinglyLinkedList(int nodeValue) {
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  // Insert a node to the Linked List
  public void insertInLinkedList (int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    // Check if LL is created
    if(head == null) {
      createSinglyLinkedList(nodeValue);
      return;
    }
    // Insert at the beginning
    if (location == 0) {
      node.next = head;
      head = node;
    } else if (location >= size) {
      // Insert at the end
      node.next = null;
      tail.next = node;
      tail = node;
      return;
    } else {
      // Insert in between
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      Node nextNode = tempNode.next;
      tempNode.next = node;
      node.next = nextNode;
    }
    
    // Increase the size for every case
    size++;
  }

  // Single Linked List Traversal
  public void traverseSingleList() {
    if (head == null) {
      System.out.println("SLL does not exist");
      return;
    }

    Node tempNode = head;
    String result = "";
    while (tempNode != null) {
      result += tempNode != tail ? tempNode.value + " -> " : "" + tempNode.value; 
      tempNode = tempNode.next;
    }
    System.out.println(result);
  }

  // Search a Node by value
  public boolean searchNode(int key) {
    if (head == null) {
      System.out.println("SLL does not exist");
      return false;
    }

    int cnt = -1;

    Node tempNode = head;
    while (tempNode != null) {
      cnt++;
      if (tempNode.value == key) {
        System.out.println("Found the key at location: " + cnt);
        return true;
      }
      tempNode = tempNode.next;
    }
    System.out.println("Key not found");
    return false;
  }
}
