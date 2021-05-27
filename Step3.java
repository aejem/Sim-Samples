import java.util.Vector;

class ListQueue extends OrderedEvent{
    Vector elements = new Vector();

    @Override
    void insert(Comparable g) {
        int i=0;
        while ((i < elements.size()) && ((Comparable) elements.elementAt(i)).compareProcessTime(g)){
            i++;
        }
        elements.insertElementAt(g,i);
    }
    Comparable removeFirst(){
        if(elements.size() == 0)return  null;
        Comparable h = (Comparable)elements.firstElement();
        elements.removeElementAt(0);
        return  h;
    }
   Comparable remove(Comparable g){
        for(int i=0;i<elements.size();i++){
            if (elements.elementAt(i).equals(g)) {
                Object h= elements.elementAt(i);
                elements.removeElement(i);
                return  (Comparable) h;
            }
        }
        return  null;
   }
   public int size(){return elements.size();}
}
