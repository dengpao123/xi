import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 翻转链表 {
    public ListNode ReverseList(ListNode head) {
        if (head==null)
            return null;
        ListNode pre=null;
        ListNode last=null;
        while (head!=null){
            last=head.next;
            head.next=pre;
            pre=head;
            head=last;
        }
        return last;
    }

}
