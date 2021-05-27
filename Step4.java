import java.util.Collection;
import java.util.Queue;

class Process extends Event{
    private final String processName;
    Process(int time, String processName){
        this.time = random.nextInt(time) +1;
        this.processName=processName;
    }

    @Override
    void executeSim(AbstractSimulator simulator) {
        System.out.println(processName +" - "+time );

    }
}

class ProcessSimulator extends Simulator{
    public static void main(String[] args) {
        new ProcessSimulator().start();
    }
    void start(){
        events = new ListQueue();
        // create 5 processes with different random time arrival
        insert(new Process(100,"P1"));
        insert(new Process(100,"P2"));
        insert(new Process(100,"P3"));
        insert(new Process(100,"P4"));
        insert(new Process(100,"P5"));

        int T=0;
        System.out.println("At T = "+T+" Event Queue:");

        generateProcess();
        System.out.println();


    }

}
