package e.luwas;

import javax.swing.JOptionPane;

public class visitorList {
    private NodeData head;
    private NodeData tail;
    public int size;
    
    visitorList(){
        head = new NodeData();
        tail = new NodeData();
        tail.setPrev(head);
        head.setNext(tail);
        size = 0;
    }
    
     public void add (int index, NodeData nodeNew ){
        
        int counter=0;
        NodeData nNav = head; 
       
        while (counter < index && nNav.getNext() != tail){
            nNav = nNav.getNext();
            counter++;            
        }
        
        NodeData temp=nNav.getNext();
        
        nodeNew.setNext(temp);
        nodeNew.setPrev(nNav);
        temp.setPrev(nodeNew);
        nNav.setNext(nodeNew);
        size++;
    }
    
    public void add (NodeData newNode){
        add (size,newNode);
    }
       public NodeData getNode1(int index) {
     
        int counter = 0;
        NodeData nNav = head; 
       
        while (counter < index && nNav.getNext() != tail){
            nNav = nNav.getNext();
            counter++;            
        }
        return nNav;
    }
    
    public NodeData getNode (int idx) {
        return getNode (idx,0,size);
    }
    private NodeData getNode (int idx, int lower, int upper){
        NodeData p;
       
        if (idx < lower || idx > upper)
            throw new IndexOutOfBoundsException();
        if (idx < size/2){
            p = head.getNext();
            for(int i=0; i< idx; i++)
                p = p.getNext();
        }
        else{
            p = tail;
            for (int i=size; i> idx; i--)
                p = p.getPrev();
        }
        return p;
    } 
    public String PrintList(){
        
       String NodeListStr="";   
       NodeData nNav = head; 
       if(nNav != null){ 
        while (nNav.getNext() != tail){ 
            nNav = nNav.getNext();           
            NodeListStr += nNav.toString(); 
        }
        
       JOptionPane.showMessageDialog(null, NodeListStr);
       } else {
       System.out.println("Empty List");
       }
        return NodeListStr;                
    }
    
    
    public int getSize(){
        return size;
    }
 

}