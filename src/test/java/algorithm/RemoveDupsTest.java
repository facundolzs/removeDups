package algorithm;

import nodeStructure.Node;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveDupsTest {

    @Test
    public void removeDupsTest() {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);

        RemoveDups.removeDups(head);
        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertEquals(3, head.next.next.data);
        assertEquals(4, head.next.next.next.data);

        RemoveDups.removeDups_noAddlMemory(head);
        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertEquals(3, head.next.next.data);
        assertEquals(4, head.next.next.next.data);
    }
}
