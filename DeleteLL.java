import java.util.* ;
public class DeleteLL {
    class Node{
        String data;
        Node next;
        public Node(String data)
        {
            this.data=data;
            this.next=null;
        }

        // Delete First 

        public static void DelFirst()
        {
            if(head==null)
            {
                System.out.println("The list is empty");
                return;
            }
            head = head.next;
        }

        //Delete Last

        public static void DelLast()
        {
            if(head==null)
            {
                System.out.println("The list is empty");
            }

            if(head.next == null)
            {
                head = null;
                return;
            }

            Node seclast = head;
            Node last = head.next;
            while(last != null)
            {
                last = last.next;
                seclast = seclast.next;
            }
            seclast.next = null;
        }

    }
    
}
