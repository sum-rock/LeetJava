from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(
        self,
        l1: Optional[ListNode],
        l2: Optional[ListNode],
    ) -> Optional[ListNode]:

        dummy = ListNode()
        current = dummy
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            sum = val1 + val2 + carry
            new_val = sum % 10
            carry = sum // 10

            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None

            current.val = new_val
            if l1 or l2 or carry:
                new_node = ListNode()
                current.next = new_node
                current = new_node

        return dummy
