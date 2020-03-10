import java.util.Scanner;

public class 删除链表中重复节点 {

    public static ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null) return pHead;
        ListNode HEad=new ListNode(0);
        HEad.next = pHead;
        ListNode p=HEad;
        ListNode px=HEad.next;
        while(px!=null){

            if (px.next!=null&&px.val==px.next.val) {
                while (px.next!=null&&px.val == px.next.val) {
                    px = px.next;
                }
                p.next = px.next;
                px = px.next;
            }else{
                p=p.next;
                px=px.next;
            }
        }
        return HEad.next;
    }
}
