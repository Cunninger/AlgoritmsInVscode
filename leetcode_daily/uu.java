package leetcode_daily;

import java.util.HashMap;

class LRUCache {
    public class Node {
        public int key;
        public int value;
        public Node prev;
        public Node next;

        public Node(int k, int v) {
            key = k;
            value = v;
        }

    }

    public class doubleLinkedList {
        public Node head;
        public Node tail;

        public doubleLinkedList() {
            head = null;
            tail = null;
        }

        public void addLast(Node newNode) {
            if (newNode == null)
                return;
            // 链表为空
            if (this.head == null && this.tail == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.next = newNode;
                newNode.prev = this.tail;
                this.tail = newNode;

                if (this.head == null) {
                    this.head = newNode;
                }
            }
        }

        public Node removeHead() {
            // 删除并返回节点的值
            if (this.head == null)
                return null;
            Node res = this.head;
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = res.next;
                res.next = null;
                this.head.prev = null;

            }
            return res;

        }

        public void moveToTail(Node newNode) {
            if (newNode == this.tail) {
                return;
            }

            if (this.head == newNode) {
                this.head = newNode.next;
                this.head.prev = null;
            } else {
                newNode.prev.next = newNode.next;
                newNode.next.prev = newNode.prev;
            }
            // 统一处理 需要移动节点的出度

            newNode.prev = this.tail;
            newNode.next = null;

            // 处理尾节点
            this.tail.next = newNode;
            this.tail = newNode;

        }

    }

    private HashMap<Integer, Node> keyNodeMap;
    private doubleLinkedList nodeList;
    private final int capacity;

    public LRUCache(int capacity) {
        keyNodeMap = new HashMap<>();
        nodeList = new doubleLinkedList();
        this.capacity = capacity;

    }

    public int get(int key) {

        if (keyNodeMap.containsKey(key)) {
            Node res = keyNodeMap.get(key);
            nodeList.moveToTail(res); // 更新最近操作，把该节点存放到双向链表的尾部
            return res.value;
        }
        return -1;

    }

    public void put(int key, int value) {

        if (keyNodeMap.containsKey(key)) {
            Node res = keyNodeMap.get(key);
            res.value = value;
            nodeList.moveToTail(res);
        } else {
            // 以前没出现过
            if (keyNodeMap.size() == capacity) {
                removeUnused();
            }

            Node newNode = new Node(key, value);
            keyNodeMap.put(key, newNode);
            nodeList.addLast(newNode);
        }
    }

    public void removeUnused() {
        Node removeNode = nodeList.removeHead();
        keyNodeMap.remove(removeNode.key);
    }
}
