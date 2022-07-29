public class template_For_Linked_List {
    class Linkedlist{
        Node Head ;
        class Node{
            int data ;
            Node next ;
            Node(int data){
                this.data = data ;
                this.next = null ;
            }
        }

        public void addLast(int data){
            Node n = new Node(data);
            if (Head == null){
                Head = n ;
            }
            Node lastnode = Head ;
            while (lastnode.next != null){
                lastnode = lastnode.next ;
            }
            lastnode.next = n ;
            n.next = null ;
        }

        public void addFirst(int data){
            Node n = new Node(data);
            if (Head == null){
                Head = n ;
            }
            Node x = Head ;
            Head = n ;
            Head.next = x ;
        }

        public void removeF(){
            Head.next = Head ;
        }

        public void removeL(){
            Node last = Head ;
            while(last != null){
                last = last.next ;
            }

        }
    }
}
