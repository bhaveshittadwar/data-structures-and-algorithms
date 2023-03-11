public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

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
}
