class LRUCache {
    class Node{
        int key,val;
        Node prev,next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;
    private int capacity;
   

   

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;

       
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node n = map.get(key);
        remove(n);
        insert(n);
        return n.val;
       


        
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            n.val = value;
            remove(n);
            insert(n);
        }
        else{
            if(map.size()==capacity){
                Node n = tail.prev;
                map.remove(n.key);
                remove(n);
            }
            Node n = new Node(key,value);
            insert(n);
            map.put(key,n);

        }
       
        
        
    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
      

    }
    public void insert(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;

    }
    
}

