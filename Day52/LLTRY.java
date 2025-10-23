/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode temp1=l1;
ListNode temp2=l2;
int ans1,ans2;
ans1=ans2=0;
int s1=0;
int s2=0;

while(temp1!=null){
     ans1 += (int)(temp1.val * Math.pow(10, s1));

       temp1 = temp1.next;
    s1++;
}

while(temp2!=null){
    ans2 += (int)(temp2.val * Math.pow(10, s2));
    temp2 = temp2.next;
    s2++;
}
int sum = ans1+ans2;
   // Edge case: if sum is 0
        if (sum == 0) return new ListNode(0);

ListNode dummy = new ListNode(0); // dummy node to start
ListNode tail = dummy; 
  while(sum!=0){
    int r = sum%10;
    tail.next = new ListNode(r);
    sum=sum/10;
    tail=tail.next;
  }

        return dummy.next;
    }
}/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode temp1=l1;
ListNode temp2=l2;
int ans1,ans2;
ans1=ans2=0;
int s1=0;
int s2=0;

while(temp1!=null){
     ans1 += (int)(temp1.val * Math.pow(10, s1));

       temp1 = temp1.next;
    s1++;
}

while(temp2!=null){
    ans2 += (int)(temp2.val * Math.pow(10, s2));
    temp2 = temp2.next;
    s2++;
}
int sum = ans1+ans2;
   // Edge case: if sum is 0
        if (sum == 0) return new ListNode(0);

ListNode dummy = new ListNode(0); // dummy node to start
ListNode tail = dummy; 
  while(sum!=0){
    int r = sum%10;
    tail.next = new ListNode(r);
    sum=sum/10;
    tail=tail.next;
  }

        return dummy.next;
    }
}