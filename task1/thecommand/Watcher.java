package thecommand;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer{
    
    public Watcher(Observable o){
        o.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
    	
        String timeString = ((Watched)o).getTime() ;
        System.out.println("执行任务时间为：" + ((Watched)o).getTime());
        
        //充当Client 里面的内容，用命令模式
        Receiver receiver = new Receiver(timeString) ;
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Input input = new Input(command);
        //执行方法
        input.action();
    }

}
