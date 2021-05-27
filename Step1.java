interface Comparable {
    boolean compareProcessTime(Comparable h);
}
abstract class AbstractEvent implements Comparable{
    abstract void executeSim(AbstractSimulator simulator);
}
abstract class OrderedEvent{
    abstract void insert(Comparable g);
    abstract Comparable removeFirst();
    abstract int size();
    abstract Comparable remove(Comparable g);
}
class AbstractSimulator{
    OrderedEvent events;
    void insert(AbstractEvent ev){
        events.insert(ev);
    }
    AbstractEvent cancel(AbstractEvent ev){
        throw new java.lang.RuntimeException("Method Not implemented");
    }
}
