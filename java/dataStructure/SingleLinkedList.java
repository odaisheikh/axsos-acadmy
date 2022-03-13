public class SingleLinkedList {
    public Node head ;
    public SingleLinkedList(int value){
        this.head = new Node(value);
    }
    public SingleLinkedList(){
        this.head = null;
    }
    public void addValue(int value){
        if(this.head == null){
            this.head = new Node(value);
        }
        else{
            Node runner ;
            runner =head;
            while(runner.next!= null){
                runner = runner.next;
            }
            runner.next = new Node(value);
        }
    }
    public void Print(){
        if(this.head == null){
            System.out.println("it is empty");
        }
        else{
            Node runner ;
            runner =head;
            while(runner!= null){
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }
    public int removeEnd(){
        if(this.head==null){
            return 0;
        }
        
        else if(this.head.next==null){
            this.head=null;
            return 0;
        }
        else{
        Node runner ;
        Node prev = head;
        runner = head.next;
        while(runner.next!=null){
            runner = runner.next;
            prev = prev.next;
        }
        prev.next = null;
        return runner.value;
    }
        }
    
}
