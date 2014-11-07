package task1;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer{
    
    public Watcher(Observable o){
        o.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
    	
        String timeString = ((Watched)o).getTime() ;
        System.out.println("ִ������ʱ��Ϊ��" + ((Watched)o).getTime());
        
        //�䵱Client ��������ݣ�������ģʽ
        Receiver receiver = new Receiver(timeString) ;
        //������������趨��Ľ�����
        Command command = new ConcreteCommand(receiver);
        //���������ߣ�������������ý�ȥ
        Input input = new Input(command);
        //ִ�з���
        input.action();
    }

}
