package leetcode_daily;

import java.util.HashMap;


public class LRU {
    public static class Node<K,V> {
        public K key;
        public V value;

        public Node<K,V> prev;
        public Node<K,V> next;

        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }


    public static class NodeDoubleLinkedList<K,V>{
        private Node<K,V> head;
        private Node<K,V> tail;

        public NodeDoubleLinkedList(){
            head = null;
            tail = null;
        }

        public void addLast(Node<K,V> newNode){
            if (newNode == null){
                return;
            }
            if (head == null){// 如果链表为空
                head = newNode;
                tail = newNode;
            }
            else{// 链表不为空，尾插法
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }

        }

        public void moveNodeToTail(Node<K,V> node){
            if (this.tail == node){
                // 如果访问的节点本来就是尾节点，不需要移动
                return;
            }

            if (this.head == node){
                // 如果访问的节点是头节点
                this.head = node.next;// 换头
                this.head.prev = null;// 头节点的前驱为空
            }else{
                // 如果访问的是中间节点
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            // 统一处理 需要移动节点的后继和前驱

            node.prev = this.tail;// 前驱指向原来的尾节点
            node.next = null;// 后继为空
            this.tail.next = node;// 原来的尾节点的后继指向新的尾节点
            this.tail = node;// 尾节点更新为新的尾节点
        }

        // 删除头节点的作用是：如果缓存满了，就删除头节点，然后再添加新的节点
        public Node <K,V> removeHead() {
            if (this.head == null){
                // 如果链表为空，返回空
                return null;
            }
            Node<K,V> res = this.head; // 保存环境

            if (this.head == this.tail){
                // 如果链表只有一个节点
                this.head = null;
                this.tail = null;
            }

            else{
                // 如果链表不止一个节点
                this.head = res.next;
                res.next = null;
                this.head.prev = null;
            }
            return res;
        }


        public static class MyCache<K,V> {
            private HashMap<K,Node<K,V>> keyNodeMap;
        

            private NodeDoubleLinkedList<K,V> nodeList;

            private final int capacity;

            public MyCache(int cap){
                keyNodeMap = new HashMap<K, Node<K, V>>();

                nodeList = new NodeDoubleLinkedList<K, V>();

                capacity = cap;

            }

            public V get(K key){
                if (this.keyNodeMap.containsKey(key)){
                    Node<K,V> res = keyNodeMap.get(key);// O(1)
                    nodeList.moveNodeToTail(res);       // O(1)
                    // 哈希Map 和 双向链表通过 Node 节点建立联系
                    return res.value; 
                }
                return null;


            }

            public void put(K key, V value){
                if (keyNodeMap.containsKey(key)){
                    Node<K,V> node  = keyNodeMap.get(key);
                    node.value = value;
                    nodeList.moveNodeToTail(node);

                }else{
                    if (keyNodeMap.size() == capacity){
                        // 如果缓存满了
                        removeMostUnusedCache();
                    }
                    Node<K,V> newNode = new Node<K,V>(key,value);
                    keyNodeMap.put(key, newNode);
                    nodeList.addLast(newNode);
    
                }
            }

            private void removeMostUnusedCache(){
                Node<K,V> removeNode = nodeList.removeHead();
                keyNodeMap.remove(removeNode.key);
            }// 头删，并在Map中删除对应的键值对

            
        }


    }
    public static void main(String[] args) {
        NodeDoubleLinkedList.MyCache<String,Integer> testCache = new NodeDoubleLinkedList.MyCache<String,Integer>(3);
        testCache.put("A",1);
        testCache.put("B",2);
        testCache.put("C",3);
        System.out.println(testCache.get("B"));
        System.out.println(testCache.get("A"));
        testCache.put("D",4);
        System.out.println(testCache.get("D"));
        System.out.println(testCache.get("C"));
    }

}
// 解题流程：
// 1.定义一个双向链表，链表中的每一个节点都是一个Node<K,V>类型的节点，Node<K,V>中有key和value两个属性
// 2.定义一个哈希Map，key是K类型，value是Node<K,V>类型
// 3.定义一个缓存容量capacity
// 4.定义一个MyCache<K,V>类，这个类中有一个构造方法，构造方法中有三个属性，分别是哈希Map，双向链表，缓存容量
// 5.定义一个get方法，如果哈希Map中包含这个key，就返回这个key对应的value，同时将这个key对应的Node<K,V>节点移动到链表的尾部
// 6.定义一个put方法，如果哈希Map中包含这个key，就更新这个key对应的value，同时将这个key对应的Node<K,V>节点移动到链表的尾部
// 7.如果哈希Map中不包含这个key，就判断哈希Map的大小是否等于缓存容量，如果等于，就删除链表的头节点，同时在哈希Map中删除这个key
// 8.然后在链表的尾部添加一个新的Node<K,V>节点，同时在哈希Map中添加这个key和Node<K,V>节点



