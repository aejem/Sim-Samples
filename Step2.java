import java.util.Random;

abstract class Event extends AbstractEvent {
    Random random = new Random();
    int time = (int) random.nextInt();

    @Override
    public boolean compareProcessTime(Comparable h) {
        Event ev = (Event) h;
        return this.time < ev.time;
    }
}
class Simulator extends AbstractSimulator{
    int time;
    void generateProcess(){
        Event ev;
        while((ev=(Event) events.removeFirst())!=null){
            time = ev.time;
            ev.executeSim(this);
        }
    }
}


