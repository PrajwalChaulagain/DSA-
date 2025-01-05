import java.util.HashMap;

public class LRUCaching {
    //node start
    public static class Node{
        int k;
        int v;
        Node next;
        Node prev;
        Node(int key, int value){
            this.k = key;
            this.v = value;
            this.next=this.prev=null;
        }
    }
    //end of node 

    int capacity;
    HashMap<Integer,Node> map;
    LRUCaching(int capacity){
        this.capacity = capacity;
        map=new HashMap<>();
    }

    void put(int key, int value){
        
        if(map.containsKey(key)){
            //remove assiociated node and 
            //key from both linked list and hashmap
            remove(map.get(key));
        }
        if(map.size()==capacity){
            //caching is full
            //remove last node or remove tail
            remove(dummytail.prev);
            //implement LFU caching for task ||
        }
        Node newnode=new Node(key, value);
        insert(newnode);

    }

    Node dummyhead=new Node(key:0, value:0);
    Node dummytail=new Node(key:0, value:0);
    void insert(Node newNode){
        map.put(newNode.k, newNode);
        if(dummyhead.next==null){
            newNode.prev=dummyhead;
            newNode.next=dummytail;
            dummyhead.next=newNode;
            dummytail.prev=newNode;

        }
        else{
            newNode.next=dummyhead.next;
            dummyhead.next.prev=newNode;
            newNode.prev=dummyhead;
            dummyhead.next=newNode;
        }

    }

    int get(int key){
        Node node=map.get(key);
        if(node!=null){
            //remove node
            remove(node);
            //re insert same node in head first
            insert(node);
            return node.v;
        }
        return -1;
    }
    void remove(Node node){
        map.remove(node.k);
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=node.prev=null;
    }
}