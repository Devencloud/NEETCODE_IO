class LRUCache {
    class Node{
        int key,val;
        Node prev, next;
        Node(int key, int val){
            this.key = key;
            this.val= val;
        }

    }
    private Map<Integer,Node> map ;
    private int capacity;
    private Node head,tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.val;


        
        
    }
    
    public void put(int key, int value) {
        if(capacity==0){
            return ;
        }
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            remove(node);
            insert(node);
            
        }
        else {
            if(map.size()==capacity){
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
              
                
                
            }
            
            Node n = new Node(key,value);
            insert(n);
            map.put(key,n);
            
        }
        
    }
    public void remove(Node node){
        node.prev.next =node.next;
        node.next.prev = node.prev;

    }
    public void insert(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
