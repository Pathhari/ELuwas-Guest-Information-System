
package e.luwas;

public class NodeData {
       private String Name, ptxt;
       private int IDnum, pnum;
       private NodeData next;
       private NodeData prev;
        
        NodeData(){
            Name = "";
            ptxt = "";
            pnum = 0;
            IDnum = 0;
            next = null;
            prev = null;
        }
        NodeData(String name, int idnum, String pt, int pn, NodeData n, NodeData p){
            Name = name;
            IDnum = idnum;
            ptxt = pt;
            pnum = pn;
            next = n;
            prev = p;
        }
        NodeData(String name, int idnum, String pt, int pn){
            Name = name;
            IDnum = idnum;
            ptxt = pt;
            pnum = pn;
            next = null;
            prev = null;
        }

    public NodeData getPrev() {
        return prev;
    }
    public void setPrev(NodeData p) {
        prev = p;
    }
    public NodeData getNext() {
        return next;
    }

    public void setNext(NodeData n) {
        next = n;
    }
    
     public void setData (String name, int IDNum, String pt, int pn ){
        Name = name;
        ptxt = pt;
        pnum = pn;
        IDnum = IDnum;
    }
    
  

    @Override
    public String toString() {
        return "Name: " + Name +", IDnum: " + IDnum 
               + " " + "Plate Number: " + ptxt + "-" + pnum + "\n";
    }
        
        
}
