package task1;

import java.util.Observable;

//���۲��ߣ���״̬����仯ʱ���ᴫ��Watcher
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