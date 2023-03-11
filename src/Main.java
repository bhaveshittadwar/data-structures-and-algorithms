public class Main { 
    public static void main(String[] args) throws Exception {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        System.out.println(sLL.head.value);
        System.out.println(sLL.tail.value);
    }
}
