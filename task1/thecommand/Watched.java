package thecommand;

import java.util.Observable;

//被观察者，当状态发生变化时，会传给Watcher
public class Watched extends Observable{
    
    private String time = "";
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        
        if(!this.time.equals(time)){
            this.time = time;
            setChanged();
        }
        notifyObservers();
    }
    
    
}