package algorithm;

import java.util.HashSet;
import nodeStructure.Node;

public class RemoveDups {

    /**
     * Time Complexity: O(n) - Space Complexity: O(n).
     *
     * @param head (first node in the list)
     */
    public static void removeDups(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        HashSet set = new HashSet();
        Node current = head;
        set.add(current.data);

        while (current != null && current.next != null) {
            if (!set.add(current.next.data)) { // returns true if data is added; false if data already exists
                current.next = current.next.next;
            }

            current = current.next;
        }
    }

    /**
     * Follow-up: same method but without using addt'l memory. Time Complexity: O(n^2) - Space Complexity: O(1).
     *
     * @param head(first node in the list)
     */
    public static void removeDups_noAddlMemory(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node current1 = head;

        while (current1 != null && current1.next != null) {
            Node current2 = current1;

            while (current2 != null && current2.next != null) {
                if (current2.next.data == current1.data) {
                    current2.next = current2.next.next;
                } else {
                    current2 = current2.next;
                }
            }

            current1 = current1.next;
        }
    }

}
